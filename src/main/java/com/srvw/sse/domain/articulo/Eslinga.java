package com.srvw.sse.domain.articulo;

import java.io.Serializable;

/**
 * Clase que gestiona partes del codigo comunes a todo tipo de eslinga.
 * 
 * @author erik
 *
 */
public final class Eslinga implements Serializable
{
    private static final long serialVersionUID = 3689442608206279735L;

    private Eslinga()
    {
    }
    
    public static final String getNumeroRamales(int numeroRamales)
    {
        return "1";
    }

    public static final String getExtremos(String extremos)
    {
        if( (extremos==null) || extremos.matches("\\s+") )
            return "??";
        
        if( extremos.length() == 1 )
            return "?" + extremos;
        
        if( extremos.length() > 2 )
            return extremos.substring(0, 2);
        
        return extremos;
    }
    
    public static final String getEspecificacion(String especificacion)
    {
        if( (especificacion==null) || especificacion.matches("\\s+") )
            return "?";
        
        if( especificacion.length()>1 )
            return especificacion.substring(0,1);
        
        return especificacion;
    }
    
    public static final String getTipoProteccion(String proteccion)
    {
        if( (proteccion==null) || proteccion.matches("\\s+") )
            return "?";
        
        if( proteccion.length()>1 )
            return proteccion.substring(0,1);
        
        return proteccion;
    }
    
    
}
