package com.ixcorp.app.bankapi.domain;

import javax.persistence.*;

@Entity
@Table(name = "tipo_operacion")
public class TipoOperacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_opera_id")
    private long tipoOperacionId;

    @Column(name =  "descripcion")
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
