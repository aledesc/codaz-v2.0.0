package com.srvw.sse.domain;

import java.util.List;

import com.srvw.sse.util.Constants;

/**
 * Created by arquim on 23/05/17.
 */

public abstract class NombreComponente
{
    protected String[] nombreComponente = null;
    protected static int MIN_IDX = Constants.ZERO_BASED_FIRST;
    protected int MAX_IDX;

    public NombreComponente()
    {
        nombreComponente = null;
    }

    public final String getNombre(int idx)
    {
        if( (idx < MIN_IDX) || (idx > MAX_IDX) )
            return null;

        return nombreComponente[idx];
    }


    public final int getIndex(String nombre)
    {
        if( nombre == null )
            return Constants.NO_INDEX;

        if( nombre.trim().length() == 0 )
            return Constants.NO_INDEX;

        int i = 0;
        for(String s: nombreComponente)
        {
            if (s.contains(nombre))
                return i;

            ++i;
        }

        return Constants.NO_INDEX;
    }

    protected void setNombreComponente(String[] n)
    {
        if ( n == null )
            return;

        if( n.length < 1 )
            return;

        int i = 0;
        nombreComponente = new String[ n.length ];
        for(String s: n)
            nombreComponente[ i++ ] = s;
    }

    public String getQuantified( Componente componente )
    {
        return String.valueOf(componente.getCantidad()) + "  " + getNomenclatura(componente);
    }


    /**
     * Retorna nomenclatura del Componente {nombre-diametro} para mostrar comparar con
     * precision en las operaciones de Eliminacion de componentes de la lista.
     *
     * @return
     */
    public String getNomenclatura(Componente componente)
    {
    	if( componente.getIndex() == Constants.NO_INDEX )
    		return componente.getOtro() + "-" + String.valueOf(componente.getDiametro());
    	else
    		return getNombre(componente.getIndex()) + "-" + String.valueOf(componente.getDiametro());
    }

    /**
     * Retorna la lista de Componente.toString() {cantidad nombre-diametro} para mostrar en el
     * EditTextView de Conectores Superiores e Inferiores intercalando caracter /n entre cada linea.
     *
     * @param lst
     * @return
     */
    public String getStringNombresUI(List<Componente> lst)
    {
        if( lst == null )
            return null;

        if( lst.size() < 1 )
            return null;

        StringBuilder sb = new StringBuilder();

        boolean first = true;

        for(IComponente c: lst)
        {
            if( c == null )
                continue;

            if( !first )
                sb.append("\n");

            sb.append( getQuantified((Componente)c) );
            first = false;
        }

        return sb.toString();
    }

    /**
     * Retorna la lista de Componente.toString() {cantidad nombre-diametro} para mostrar en el
     * EditTextView de Acortadores intercalando caracter /n entre cada linea.
     *
     * @param lst
     * @return
     */
    public String getStringNombresAcortadoresUI(List<ComponenteAcortador> lst)
    {
        if( lst == null )
            return null;

        if( lst.size() < 1 )
            return null;

        StringBuilder sb = new StringBuilder();

        boolean first = true;

        for(IComponente c: lst)
        {
            if( c == null )
                continue;

            if( !first )
                sb.append("\n");

            sb.append( getQuantified((Componente)c) );

            first = false;
        }

        return sb.toString();
    }
}
