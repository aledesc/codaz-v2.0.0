package com.srvw.sse.domain.articulo;

import java.io.Serializable;

/**
 * DTO para los datos de cada familia.
 * --
 * Parámetro de instanciacion del generador de CodAzuro
 * 
 * Los datos por familias son:
 * 
 *  Cable 
 *      Resistencia
 *      Extremos
 *      ClasificacionEslingas
 *      MedidaAperturaBoca
 *      Longitud
 *      Extremos
 *      
 *  Eslinga-tejido
 *      # Ramales
 *      Extremos
 *      Proteccion
 *      Longitud
 *      capCarga45g
 *      capCarga60g
 *      capCarga90g
 *
 *  Eslinga-cadena
 *      Ramales
 *      Extremos
 *      Longitud
 *      capCarga45g
 *      capCarga60g
 *      capCarga90g
 *      
 *  Tonelaje
 *      Diametro
 *      capCarga45g
 *      capCarga60g
 *      capCarga90g
 *      
 *  Anilla
 *      Ramales
 *      Diametro
 *      capCarga45g
 *      capCarga60g
 *      capCarga90g
 *      
 *  Grillete
 *      DiametroBulon
 *      capCarga45g
 *      capCarga60g
 *      capCarga90g
 *      
 *  Cancamo
 *      MetricaTornillo
 *      capCarga45g
 *      capCarga60g
 *      capCarga90g
 *      
 *  Trincaje
 *      Ramales
 *      Extremos
 *      Cinta
 *      Proteccion
 *      Longitud
 *      
 * @author erik
 *
 */
public class DatosInspeccionable implements Serializable
{
//  /*
//  * Datos PAra Generacion Cod Azuro
//  * --
//  * 
//  * taxo
//  */
// private String familia;
// private String subFamilia;
// private String subSubFamilia;
// 
// /*
//  * cable
//  */
// private Double resistencia;
// private String clasificacionEslingas;
// private Double medidaAperturaBoca;
// private String acabado;
// 
// /*
//  * anillas, 
//  */
// private String tipo;
// private Double diametro;
// 
// /*
//  * anillas, eslingas
//  */
// private int numeroRamales;
// private Double carga45Grados;
// private Double carga60Grados;
// private Double carga90Grados;
// 
// /*
//  * grillete
//  */
// private Double metricaTornillo;
// private boolean esSoldable;
// 
// /*
//  * cancamo
//  */
// private Double diametroBulon;
// 
// /*
//  * eslinga tejido
//  */
// private Double longitud;
// private Double ancho;
// private String extremos;
// private String proteccion;
//
// /*
//  * trincaje
//  */
// private String cinta;

    private static final long serialVersionUID = -1613950000085279340L;

    /*
     * clasificacion azuro
     */
    public String familia;
    public String subFamilia;
    public String subSubFamilia;

    /*
     * eslingas
     */
    public int numeroRamales = 1;
    public int carga90;
    public int longitudRamal;
    public int longitudSistema;
    
    
    /*
     * eslingas y cables pueden llevar gazas en los extremos
     * --
     * de aqui que hay un tipo para ello...
     */
    public String extremos;
    
    
    
    /*
     * si extremos son gazas, sirve tambien para cables
     */
    public int longitudGazas;
    
    
    /*
     * sistema elevacion
     */
    public int numeroRamalesIguales = 0;
    public int carga45;
    public Integer carga60;
    
    
    /*
     * cadena, cable y elementos de la eslinga o dispositivo o componente
     */
    public Double diametro;
    
    
    /*
     * cable
     */
    public int composicion;
    
    
    public Integer resistencia;
    public String clasificacionEslingas;
    public Integer medidaAperturaBoca;
    
    
    
    /*
     * eslinga tejido
     */
    public Integer ancho;
    public String proteccion;
    
    
    /*
     * anillas, 
     */
    public String tipo;
    
    /*
     * grillete
     */
    public Integer metricaTornillo;
    public boolean esSoldable;
    
    /*
     * cancamo
     */
    public Double diametroBulon;
    
    /*
     * trincaje
     */
    public String cinta;

    /*
     * dispositivo o elemento
     */
    public boolean esDispositivo = true;
    
    public boolean esComponenteSuperior = false;
    public boolean esConexionSuperior = false;
    public boolean esConexionInferior = false;
    public boolean esElementoInferior = false;
    
    public DatosInspeccionable()
    {
        super();
    }

    
}
