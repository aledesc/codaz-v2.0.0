package com.srvw.sse.domain.articulo;

import java.security.InvalidParameterException;

import com.srvw.sse.codaz.Inspeccionable;

/**
 * Representa Eslingas de tejido Planas, Redondas y de Secutex
 * --
 * 
 * @author erik
 *
 */
public class EslingaTejido extends Inspeccionable
{
    private static final long serialVersionUID = 926811014086701106L;
    private int numeroRamales;
    private String extremos;
    private String tipoProteccion;
    private Integer tonelaje;
    private Integer longitud;
    private Integer ancho;
    
    
    /********************************************************************
     * NO TOCAR, CODIGO NO GENERADO
     * --
     ********************************************************************/

        public EslingaTejido(String familia, String subFamilia, String subSubFamilia) throws InvalidParameterException
        {
            super(familia, subFamilia, subSubFamilia);
            raizFamilia = "(F((H(A|B|C|D|S|M|P|E))|(S(A|B|C|D|S|M|E))|(U0)|(EB)|(X(1|X))))|(R((H(S|G|X|M))|(S(T|M|E))|(EE)|(XX)))|(X(S(A|B|C|D|E|X|P)))";
            raizSubSubFamilia = "";
            numeroRamales = 1;
        }


        public final String getCodigo()
        {
            return getRaiz() + Eslinga.getNumeroRamales(getNumeroRamales()) + Eslinga.getExtremos(getExtremos()) + Eslinga.getTipoProteccion(getTipoProteccion()) + Inspeccionable.getDiametro(getTonelaje().doubleValue()) + Inspeccionable.getLongitud(getLongitud()) + getProveedor();
        }

    /********************************************************************
     * FIN -> NO TOCAR, CODIGO NO GENERADO
     ********************************************************************/

    public int getNumeroRamales()
    {
        return numeroRamales;
    }

    public void setNumeroRamales(int numeroRamales)
    {
        this.numeroRamales = numeroRamales;
    }

    public String getExtremos()
    {
        return extremos;
    }

    public void setExtremos(String extremos)
    {
        this.extremos = extremos;
    }

    public String getTipoProteccion()
    {
        return tipoProteccion;
    }

    public void setTipoProteccion(String tipoProteccion)
    {
        this.tipoProteccion = tipoProteccion;
    }

    public Integer getTonelaje()
    {
        return tonelaje;
    }

    public void setTonelaje(Integer tonelaje)
    {
        this.tonelaje = tonelaje;
    }

    public Integer getLongitud()
    {
        return longitud;
    }

    public void setLongitud(Integer longitud)
    {
        this.longitud = longitud;
    }

    
    public Integer getAncho()
    {
        return ancho;
    }


    public void setAncho(Integer ancho)
    {
        this.ancho = ancho;
    }

}
