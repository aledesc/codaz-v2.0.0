package com.srvw.sse.domain;

public enum TipoComponentePrincipal
{
	Cadena(0), 
	Cable(1),
	PoliesterPlano(2),
	PoliesterRedondo(3),
	Otros(4),
	Mixto(5);

	private int tipo;

	TipoComponentePrincipal(int tipo)
	{
		this.tipo = tipo;
	}

	public int getTipo()
	{
		return tipo;
	}
}
