package foro.alura.api.topico;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    private String nombreCurso;
    private String titulo;
    private Boolean activo;

    public Topico(DatosRegistroTopicos datosRegistroTopicos) {
        this.activo = true;
        this.mensaje = datosRegistroTopicos.mensaje();
        this.nombreCurso = datosRegistroTopicos.nombreCurso();
        this.titulo = datosRegistroTopicos.titulo();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if(datosActualizarTopico.nombreCurso() != null){
            this.nombreCurso = datosActualizarTopico.nombreCurso();
        }
        if(datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
    }

    public void desactivarTopico() {
        this.activo = false;
    }
}
