package com.srvw.sse.domain.articulo;

import java.security.InvalidParameterException;

import com.srvw.sse.codaz.Inspeccionable;

public class Grillete extends Cadena
{
    /**
     * 
     */
    private static final long serialVersionUID = 2496347705138163937L;
    private Double diametroBulon;
    
    public Grillete(String subFamilia, String subSubFamilia) throws InvalidParameterException
    {
        super(subFamilia, subSubFamilia);
        raizSubSubFamilia = "3";
    }

    public Double getDiametroBulon()
    {
        return diametroBulon;
    }

    public void setDiametroBulon(Double diametroBulon)
    {
        this.diametroBulon = diametroBulon;
    }

    public String getCodigo()
    {
        return getRaiz() + Inspeccionable.getTipo(getTipo()) + Inspeccionable.getDiametro(getDiametroBulon()) + Inspeccionable.getTonelaje(getTonelaje()) + getProveedor();
    }
    
}
