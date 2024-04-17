package com.example.TpBuenSabor.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FacturaVenta {
    private Date fechaFacturacion;
    private int numeroComprobante;
    private Enum FormaPago;
    private BigDecimal subTotal;
    private BigDecimal descuento;
    private BigDecimal gastosEnvio;
    private BigDecimal totalVenta;
}
