package com.ixcorp.app.bankapi.dto;

import java.util.Date;

public class CuentaDTO {
    private Long cuentaId;

    private Date fechaApertura;

    private String  numeroCuenta;

    private String numeroCci;

    public Long getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(Long cuentaId) {
        this.cuentaId = cuentaId;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCci() {
        return numeroCci;
    }

    public void setNumeroCci(String numeroCci) {
        this.numeroCci = numeroCci;
    }
}
