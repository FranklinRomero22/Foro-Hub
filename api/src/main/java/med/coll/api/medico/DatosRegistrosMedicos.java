package med.coll.api.medico;

import  med.voll.api.medico.Especialidad;
import  med.voll.api.direccion.DatosDireccion;

public record DatosRegistrosMedicos(
        String nombre,
        String email,
        String documento,
        Especialidad especialidad,
        DatosDireccion direccion
) {
}
