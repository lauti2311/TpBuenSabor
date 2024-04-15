package com.example.TpBuenSabor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PedidoVenta {
    private Date horaEstimadaFinalizacion;
    private BigDecimal subtotal;
    private BigDecimal descuento;
    private BigDecimal gastosEnvio;
    private BigDecimal total;
    private BigDecimal totalCosto;
    private Enum estado;
    private Enum tipoEnvio;
    private Enum formaPago;
    private LocalDate fechaPedido;
}
