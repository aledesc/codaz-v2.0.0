package com.srvw.sse.domain;

import java.io.Serializable;

public class RamalMixto extends Ramal implements Serializable
{
	private static final long serialVersionUID = -4080138280185391925L;

	private Ramal subRamalSuperior;
    private ComponenteConector conector;
    private Ramal subRamalInferior;
    
    
	public Ramal getSubRamalSuperior()
	{
		return subRamalSuperior;
	}
	public void setSubRamalSuperior(Ramal subRamalSuperior)
	{
		this.subRamalSuperior = subRamalSuperior;
	}
	public ComponenteConector getConector()
	{
		return conector;
	}
	public void setConector(ComponenteConector conector)
	{
		this.conector = conector;
	}
	public Ramal getSubRamalInferior()
	{
		return subRamalInferior;
	}
	public void setSubRamalInferior(Ramal subRamalInferior)
	{
		this.subRamalInferior = subRamalInferior;
	}
    
}
