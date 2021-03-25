package com.srvw.sse.codaz;

import java.io.Serializable;
import java.security.InvalidParameterException;

public abstract class Inspeccionable implements ICodigoAzuro, Serializable
{
    private static final long serialVersionUID = 4289862842306883276L;
    
    private String familia;
    private String subFamilia;
    private String subSubFamilia;
    private String proveedor = "00";
    
    /*
     * patron regex para identificar el tipo
     */
    protected String raizFamilia;
    protected String raizSubSubFamilia;

    /*
     * **********************************************************************************
     * NO TOCAR: CODIGO NO GENERADO
     * *********************************************************************************
     */
    public static String getTipo(String tipo)
    {
        if( (tipo == null) || (tipo.matches("0+")) )
            return "????";
        
        int len = tipo.length();
        
        if( len == 1 )
            return "???" + tipo;
                    
        if( len < 3 )
            return "??" + tipo;

        if( len < 4 )
            return "?" + tipo;
                    
        if( len > 4 )
            return tipo.substring(0,  4);
        
        return tipo;
    }

    public static final String getLongitud(Integer longitud)
    {
        return getMagnitud3Digitos(longitud);
    }
    
    public static final String getTonelaje(Integer tonelaje)
    {
        return getMagnitud3Digitos(tonelaje);
    }
    
    public static final String getDiametro(Double diametro)
    {
        return getMagnitud3Digitos(diametro);
    }
    
    public static final String getMagnitud3Digitos(Double magnitud)
    {
        if( (magnitud == null) || (magnitud == 0d) )
            return "???";
        
        if( magnitud > 999d)
            return "999";
        
        if( magnitud < 1.0d )
        {
            return "00" + String.valueOf(((int)(magnitud * 100))/100); 
        }
        
        if(magnitud < 10.0)
            return "00" + String.valueOf(((int)(magnitud * 10))/10);
        
        if(magnitud < 100.0)
        {
            return "0" + String.valueOf(magnitud.intValue());
        }
        
        return String.valueOf(magnitud.intValue());
    }
    
    
    public static final String getMagnitud3Digitos(Integer magnitud)
    {
        if( (magnitud == null) || (magnitud == 0) )
            return "???";
        
        if( magnitud > 999)
            return "999";
        
        if( magnitud < 1 )
        {
            return "00" + String.valueOf(((int)(magnitud * 100))/100); 
        }
        
        if(magnitud < 10)
            return "00" + String.valueOf(((int)(magnitud * 10))/10);
        
        if(magnitud < 100)
        {
            return "0" + String.valueOf(magnitud.intValue());
        }
        
        return String.valueOf(magnitud.intValue());
    }
    
    public static final Integer getMaxCapCarga(Integer c45, Integer c60, Integer c90)
    {
        c45 = (c45 == null) ? 0 : c45;
        c60 = (c60 == null) ? 0 : c60;
        c90 = (c90 == null) ? 0 : c90;
        
        Integer c = ( c45 > c60 ) ? c45 : c60;
        
        return ( c > c90 ) ? c : c90;
    }
    
    public boolean familiaIgualRaiz()
    {
        return getRaiz().matches(raizFamilia+raizSubSubFamilia);
    }
    
    
    public Inspeccionable(String familia, String subFamilia,String subSubFamilia) throws InvalidParameterException
    {
        super();
        
        if( (familia == null ) || ( subFamilia == null ) || ( subSubFamilia == null ) )
            throw new InvalidParameterException();

        this.familia = familia;
        this.subFamilia = subFamilia;
        this.subSubFamilia = subSubFamilia;
    }

    public final String getRaiz()
    {
        return familia + subFamilia + subSubFamilia;
    }
    
    /*
     * **********************************************************************************
     * FIN CODIGO NO GENERADO
     * *********************************************************************************
     */    
    
    public final String getFamilia()
    {
        return familia;
    }

        public String getSubFamilia()
    {
        return subFamilia;
    }
        
    public final String getSubSubFamilia()
    {
        return subSubFamilia;
    }
    
    public final String getProveedor()
    {
        return proveedor;
    }

    public final void setProveedor(String proveedor)
    {
        this.proveedor = proveedor;
    }
    
}
