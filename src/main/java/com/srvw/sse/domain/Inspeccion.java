package com.srvw.sse.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Inspeccion implements Serializable
{
    private static final long serialVersionUID = -1901683605069856266L;

    public static final int Cancelada = -1;
    public static final int Creada = 0;
    public static final int Descargada = 1;
    public static final int EnCurso = 2;
    public static final int ConDatos = 3;
    public static final int ConFotos = 4;
    public static final int EnRevision = 5;
    public static final int Aprobada = 6;
    public static final int Cerrada = 7;

    
    private int id;
    private int cliente;
    private String nombreCliente;
    
    private String noPedido;
    
    private Date fechaInicio;
    private Date fechaFin;
    private String fechaProximaInspeccion;
    private float tiempoTotal;
    private float tiempoInspeccion;
    private float tiempoEspera;
    private float tiempoTransporte;
    private String observaciones;
    private String oportunidadesDeMejora;
    
    /*
     * Este campo es necesario para gestionar la descarga de fotos de la ultima inspeccion
     * --
     * 
     * Cuando se descarga la inspeccion inicilizada, el id es el de la inspeccion en status INICIAL(0)
     * con este parámetro podemos enrutar la peticion al directorio correcto en el servidor REST
     *  
     * 
     */
    private int idUltimaInspeccion;
    
    /*
     * para el caso de inspeccion solicitada por el cliente
     */
    private boolean autoInspeccion;

    private Inspector inspector;
    
    private int estado = 0;
    
    /*
     * articulos inspeccionados en la inspeccion
     */
    private List<InspeccionArticulo> dispositivos;
    
    public Inspeccion()
    {
        super();
        idUltimaInspeccion = -1;
    }

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getCliente()
	{
		return cliente;
	}

	public void setCliente(int cliente)
	{
		this.cliente = cliente;
	}

	public String getNombreCliente()
	{
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente)
	{
		this.nombreCliente = nombreCliente;
	}

	public Date getFechaInicio()
	{
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio)
	{
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin()
	{
		return fechaFin;
	}


	public String getFechaProximaInspeccion()
	{
		return fechaProximaInspeccion;
	}

	public void setFechaProximaInspeccion(String fechaProximaInspeccion)
	{
		this.fechaProximaInspeccion = fechaProximaInspeccion;
	}

	public void setFechaFin(Date fechaFin)
	{
		this.fechaFin = fechaFin;
	}

	public float getTiempoTotal()
	{
		return tiempoTotal;
	}

	public void setTiempoTotal(float tiempoTotal)
	{
		this.tiempoTotal = tiempoTotal;
	}

	public float getTiempoInspeccion()
	{
		return tiempoInspeccion;
	}

	public void setTiempoInspeccion(float tiempoInspeccion)
	{
		this.tiempoInspeccion = tiempoInspeccion;
	}

	public float getTiempoEspera()
	{
		return tiempoEspera;
	}

	public void setTiempoEspera(float tiempoEspera)
	{
		this.tiempoEspera = tiempoEspera;
	}

	public float getTiempoTransporte()
	{
		return tiempoTransporte;
	}

	public void setTiempoTransporte(float tiempoTransporte)
	{
		this.tiempoTransporte = tiempoTransporte;
	}

	public String getObservaciones()
	{
		return observaciones;
	}

	public void setObservaciones(String observaciones)
	{
		this.observaciones = observaciones;
	}

	public String getOportunidadesDeMejora()
	{
		return oportunidadesDeMejora;
	}

	public void setOportunidadesDeMejora(String oportunidadesDeMejora)
	{
		this.oportunidadesDeMejora = oportunidadesDeMejora;
	}

	public boolean isAutoInspeccion()
	{
		return autoInspeccion;
	}

	public void setAutoInspeccion(boolean autoInspeccion)
	{
		this.autoInspeccion = autoInspeccion;
	}

	public Inspector getInspector()
	{
		return inspector;
	}

	public void setInspector(Inspector inspector)
	{
		this.inspector = inspector;
	}

	public int getEstado()
	{
		return estado;
	}

	public void setEstado(int estado)
	{
		this.estado = estado;
	}

	public List<InspeccionArticulo> getDispositivos()
	{
		return dispositivos;
	}

	public void setDispositivos(List<InspeccionArticulo> dispositivos)
	{
		this.dispositivos = dispositivos;
	}
	
	public int getIdUltimaInspeccion()
	{
		return idUltimaInspeccion;
	}

	public void setIdUltimaInspeccion(int idUltimaInspeccion)
	{
		this.idUltimaInspeccion = idUltimaInspeccion;
	}

	
	public String getNoPedido()
	{
		return noPedido;
	}

	public void setNoPedido(String noPedido)
	{
		this.noPedido = noPedido;
	}

	@Override
	public String toString()
	{
		return "Inspeccion [id=" + id + ", cliente=" + cliente + ", nombreCliente=" + nombreCliente + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + ", tiempoTotal=" + tiempoTotal + ", tiempoInspeccion="
				+ tiempoInspeccion + ", tiempoEspera=" + tiempoEspera + ", tiempoTransporte=" + tiempoTransporte
				+ ", observaciones=" + observaciones + ", oportunidadesDeMejora=" + oportunidadesDeMejora
				+ ", autoInspeccion=" + autoInspeccion + ", inspector=" + inspector + ", estado=" + estado;
	}


    
}
