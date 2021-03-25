package com.srvw.sse.domain.articulo;

import java.security.InvalidParameterException;

import com.srvw.sse.codaz.Inspeccionable;

public class Cancamo extends Cadena
{
    private static final long serialVersionUID = -6830153594625317735L;
    private Integer metricaTornillo;
    private Boolean soldable = false;
    
    public Cancamo(String subFamilia, String subSubFamilia) throws InvalidParameterException
    {
        super(subFamilia, subSubFamilia);
        raizSubSubFamilia = "5";
    }

    /******************************************
     * NO GENERADO, NO TOCAR
     ******************************************/
    public void setSoldable(Boolean soldable)
    {
        if( soldable == null )
        {
            this.soldable = Boolean.FALSE;
            return;
        }
        
        this.soldable = false;
        
        if( soldable )
        {
            metricaTornillo = 0;
            this.soldable = soldable;
        }
    }
    
    /******************************************
     * FIN NO GENERADO, NO TOCAR
     ******************************************/
    
    public Integer getMetricaTornillo()
    {
        return metricaTornillo;
    }

    public void setMetricaTornillo(Integer metricaTornillo)
    {
        if(metricaTornillo != null )
        {
            this.metricaTornillo = metricaTornillo;
        }
    }

    public Boolean getSoldable()
    {
        return soldable;
    }

    public String getCodigo()
    {
        return getFamilia() + getSubFamilia() + getSubSubFamilia() + Inspeccionable.getTipo(getTipo()) + Inspeccionable.getDiametro(getMetricaTornillo().doubleValue()) + Inspeccionable.getTonelaje(getTonelaje()) + getProveedor();
    }
    
}
