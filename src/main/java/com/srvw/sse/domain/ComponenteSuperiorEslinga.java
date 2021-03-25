package com.srvw.sse.domain;

/**
 * Created by arquim on 23/05/17.
 */

public class ComponenteSuperiorEslinga extends ComponenteSuperior
{
    public ComponenteSuperiorEslinga()
    {
        super();
    }

    public ComponenteSuperiorEslinga(int index, int diametro, int cantidad) {
        super(index, diametro, cantidad);
    }

    public String getNombre()
    {
        return (new NombreComponenteSuperiorEslinga()).getNombre(getIndex());
    }

	@Override
	public String getNomenclatura()
	{
        return (new NombreComponenteSuperiorEslinga()).getNomenclatura(this);
    }
	
	@Override
	public String getNombreCuantificado()
	{
        return (new NombreComponenteSuperiorEslinga()).getQuantified(this);
    }
	
}
