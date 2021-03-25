package com.srvw.sse.domain;

import com.google.gson.annotations.Expose;
import com.srvw.sse.util.Constants;


/**
 * Created by arquim on 12/05/17.
 */

public abstract class Componente implements IComponente, ComponenteNombreCuantificado
{
    private static int MAX = 10;
    private static int INDEX_OTRO = -1;

    /*
     * indice en el array de tipos de componente 
     * --
     * esto es el tipo, que se matchea con el array de nombres
     * 
     */
    @Expose(serialize = true,deserialize = true)
    private int index = Constants.NO_INDEX;

    @Expose(serialize = true,deserialize = true)
    private int diametro;

    @Expose(serialize = true,deserialize = true)
    private int cantidad;

    @Expose(serialize = true,deserialize = true)
    private String otro;
    
    public Componente() {
    }

    public Componente(int index, int diametro, int cantidad) {
        this();
        this.index = index < 0 ? 0 : index;
        this.diametro = diametro < 0 ? 0 : diametro;

        if( cantidad < 0 )
            this.cantidad = 0;

        else if( cantidad > MAX )
            this.cantidad = MAX;

        else
            this.cantidad=cantidad;
    }

    /***************************************************************************************************
     * NO TOCAR
     * --
     * Código No generado
     **************************************************************************************************/

    public abstract String getNombreCuantificado();
    
    public void setIndex(int index)
    {
        if( index < 0 )
            return;

        this.index = index;
    }

    public void setDiametro(int diametro) {

        if( diametro < 0)
        {
            diametro = 0;
            return;
        }

        this.diametro = diametro;
    }

    public void setCantidad(int cantidad)
    {
        if (cantidad < 0)
        {
            cantidad = 0;
            return;
        }
        this.cantidad = cantidad;
    }

    public void add( int n )
    {
        cantidad += n;
    }

    public void remove( int n )
    {
        cantidad -= n;
    }

    public abstract String getNombre();

    public void setOtro(String otro) {

        if( otro == null )
            return;

        if( otro.matches("\\s+"))
            return;

        this.otro = otro;
        index  = INDEX_OTRO;
    }

    /***************************************************************************************************
     * FIN NO TOCAR
     * --
     * Código No generado
     **************************************************************************************************/

    
    public final int getIndex() {
        return index;
    }

    public final int getDiametro() {
        return diametro;
    }

    public final int getCantidad() {
        return cantidad;
    }



    public String getOtro()
	{
		return otro;
	}

	@Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + cantidad;
        result = prime * result + diametro;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Componente other = (Componente) obj;
        if (cantidad != other.cantidad)
            return false;
        return diametro == other.diametro;
    }
}
