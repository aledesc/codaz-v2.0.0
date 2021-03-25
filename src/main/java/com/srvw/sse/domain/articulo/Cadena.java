package com.srvw.sse.domain.articulo;

import java.io.Serializable;

import com.srvw.sse.codaz.Inspeccionable;

public abstract class Cadena extends Inspeccionable implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 5945107995864017576L;

    private String tipo;
    private Integer tonelaje;
    
    public Cadena(String subFamilia, String subSubFamilia)
    {
        super("C",subFamilia,subSubFamilia);
        raizFamilia = "C(8|1|R|X|E)";
    }

    
    public final Integer getTonelaje()
    {
        return tonelaje;
    }

    public final void setTonelaje(Integer tonelaje)
    {
        this.tonelaje = tonelaje;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
}
