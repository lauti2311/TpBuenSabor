package com.example.TpBuenSabor.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ArticuloInsumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denominacion;
    private double precioCompra;
    private double precioVenta;
    private Boolean esParaElaborar;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imagen_insumo_id", referencedColumnName = "id")
    private ImagenInsumo imagenInsumo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unidad_medida_id", referencedColumnName = "id")
    private UnidadMedida unidadMedida;

    @OneToMany(mappedBy = "articuloInsumo", cascade = CascadeType.ALL)
    private List<ArticuloManufacturadoDetalle> articuloManufacturadoDetalle;
}
