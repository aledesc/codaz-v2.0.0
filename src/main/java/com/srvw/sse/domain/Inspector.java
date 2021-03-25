package com.srvw.sse.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * @author arquim
 *
 */
public class Inspector implements Serializable
{
    private static final long serialVersionUID = 9050782376598501552L;

    private Integer id;
    private String nombre;
    private String apellidos;
    private Boolean activo;
    private Boolean vigente;
    private Integer entidad;
    
    private String email;
    private String clave;
    
    
    private List<ClienteLhe> clientes;
    
    public Inspector()
    {
        super();
    }

/********************************************************
* FIN NO TOCAR 
* --
* NO GENERADO
********************************************************/

    public Inspector(Integer id, String nombre)
    {
        super();
        this.id = id;
        this.nombre = nombre;
    }

    public Inspector(Integer id, String nombre, String email)
    {
        super();
        this.id = id;
        this.nombre = nombre;
        this.email=email;
    }

    
    public void addCliente(ClienteSSE cliente)
    {
        if( cliente == null )
            return;
        
        if( clientes == null )
            clientes = new ArrayList<ClienteSSE>();
        
        clientes.add(cliente);
    }

    
    @Override
	public Inspector clone() throws CloneNotSupportedException
	{
    	Inspector i = new Inspector(id, nombre);
    	i.setActivo(activo);
    	i.setApellidos(apellidos);
    	i.setEntidad(entidad);
    	i.setVigente(vigente);
    	i.setClientes(clientes);
    	
		return i;
	}

/********************************************************
 * FIN NO TOCAR 
 * --
 * NO GENERADO
 ********************************************************/


	public List<ClienteSSE> getClientes()
    {
        return clientes;
    }
    
    public void setClientes(List<ClienteSSE> clientes)
    {
        this.clientes = clientes;
    }

    
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    
	public Boolean getActivo()
	{
		return activo;
	}


	public void setActivo(Boolean activo)
	{
		this.activo = activo;
	}


	public Integer getEntidad()
	{
		return entidad;
	}


	public void setEntidad(Integer entidad)
	{
		this.entidad = entidad;
	}

	
	public Boolean getVigente()
	{
		return vigente;
	}

	public void setVigente(Boolean vigente)
	{
		this.vigente = vigente;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activo == null) ? 0 : activo.hashCode());
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
		result = prime * result + ((entidad == null) ? 0 : entidad.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((vigente == null) ? 0 : vigente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inspector other = (Inspector) obj;
		if (activo == null)
		{
			if (other.activo != null)
				return false;
		} else if (!activo.equals(other.activo))
			return false;
		if (apellidos == null)
		{
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (clientes == null)
		{
			if (other.clientes != null)
				return false;
		} else if (!clientes.equals(other.clientes))
			return false;
		if (entidad == null)
		{
			if (other.entidad != null)
				return false;
		} else if (!entidad.equals(other.entidad))
			return false;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null)
		{
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (vigente == null)
		{
			if (other.vigente != null)
				return false;
		} else if (!vigente.equals(other.vigente))
			return false;
		return true;
	}



	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getClave()
	{
		return clave;
	}

	public void setClave(String clave)
	{
		this.clave = clave;
	}

	@Override
	public String toString()
	{
		return "Inspector [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", activo=" + activo
				+ ", email=" + email + ", clave=" + clave + "]";
	}
	
}
