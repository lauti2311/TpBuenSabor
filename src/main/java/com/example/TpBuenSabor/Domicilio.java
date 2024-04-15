package com.example.TpBuenSabor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Domicilio {
    private String calle;
    private Integer numero;
    private Integer cp;
}
