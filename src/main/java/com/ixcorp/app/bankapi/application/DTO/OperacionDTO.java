package com.ixcorp.app.bankapi.application.DTO;


import java.util.Date;

public class OperacionDTO {

    private long operacionId;

    private Date fechaEmision;

    private double monto;


    private  TipoOperacionDTO operacionDTO;

    private  ClienteDTO clienteDTO;

    private CuentaDTO cuentaDTO;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public long getOperacionId() {
        return operacionId;
    }

    public void setOperacionId(long operacionId) {
        this.operacionId = operacionId;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public TipoOperacionDTO getOperacionDTO() {
        return operacionDTO;
    }

    public void setOperacionDTO(TipoOperacionDTO operacionDTO) {
        this.operacionDTO = operacionDTO;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    public CuentaDTO getCuentaDTO() {
        return cuentaDTO;
    }

    public void setCuentaDTO(CuentaDTO cuentaDTO) {
        this.cuentaDTO = cuentaDTO;
    }
}
