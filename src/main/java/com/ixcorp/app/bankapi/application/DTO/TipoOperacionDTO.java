package com.ixcorp.app.bankapi.application.DTO;


public class TipoOperacionDTO {
    private long tipoOperacionId;

    private String descripcion;

    public long getTipoOperacionId() {
        return tipoOperacionId;
    }

    public void setTipoOperacionId(long tipoOperacionId) {
        this.tipoOperacionId = tipoOperacionId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
