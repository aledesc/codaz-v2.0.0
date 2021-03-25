package com.srvw.sse.domain;

import java.io.Serializable;

public class Foto implements Serializable
{
	
    private static final long serialVersionUID = 4233451707705080993L;
    
    private int cliente;
    public int inspeccion;
    private int articulo;
    
    private String archivo;
    
    private int ancho;
    private int alto;
    private String descripcion;
    
    
	public Foto() {
		super();
	}
	
	public Foto(int cliente, int inspeccion, String archivo) {
		super();
		this.cliente = cliente;
		this.inspeccion = inspeccion;
		this.archivo = archivo;
	}

	public Foto(int cliente, int inspeccion, int articulo) {
		super();
		this.cliente = cliente;
		this.inspeccion = inspeccion;
		this.articulo = articulo;
	}

	public int getCliente()
	{
		return cliente;
	}
	public void setCliente(int cliente)
	{
		this.cliente = cliente;
	}
	public int getInspeccion()
	{
		return inspeccion;
	}
	public void setInspeccion(int inspeccion)
	{
		this.inspeccion = inspeccion;
	}
	public int getArticulo()
	{
		return articulo;
	}
	public void setArticulo(int articulo)
	{
		this.articulo = articulo;
	}
	public String getArchivo()
	{
		return archivo;
	}
	public void setArchivo(String archivo)
	{
		this.archivo = archivo;
	}
	public int getAncho()
	{
		return ancho;
	}
	public void setAncho(int ancho)
	{
		this.ancho = ancho;
	}
	public int getAlto()
	{
		return alto;
	}
	public void setAlto(int alto)
	{
		this.alto = alto;
	}
	public String getDescripcion()
	{
		return descripcion;
	}
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString()
	{
		return "Foto [cliente=" + cliente + ", inspeccion=" + inspeccion + ", articulo=" + articulo + ", archivo="
				+ archivo + ", ancho=" + ancho + ", alto=" + alto + ", descripcion=" + descripcion + "]";
	}
    
}
