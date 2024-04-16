package com.example.TpBuenSabor.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

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
