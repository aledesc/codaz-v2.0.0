package com.srvw.sse.domain;

/**
 * Created by arquim on 23/05/17.
 */

public class ComponenteConector extends Componente implements ComponenteNombreCuantificado
{
    public ComponenteConector()
    {
        super();
    }

    public ComponenteConector(int index, int diametro, int cantidad) {
        super(index, diametro, cantidad);
    }

    public String getNombre()
    {
        return (new NombreConector()).getNombre(getIndex());
    }

	@Override
	public String getNombreCuantificado()
	{
        return (new NombreConector()).getQuantified(this);
    }

	
	@Override
	public String getNomenclatura()
	{
		return (new NombreConector()).getNomenclatura(this);
	}
}
