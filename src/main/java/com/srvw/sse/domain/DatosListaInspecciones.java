package com.srvw.sse.domain;

import java.io.Serializable;
import java.util.Date;

public class DatosListaInspecciones implements Serializable
{
    private static final long serialVersionUID = 5837869598228692482L;

    private int id;
    private String inspector;
    private Date fechaInicio;
    private Date fechaFin;
    private String observaciones;
    private boolean tieneOportunidadesDeMejora;
    private boolean autoInspeccion;
    
    public DatosListaInspecciones()
    {
        super();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getInspector()
    {
        return inspector;
    }

    public void setInspector(String inspector)
    {
        this.inspector = inspector;
    }

    public Date getFechaInicio()
    {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio)
    {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin()
    {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin)
    {
        this.fechaFin = fechaFin;
    }

    public String getObservaciones()
    {
        return observaciones;
    }

    public void setObservaciones(String observaciones)
    {
        this.observaciones = observaciones;
    }

    public boolean isTieneOportunidadesDeMejora()
    {
        return tieneOportunidadesDeMejora;
    }

    public void setTieneOportunidadesDeMejora(boolean tieneOportunidadesDeMejora)
    {
        this.tieneOportunidadesDeMejora = tieneOportunidadesDeMejora;
    }

    public boolean isAutoInspeccion()
    {
        return autoInspeccion;
    }

    public void setAutoInspeccion(boolean autoInspeccion)
    {
        this.autoInspeccion = autoInspeccion;
    }
    
}
