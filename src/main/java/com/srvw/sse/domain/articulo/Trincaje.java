package com.srvw.sse.domain.articulo;

import com.srvw.sse.codaz.Inspeccionable;

public class Trincaje extends Inspeccionable
{
    /**
     * 
     */
    private static final long serialVersionUID = 6740989037819380896L;
    public static int MIN_NUM_RAMALES = 1;
    public static int MAX_NUM_RAMALES = 10;
    
    private int numeroRamales;
    private String extremos;
    private String cinta;
    private String proteccion;
    private Integer longitud;

    /*
     * **********************************************************************************
     * NO TOCAR:
     * --
     * CODIGO NO GENERADO
     * *********************************************************************************
     */
    public Trincaje(String subFamilia, String subSubFamilia)
    {
        super("L",subFamilia,subSubFamilia);
        raizFamilia = "(L((0[1-8]{1})|(3[1-9]{1})|(5[1-9]{1})|(6[2-5]{1})|(T0)|(X(X|3))))";
        raizSubSubFamilia="";

        numeroRamales = 1;
        extremos = null;
        cinta = null;
        proteccion = null;
        longitud = 0;
    }

    public void setNumeroRamales(int numeroRamales)
    {
        if( (numeroRamales<MIN_NUM_RAMALES) || (numeroRamales>MAX_NUM_RAMALES) )
        {
            this.numeroRamales = MIN_NUM_RAMALES;
            return;
        }
        this.numeroRamales = numeroRamales;
    }

    public void setExtremos(String extremos)
    {
        this.extremos = extremos;
        
        if( (extremos!=null) && (extremos.length() > 2) )
        {
            this.extremos=extremos.substring(0,2);
        }
    }

    public void setCinta(String cinta)
    {
        this.cinta = cinta;
        
        if( (cinta!= null) && cinta.length() > 3 )
        {
            this.cinta=cinta.substring(0,3);
        }
    }

    public void setProteccion(String proteccion)
    {
        this.proteccion = proteccion;
        
        if( (proteccion!=null) && (proteccion.length()>1) )
        {
            this.proteccion=proteccion.substring(0, 1);
        }
    }
    
    public void setLongitud(Integer longitud)
    {
        this.longitud = longitud;
        
        if( (longitud<1d) || (longitud>999d) )
        {
            this.longitud=0;
        }
    }

    public String getCinta()
    {
        if( (cinta == null) || (cinta.matches("\\s+")) )
        {
            return "???"; 
        }
            
        if( cinta.length() > 3)
        {
            return cinta.substring(0, 3).toUpperCase();
        }
        
        if( cinta.length() < 2)
        {
            return "??" + cinta.toUpperCase();
        }
        
        if( cinta.length() < 3)
        {
            return "?" + cinta.toUpperCase();
        }
        
        return cinta.toUpperCase();
    }

    @Override
    public String getCodigo()
    {
        return getRaiz() + Eslinga.getNumeroRamales(getNumeroRamales()) + Eslinga.getExtremos(getExtremos()) + getCinta() + Eslinga.getTipoProteccion(getProteccion()) + Inspeccionable.getLongitud(getLongitud()) + getProveedor();
    }

    /*
     * **********************************************************************************
     * FIN NO TOCAR: 
     * --
     * CODIGO NO GENERADO
     * *********************************************************************************
     */
    
    
    public int getNumeroRamales()
    {
        return numeroRamales;
    }

    public String getExtremos()
    {
        return extremos;
    }


    public String getProteccion()
    {
        return proteccion;
    }

    public Integer getLongitud()
    {
        return longitud;
    }

}
