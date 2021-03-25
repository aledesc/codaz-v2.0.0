package com.srvw.sse.domain.articulo;

import java.security.InvalidParameterException;

import com.srvw.sse.codaz.Inspeccionable;

public class EslingaCadena extends Cadena
{
    /**
     * 
     */
    private static final long serialVersionUID = -9085100172910308845L;
    private int numeroRamales;
    private String extremos;
    private String especificacion;
    private Double diametro;
    private Integer longitud;
    

    /********************************************************************
     * NO TOCAR, CODIGO NO GENERADO
     ********************************************************************/
        public EslingaCadena(String subFamilia, String subSubFamilia) throws InvalidParameterException
        {
            super(subFamilia, subSubFamilia);
            raizSubSubFamilia = "4";
            numeroRamales = 1;
        }

        public final String getCodigo()
        {
            return getRaiz() + Eslinga.getNumeroRamales(getNumeroRamales()) + Eslinga.getExtremos(getExtremos()) + Eslinga.getEspecificacion(getEspecificacion()) + Inspeccionable.getDiametro(getDiametro()) + Inspeccionable.getLongitud(getLongitud()) + getProveedor();
        }

    /********************************************************************
     * FIN -> NO TOCAR, CODIGO NO GENERADO
     ********************************************************************/
    
    public void setExtremos(String extremos)
    {
        this.extremos = extremos;
    }

    public Double getDiametro()
    {
        return diametro;
    }

    public void setDiametro(Double diametro)
    {
        this.diametro = diametro;
    }

    public Integer getLongitud()
    {
        return longitud;
    }

    public void setLongitud(Integer longitud)
    {
        this.longitud = longitud;
    }

    public void setEspecificacion(String especificacion)
    {
        this.especificacion = especificacion;
    }

        public String getExtremos()
    {
        return extremos;
    }


    public String getEspecificacion()
    {
        return especificacion;
    }


    public void setNumeroRamales(int numeroRamales)
    {
        this.numeroRamales = numeroRamales;
    }

    
    public int getNumeroRamales()
    {
        return numeroRamales;
    }
    
}
