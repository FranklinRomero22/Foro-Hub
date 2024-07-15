package foro.alura.api.topico;

import jakarta.validation.constraints.NotBlank;

public record DatoListadoTopico(
        Long id,
        String mensaje,
        String nombreCurso,
        String titulo
) {
    public DatoListadoTopico(Topico topico){
        this(topico.getId(),topico.getMensaje(), topico.getNombreCurso(), topico.getTitulo());
    }
}
