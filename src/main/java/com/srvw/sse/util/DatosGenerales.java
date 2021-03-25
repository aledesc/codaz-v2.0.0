package com.srvw.sse.util;

import java.util.List;

import com.srvw.sse.domain.ClienteSSE;
import com.srvw.sse.domain.Fabricante;

/**
 * Esta es la clase encargada de transportar todos los datos generales para la app movil.
 * 
 * Aqui debe empaquetarse: 
 * 
 * 	- fabricantes
 * 	- deficiencias
 * 	- el contenido de la clasificacion del Azuro (familia, subfamilia, subsubfamilia)
 * 	- 
 * 
 * 
 * *******************************************************************************************
 * Aledesc
 * --
 * 20170803
 * --
 * Por ahora, solamente transportamos los fabricantes porque son lo que mas puede variar, 
 * en el mantenimiento futuro, se incluiran el resto de items, que ahora se han empaquetado 
 * como recursos string array.
 * 
 * @author arquim
 *
 */
public class DatosGenerales
{
	private List<Fabricante> fabricantes;

	private List<ClienteSSE> clientes;


	public DatosGenerales()
	{
		super();
		this.fabricantes = null;
		this.clientes = null;
	}

	public DatosGenerales(List<Fabricante> fabricantes, List<ClienteSSE> clientes)
	{
		super();
		this.fabricantes = fabricantes;
		this.clientes = clientes;
	}

	public List<Fabricante> getFabricantes()
	{
		return fabricantes;
	}

	public void setFabricantes(List<Fabricante> fabricantes)
	{
		this.fabricantes = fabricantes;
	}

	public List<ClienteSSE> getClientes()
	{
		return clientes;
	}

	public void setClientes(List<ClienteSSE> clientes)
	{
		this.clientes = clientes;
	}	
	
}
