package com.example.TpBuenSabor.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Empleado {
    private String nombre;
    private String apellido;
    private String telefono;
    private String emil;
    private Rol perfil;
}
