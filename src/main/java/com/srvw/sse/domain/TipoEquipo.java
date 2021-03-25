package com.srvw.sse.domain;

public enum TipoEquipo
{
	Sistema(0), 
	Eslinga(1), 
	Otros(2);

	private int tipo;
	
	TipoEquipo(int tipo)
	{
		this.tipo = tipo;
	}

	public int getTipo()
	{
		return tipo;
	}
}
