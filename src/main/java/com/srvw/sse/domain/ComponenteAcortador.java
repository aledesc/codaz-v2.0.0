package com.srvw.sse.domain;

/**
 * Created by arquim on 23/05/17.
 */

public class ComponenteAcortador extends Componente implements ComponenteNombreCuantificado
{

    public ComponenteAcortador()
    {
        super();
    }

    public ComponenteAcortador(int index, int diametro, int cantidad) {
        super(index, diametro, cantidad);
    }

    public String getNombre()
    {
        return (new NombreAcortador()).getNombre(getIndex());
    }

	@Override
	public String getNombreCuantificado()
	{
		 return (new NombreAcortador()).getQuantified(this);
    }

	@Override
	public String getNomenclatura()
	{
		return (new NombreAcortador()).getNomenclatura(this);
	}

}
