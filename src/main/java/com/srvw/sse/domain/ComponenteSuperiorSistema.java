package com.srvw.sse.domain;

/**
 * Created by arquim on 23/05/17.
 */

public class ComponenteSuperiorSistema extends ComponenteSuperior
{
    public ComponenteSuperiorSistema()
    {
        super();
    }

    public ComponenteSuperiorSistema(int index, int diametro, int cantidad) {
        super(index, diametro, cantidad);
    }

    public String getNombre()
    {
        return (new NombreComponenteSuperiorSistema()).getNombre(getIndex());
    }


	@Override
	public String getNomenclatura()
	{
        return (new NombreComponenteSuperiorSistema()).getNomenclatura(this);
    }
	
	@Override
	public String getNombreCuantificado()
	{
        return (new NombreComponenteSuperiorSistema()).getQuantified(this);
    }
	
}
