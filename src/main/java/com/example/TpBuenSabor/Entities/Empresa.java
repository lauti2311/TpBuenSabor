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
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String razonSocial;
    private int cuil;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "empresa_id")
    private List<SucursalEmpresa> sucursales;
}
