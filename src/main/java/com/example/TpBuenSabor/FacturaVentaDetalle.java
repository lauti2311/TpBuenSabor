package com.example.TpBuenSabor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FacturaVentaDetalle {
    private Integer cantidad;
    private BigDecimal subTotal;
}
