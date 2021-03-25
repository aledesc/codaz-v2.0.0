package com.srvw.sse.domain.articulo;

import com.srvw.sse.codaz.Inspeccionable;

public abstract class ElementoCadenaXDiametro extends Cadena
{
    /**
     * 
     */
    private static final long serialVersionUID = -495119978500068232L;
    private Double diametro;
    
    public ElementoCadenaXDiametro(String subFamilia, String subSubFamilia) 
    {
        super(subFamilia, subSubFamilia);
    }

    public final Double getDiametro()
    {
        return diametro;
    }

    public final void setDiametro(Double diametro)
    {
        this.diametro = diametro;
    }
    
    public final String getCodigo()
    {
        return getRaiz() + Inspeccionable.getTipo(getTipo()) + Inspeccionable.getDiametro(getDiametro()) + Inspeccionable.getTonelaje(getTonelaje()) + getProveedor();
    }
    
    
}
