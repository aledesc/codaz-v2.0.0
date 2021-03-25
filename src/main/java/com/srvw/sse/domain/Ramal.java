package com.srvw.sse.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ramal implements Serializable
{
    private static final long serialVersionUID = -4789397160154329145L;

    private int id;
    private int igualA;

    /*
     * para ramales de poliester
     */
    private int tipoPoliester;
    
    /*
     * tipos que llevan un subtipo, por ej.
     * 
     * 	- Poliester redondo E y EG  15, 30, 60, 150....
     * 						RS 3000, 5000, 
     */
    private int subTipoPoliester;

    /*
     * para poliester no tipificado
     */
    private String otroTipoPoliester;
    
    private int longitud;
    
    private int ancho;
    private int espesor;
    private int tipoProteccion;
    private int longitudProteccion;
    private String diametro;
    private int gazas;
    private int longitudGazas;
    
    private ComponenteInferior componenteInferior;
    
    private List<ComponenteAcortador> acortadores;
    private List<ComponenteConector> conexionesSuperiores;
    private List<ComponenteConector> conexionesInferiores;

    
    /********************************************************************************
     * NO TOCAR
     * ---
     * COD. NO GENERADO
     * -------------------------------------------------------------------------------
     *********************************************************************************
     */
    public Ramal()
    {
        super();
    }
    
    public Ramal(int id)
    {
    	super();
    	this.id = id;
    }

    public final void addAcortador(ComponenteAcortador acortador)
    {
        if( acortador == null )
            return;
        
        if( acortadores==null )
            acortadores = new ArrayList<ComponenteAcortador>();
        
        acortadores.add(acortador);
    }

    public final void addConexionSuperior(ComponenteConector conexion)
    {
        if( conexion == null )
            return; 
        
        if( conexionesSuperiores == null )
        	conexionesSuperiores = new ArrayList<ComponenteConector>();
        
        conexionesSuperiores.add( conexion );
    }
    
    public final void addConexionInferior(ComponenteConector conexion)
    {
        if( conexion == null )
            return; 
        
        if( conexionesInferiores == null )
        	conexionesInferiores = new ArrayList<ComponenteConector>();
        
        conexionesInferiores.add( conexion );
    }
    /********************************************************************************
     * FIN NO TOCAR
     * -------------------------------------------------------------------------------
     *********************************************************************************
     */

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getIgualA()
	{
		return igualA;
	}

	public void setIgualA(int igualA)
	{
		this.igualA = igualA;
	}

	public int getLongitud()
	{
		return longitud;
	}

	public void setLongitud(int longitud)
	{
		this.longitud = longitud;
	}

	public int getAncho()
	{
		return ancho;
	}

	public void setAncho(int ancho)
	{
		this.ancho = ancho;
	}

	public int getEspesor()
	{
		return espesor;
	}

	public void setEspesor(int espesor)
	{
		this.espesor = espesor;
	}

	public int getTipoProteccion()
	{
		return tipoProteccion;
	}

	public void setTipoProteccion(int tipoProteccion)
	{
		this.tipoProteccion = tipoProteccion;
	}

	public int getLongitudProteccion()
	{
		return longitudProteccion;
	}

	public void setLongitudProteccion(int longitudProteccion)
	{
		this.longitudProteccion = longitudProteccion;
	}

	public String getDiametro()
	{
		return diametro;
	}

	public void setDiametro(String diametro)
	{
		this.diametro = diametro;
	}

	public int getGazas()
	{
		return gazas;
	}

	public void setGazas(int gazas)
	{
		this.gazas = gazas;
	}

	public int getLongitudGazas()
	{
		return longitudGazas;
	}

	public void setLongitudGazas(int longitudGazas)
	{
		this.longitudGazas = longitudGazas;
	}

	public ComponenteInferior getComponenteInferior()
	{
		return componenteInferior;
	}

	public void setComponenteInferior(ComponenteInferior componenteInferior)
	{
		this.componenteInferior = componenteInferior;
	}

	public List<ComponenteAcortador> getAcortadores()
	{
		return acortadores;
	}

	public void setAcortadores(List<ComponenteAcortador> acortadores)
	{
		this.acortadores = acortadores;
	}

	public List<ComponenteConector> getConexionesSuperiores()
	{
		return conexionesSuperiores;
	}

	public void setConexionesSuperiores(List<ComponenteConector> conexionesSuperiores)
	{
		this.conexionesSuperiores = conexionesSuperiores;
	}

	public List<ComponenteConector> getConexionesInferiores()
	{
		return conexionesInferiores;
	}

	public void setConexionesInferiores(List<ComponenteConector> conexionesInferiores)
	{
		this.conexionesInferiores = conexionesInferiores;
	}

	public int getTipoPoliester()
	{
		return tipoPoliester;
	}

	public void setTipoPoliester(int tipoPoliester)
	{
		this.tipoPoliester = tipoPoliester;
	}


	public int getSubTipoPoliester() {
		return subTipoPoliester;
	}

	public void setSubTipoPoliester(int subTipoPoliester) {
		this.subTipoPoliester = subTipoPoliester;
	}

	public String getOtroTipoPoliester()
	{
		return otroTipoPoliester;
	}

	public void setOtroTipoPoliester(String otroTipoPoliester)
	{
		this.otroTipoPoliester = otroTipoPoliester;
	}
}
