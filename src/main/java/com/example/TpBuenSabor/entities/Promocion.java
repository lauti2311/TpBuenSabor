package com.example.TpBuenSabor.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Promocion {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private double descuento;
}
