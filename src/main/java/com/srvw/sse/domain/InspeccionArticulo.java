package com.srvw.sse.domain;

import java.io.Serializable;


/**
 * 
 * 
 * 
 * @author erik
 *
 */
public class InspeccionArticulo implements Serializable
{
    private static final long serialVersionUID = 3576289095954512276L;
    
    /*
     * datos de la inspeccion
     */
	private int inspeccion;
	private int id;
	private String referencia;
	private String idElectronico;
	
	
    /*
     * Provisional, solamente utilizado para los articulos que se registran en la app movil.
     * --
     * 
     * En este caso se utilizan cuando se transfieren los articulos nuevos de la app movil a la DB
     * 
     * --
     * permite enlazar en la DB, cuando se registra el Equipo y el InspeccionArticulo
     *
     */
    private String uuid;
	
    private int familia;
    private int subfamilia;
    private int subSubfamilia;

    private String clase;
    private String tipoComponentePrincipal;


	private String descripcion;
	private int departamento;
	private String fecha;
    private int estado;
    
    /*
     * por defecto, estado actual es no revisado
     */
    private Integer estadoActual = 0;
    private String estadoActualStr;
    
    private Boolean revisadaXSse;
    private String fechaRevisionXSse;
    
    private int inspectorSse;
    private String observaciones;
    private String observacionesParaCliente;
    private String deficiencias;
    private String ofertar;
    
	
    /*
     * codigos de rechazo del articulo formato JSON
     */
    private String codigosRechazo;
    
    
    /*
     * lista de nombres de archivos de foto formato JSON
     * 
     */
    private String fotos;

    
    
 
    public InspeccionArticulo()
    {
        super();
    }

	public int getInspeccion()
	{
		return inspeccion;
	}

	public void setInspeccion(int inspeccion)
	{
		this.inspeccion = inspeccion;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getReferencia()
	{
		return referencia;
	}

	public void setReferencia(String referencia)
	{
		this.referencia = referencia;
	}

	public String getIdElectronico()
	{
		return idElectronico;
	}

	public void setIdElectronico(String idElectronico)
	{
		this.idElectronico = idElectronico;
	}

	
	public String getUuid()
	{
		return uuid;
	}

	public void setUuid(String uuid)
	{
		this.uuid = uuid;
	}

	public int getFamilia()
	{
		return familia;
	}

	public void setFamilia(int familia)
	{
		this.familia = familia;
	}

	public int getSubfamilia()
	{
		return subfamilia;
	}

	public void setSubfamilia(int subfamilia)
	{
		this.subfamilia = subfamilia;
	}

	public int getSubSubfamilia()
	{
		return subSubfamilia;
	}

	public void setSubSubfamilia(int subSubfamilia)
	{
		this.subSubfamilia = subSubfamilia;
	}

	public String getClase()
	{
		return clase;
	}

	public void setClase(String clase)
	{
		this.clase = clase;
	}

	public String getTipoComponentePrincipal()
	{
		return tipoComponentePrincipal;
	}

	public void setTipoComponentePrincipal(String tipoComponentePrincipal)
	{
		this.tipoComponentePrincipal = tipoComponentePrincipal;
	}

	public String getDescripcion()
	{
		return descripcion;
	}

	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	public int getDepartamento()
	{
		return departamento;
	}

	public void setDepartamento(int departamento)
	{
		this.departamento = departamento;
	}


	public String getFecha()
	{
		return fecha;
	}

	public void setFecha(String fecha)
	{
		this.fecha = fecha;
	}

	public void setFechaRevisionXSse(String fechaRevisionXSse)
	{
		this.fechaRevisionXSse = fechaRevisionXSse;
	}

	public int getEstado()
	{
		return estado;
	}

	public void setEstado(int estado)
	{
		this.estado = estado;
	}

	public Integer getEstadoActual()
	{
		return estadoActual;
	}

	public void setEstadoActual(Integer estadoActual)
	{
		this.estadoActual = estadoActual;
	}

	public String getEstadoActualStr()
	{
		return estadoActualStr;
	}

	public void setEstadoActualStr(String estadoActualStr)
	{
		this.estadoActualStr = estadoActualStr;
	}

	public Boolean getRevisadaXSse()
	{
		return revisadaXSse;
	}

	public void setRevisadaXSse(Boolean revisadaXSse)
	{
		this.revisadaXSse = revisadaXSse;
	}

	public int getInspectorSse()
	{
		return inspectorSse;
	}

	public void setInspectorSse(int inspectorSse)
	{
		this.inspectorSse = inspectorSse;
	}

	public String getObservaciones()
	{
		return observaciones;
	}

	public void setObservaciones(String observaciones)
	{
		this.observaciones = observaciones;
	}

	public String getDeficiencias()
	{
		return deficiencias;
	}

	public void setDeficiencias(String deficiencias)
	{
		this.deficiencias = deficiencias;
	}

	public String getOfertar()
	{
		return ofertar;
	}

	public void setOfertar(String ofertar)
	{
		this.ofertar = ofertar;
	}

	

	public String getCodigosRechazo()
	{
		return codigosRechazo;
	}

	public void setCodigosRechazo(String codigosRechazo)
	{
		this.codigosRechazo = codigosRechazo;
	}

	public String getFotos()
	{
		return fotos;
	}

	public void setFotos(String fotos)
	{
		this.fotos = fotos;
	}

	public String getObservacionesParaCliente()
	{
		return observacionesParaCliente;
	}

	public void setObservacionesParaCliente(String observacionesParaCliente)
	{
		this.observacionesParaCliente = observacionesParaCliente;
	}

	@Override
	public String toString()
	{
		return "InspeccionArticulo [inspeccion=" + inspeccion + ", id=" + id + ", referencia=" + referencia
				+ ", idElectronico=" + idElectronico + ", uuid=" + uuid + ", familia=" + familia + ", subfamilia="
				+ subfamilia + ", subSubfamilia=" + subSubfamilia + ", clase=" + clase + ", tipoComponentePrincipal="
				+ tipoComponentePrincipal + ", descripcion=" + descripcion + ", departamento=" + departamento
				+ ", fecha=" + fecha + ", estado=" + estado + ", estadoActual=" + estadoActual + ", estadoActualStr="
				+ estadoActualStr + ", revisadaXSse=" + revisadaXSse + ", fechaRevisionXSse=" + fechaRevisionXSse
				+ ", inspectorSse=" + inspectorSse + ", observaciones=" + observaciones + ", observacionesParaCliente="
				+ observacionesParaCliente + ", deficiencias=" + deficiencias + ", ofertar=" + ofertar
				+ ", codigosRechazo=" + codigosRechazo + ", fotos=" + fotos + "]";
	}

}

