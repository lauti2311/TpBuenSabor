package com.example.TpBuenSabor.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ArticuloManufacturado {
    private String denominacion;
    private String descripcion;
    private double precioVenta;
    private double precioCompra;
    private Integer tiempoEstructurado;

    public void stockCalculado(){

    }

    public double precioCostoCalculado(){
        return 0;
    }
}

