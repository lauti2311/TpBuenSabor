package com.example.TpBuenSabor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ArticuloInsumo {
    private String denominacion;
    private double precioCompra;
    private double precioVenta;
    private Boolean esParaElaborar;
}
