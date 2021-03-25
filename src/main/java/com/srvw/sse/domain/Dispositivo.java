package com.srvw.sse.domain;

import java.io.Serializable;
import java.util.List;

public class Dispositivo implements Serializable, IDispositivo
{
	public static final int Cancelada = -1;
	
	public static final int NoRevisado = 0;
	public static final int EnServicio = 1;
	public static final int En_Servicio_Controlar = 2;
	public static final int Fuera_De_Servicio_Reparar = 3;
	public static final int Fuera_De_Servicio_Controlar_Reparar = 4;
	public static final int Fuera_De_Servicio_Desechar = 5;


    private static final long serialVersionUID = 5012900572754226585L;

    private int cliente;
    private int id;
    private String referencia;
    private String idElectronica;
    
    private int tipo;
    private int componentePrincipal;
    
    private String familia;
    private String subfamilia;
    private String subsubfamilia;

    private String codAzuro;
    private String descripcionErp;
    
    private Integer longitudSistema;
    private Integer longitudRosca;
    private Integer diametroRosca;
    
    private Integer carga45;
    private Integer carga60;
    private Integer carga90;
    
    
    private int departamento;
    
    private String descripcion;
    private String noSerie;
    private int fabricante;
    
    private int gradoCadena;

    private String observaciones;
    
    private ComponenteSuperior componenteSuperior;
    
    private List<Ramal> ramales;
    
    private List<Foto> fotos;

	/*
	 * para compatibilidad con las inspecciones anteriores
	 */
    private Integer longitud;
    private Double diametro;
    private String eslingas;
    private String otros;
    private String codigo;
    private String codAleman;
    private String referenciaCliente;
    
    /*
     * 20180312
     * --
     * adiciones ulteriores, en marzo 2018, por 
     * peticion de aitor badiola
     */
    private String referenciaComercial;

    
    /*
     * datos específicos
     * --
     * balancin, cáncamo,
     */
    private int tipoDeBalancin;
    private int tipoDeCancamo;

    /*
     * dinamometro
     */
    private String extremoSuperiorDinamometro;
    private String extremoInferiorDinamometro;

    private int tipoDeGrillete;

    /*
     * tipo de polipasto x fuente motrix
     * manual , electrico
     */
    private int tipoMotrizPolipasto;

    /*
     * tipo de componente principal del polipasto
     * cable, cadena
     */
    private int tipoComponentePrincipalPolipasto;

    /*
     * gancho c
     */
    private int longitudBoca; //gancho C, porta-pallets
    private int longitudBrazo;
    private String sistemaSuperior;


    /*
     * pinza
     */
    private String modelo;
    private Float apertura;


    /*
     * porta pallets
     */
    private int longitudPala;
    private int distanciaEntrePalas;

    /*
     * volteador
     */
    private int tipoDeVolteador;
    private int elementoDeVolteo;
    private int rangoMovimientoSuperior;
    private int rangoMovimientoInferior;

    private String observacionesParaCliente;

    /*
     * otras elementos que pueden aparecen
     */
    private String otrosAccesorios;

    
    public Dispositivo()
    {
        super();
    }
    
    
    /**
     * La cantidad de ramales esta contenida en cada ramal, que lista cuantos hay iguales
     * 
     */
    @Override
    public int getCantidadRamales()
    {
        return (ramales==null) ? 0 : ramales.size();
    }

    public void setRamales(List<Ramal> ramales)
    {
        this.ramales = ramales;
    }
    
	public List<Foto> getFotos()
	{
		return fotos;
	}


	public void setFotos(List<Foto> fotos)
	{
		this.fotos = fotos;
	}


    public List<Ramal> getRamales()
    {
        return ramales;
    }

/******************************************************************************************
 * FIN - NO TOCAR 
 * --
 ******************************************************************************************
 */

    
    public int getCliente()
    {
        return cliente;
    }
    
	public ComponenteSuperior getComponenteSuperior()
	{
		return componenteSuperior;
	}
	
	
	public void setComponenteSuperior(ComponenteSuperior componenteSuperior)
	{
		this.componenteSuperior = componenteSuperior;
	}


	public void setCliente(int cliente)
    {
        this.cliente = cliente;
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

    public int getTipo()
    {
        return tipo;
    }

    public void setTipo(int tipo)
    {
        this.tipo = tipo;
    }

    public Double getDiametro()
    {
        return diametro;
    }

    public void setDiametro(Double diametro)
    {
        this.diametro = diametro;
    }

    public String getCodAleman()
    {
        return codAleman;
    }

    public void setCodAleman(String codAleman)
    {
        this.codAleman = codAleman;
    }

    public String getIdElectronica()
    {
        return idElectronica;
    }

    public void setIdElectronica(String idElectronica)
    {
        this.idElectronica = idElectronica;
    }

    public int getDepartamento()
    {
        return departamento;
    }

    public void setDepartamento(int departamento)
    {
        this.departamento = departamento;
    }

    public String getReferenciaCliente()
    {
        return referenciaCliente;
    }

    public void setReferenciaCliente(String referenciaCliente)
    {
        this.referenciaCliente = referenciaCliente;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public String getNoSerie()
    {
        return noSerie;
    }

    public void setNoSerie(String noSerie)
    {
        this.noSerie = noSerie;
    }

    public int getFabricante()
    {
        return fabricante;
    }

    public void setFabricante(int fabricante)
    {
        this.fabricante = fabricante;
    }

    public String getObservaciones()
    {
        return observaciones;
    }

    public void setObservaciones(String observaciones)
    {
        this.observaciones = observaciones;
    }

    public String getOtros()
    {
        return otros;
    }

    public void setOtros(String otros)
    {
        this.otros = otros;
    }


    public String getCodAzuro()
    {
        return codAzuro;
    }


    public void setCodAzuro(String codAzuro)
    {
        this.codAzuro = codAzuro;
    }


    public String getDescripcionErp()
    {
        return descripcionErp;
    }


    public void setDescripcionErp(String descripcionErp)
    {
        this.descripcionErp = descripcionErp;
    }


    public String getEslingas()
    {
        return eslingas;
    }


    public void setEslingas(String eslingas)
    {
        this.eslingas = eslingas;
    }


    public String getCodigo()
    {
        return codigo;
    }


    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }


    public String getSubfamilia()
    {
        return subfamilia;
    }


    public void setSubfamilia(String subfamilia)
    {
        this.subfamilia = subfamilia;
    }


    public String getSubsubfamilia()
    {
        return subsubfamilia;
    }


    public void setSubsubfamilia(String subsubfamilia)
    {
        this.subsubfamilia = subsubfamilia;
    }


    public String getFamilia()
    {
        return familia;
    }

    public void setFamilia(String familia)
    {
        this.familia = familia;
    }


	public int getComponentePrincipal()
	{
		return componentePrincipal;
	}


	public void setComponentePrincipal(int componentePrincipal)
	{
		this.componentePrincipal = componentePrincipal;
	}

	public int getGradoCadena()
	{
		return gradoCadena;
	}

	public void setGradoCadena(int gradoCadena)
	{
		this.gradoCadena = gradoCadena;
	}

	public Integer getLongitudSistema()
	{
		return longitudSistema;
	}

	public void setLongitudSistema(Integer longitudSistema)
	{
		this.longitudSistema = longitudSistema;
	}

	public Integer getLongitud()
	{
		return longitud;
	}

	public void setLongitud(Integer longitud)
	{
		this.longitud = longitud;
	}


	public Integer getLongitudRosca()
	{
		return longitudRosca;
	}


	public void setLongitudRosca(Integer longitudRosca)
	{
		this.longitudRosca = longitudRosca;
	}


	public Integer getDiametroRosca()
	{
		return diametroRosca;
	}


	public void setDiametroRosca(Integer diametroRosca)
	{
		this.diametroRosca = diametroRosca;
	}


	public Integer getCarga45()
	{
		return carga45;
	}


	public void setCarga45(Integer carga45)
	{
		this.carga45 = carga45;
	}


	public Integer getCarga60()
	{
		return carga60;
	}


	public void setCarga60(Integer carga60)
	{
		this.carga60 = carga60;
	}


	public Integer getCarga90()
	{
		return carga90;
	}


	public void setCarga90(Integer carga90)
	{
		this.carga90 = carga90;
	}


	
	public String getReferenciaComercial()
	{
		return referenciaComercial;
	}


	public void setReferenciaComercial(String referenciaComercial)
	{
		this.referenciaComercial = referenciaComercial;
	}


	public int getTipoDeBalancin()
	{
		return tipoDeBalancin;
	}


	public void setTipoDeBalancin(int tipoDeBalancin)
	{
		this.tipoDeBalancin = tipoDeBalancin;
	}


	public int getTipoDeCancamo()
	{
		return tipoDeCancamo;
	}


	public void setTipoDeCancamo(int tipoDeCancamo)
	{
		this.tipoDeCancamo = tipoDeCancamo;
	}


	public String getExtremoSuperiorDinamometro()
	{
		return extremoSuperiorDinamometro;
	}


	public void setExtremoSuperiorDinamometro(String extremoSuperiorDinamometro)
	{
		this.extremoSuperiorDinamometro = extremoSuperiorDinamometro;
	}


	public String getExtremoInferiorDinamometro()
	{
		return extremoInferiorDinamometro;
	}


	public void setExtremoInferiorDinamometro(String extremoInferiorDinamometro)
	{
		this.extremoInferiorDinamometro = extremoInferiorDinamometro;
	}


	public int getTipoDeGrillete()
	{
		return tipoDeGrillete;
	}


	public void setTipoDeGrillete(int tipoDeGrillete)
	{
		this.tipoDeGrillete = tipoDeGrillete;
	}


	public int getTipoMotrizPolipasto()
	{
		return tipoMotrizPolipasto;
	}


	public void setTipoMotrizPolipasto(int tipoMotrizPolipasto)
	{
		this.tipoMotrizPolipasto = tipoMotrizPolipasto;
	}


	public int getTipoComponentePrincipalPolipasto()
	{
		return tipoComponentePrincipalPolipasto;
	}


	public void setTipoComponentePrincipalPolipasto(int tipoComponentePrincipalPolipasto)
	{
		this.tipoComponentePrincipalPolipasto = tipoComponentePrincipalPolipasto;
	}


	public int getLongitudBoca()
	{
		return longitudBoca;
	}


	public void setLongitudBoca(int longitudBoca)
	{
		this.longitudBoca = longitudBoca;
	}


	public int getLongitudBrazo()
	{
		return longitudBrazo;
	}


	public void setLongitudBrazo(int longitudBrazo)
	{
		this.longitudBrazo = longitudBrazo;
	}


	public String getSistemaSuperior()
	{
		return sistemaSuperior;
	}


	public void setSistemaSuperior(String sistemaSuperior)
	{
		this.sistemaSuperior = sistemaSuperior;
	}


	public String getModelo()
	{
		return modelo;
	}


	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}


	public Float getApertura()
	{
		return apertura;
	}


	public void setApertura(Float apertura)
	{
		this.apertura = apertura;
	}


	public int getLongitudPala()
	{
		return longitudPala;
	}


	public void setLongitudPala(int longitudPala)
	{
		this.longitudPala = longitudPala;
	}


	public int getDistanciaEntrePalas()
	{
		return distanciaEntrePalas;
	}


	public void setDistanciaEntrePalas(int distanciaEntrePalas)
	{
		this.distanciaEntrePalas = distanciaEntrePalas;
	}


	public int getTipoDeVolteador()
	{
		return tipoDeVolteador;
	}


	public void setTipoDeVolteador(int tipoDeVolteador)
	{
		this.tipoDeVolteador = tipoDeVolteador;
	}


	public int getElementoDeVolteo()
	{
		return elementoDeVolteo;
	}


	public void setElementoDeVolteo(int elementoDeVolteo)
	{
		this.elementoDeVolteo = elementoDeVolteo;
	}


	public int getRangoMovimientoSuperior()
	{
		return rangoMovimientoSuperior;
	}


	public void setRangoMovimientoSuperior(int rangoMovimientoSuperior)
	{
		this.rangoMovimientoSuperior = rangoMovimientoSuperior;
	}


	public int getRangoMovimientoInferior()
	{
		return rangoMovimientoInferior;
	}


	public void setRangoMovimientoInferior(int rangoMovimientoInferior)
	{
		this.rangoMovimientoInferior = rangoMovimientoInferior;
	}


	public String getObservacionesParaCliente()
	{
		return observacionesParaCliente;
	}


	public void setObservacionesParaCliente(String observacionesParaCliente)
	{
		this.observacionesParaCliente = observacionesParaCliente;
	}


	public String getOtrosAccesorios()
	{
		return otrosAccesorios;
	}


	public void setOtrosAccesorios(String otrosAccesorios)
	{
		this.otrosAccesorios = otrosAccesorios;
	}

	
}    
    
    
