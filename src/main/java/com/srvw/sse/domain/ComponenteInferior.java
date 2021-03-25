package com.srvw.sse.domain;

/**
 * Created by arquim on 23/05/17.
 */

public class ComponenteInferior extends Componente implements ComponenteNombreCuantificado
{
    public ComponenteInferior()
    {
        super();
    }

    public ComponenteInferior(int index, int diametro, int cantidad) {
        super(index, diametro, cantidad);
    }

    public String getNombre()
    {
        return (new NombreComponenteInferior()).getNombre(getIndex());
    }

	
    @Override
	public String getNombreCuantificado()
    {
        return (new NombreComponenteInferior()).getQuantified(this);
    }

	@Override
	public String getNomenclatura()
	{
		return (new NombreComponenteInferior()).getNomenclatura(this);
	}
    

}
