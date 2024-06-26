package com.example.TpBuenSabor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ArticuloManufacturadoDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double Cantidad;

    @ManyToOne
    @JoinColumn(name = "articulo_insumo_id", nullable = false)
    private ArticuloInsumo articuloInsumo;
}
