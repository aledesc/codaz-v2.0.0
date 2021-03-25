package com.srvw.sse.domain;

/**
 * Created by arquim on 23/05/17.
 */

public class ComponenteSuperior extends Componente
{
    public ComponenteSuperior()
    {
        super();
    }

    public ComponenteSuperior(int index, int diametro, int cantidad) {
        super(index, diametro, cantidad);
    }

    public String getNombre()
    {
        return "";
    }

	@Override
	public String getNombreCuantificado()
	{
		return "";
	}

	@Override
	public String getNomenclatura()
	{
		return "";
	}

}
