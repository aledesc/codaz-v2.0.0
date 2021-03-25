package com.srvw.sse.codaz.generacion;

import java.security.InvalidParameterException;

import com.srvw.sse.codaz.ICodigoAzuro;
import com.srvw.sse.domain.articulo.DatosInspeccionable;

/**
 * COntiene todos los posibles generadores, incluido el gen�rico,para los casos en que solo 
 * se tengan la familia/subFamilia/subSubFamilia y el proveedor, que siempre se tiene -> 00
 * --
 * 
 * @author aledesma
 *
 */
public class GeneradorCodigoAzuro implements ICodigoAzuro
{
    private DatosInspeccionable datos;
    
    public GeneradorCodigoAzuro(DatosInspeccionable datos)
    {
        super();
        
        if( datos == null )
            throw new InvalidParameterException();
        
        this.datos = datos;
    }

        @Override
    public String getCodigo()
    {
        /*
         * creamos eslabones de la cadena
         */
        ACoRGeneracionCodAzuro anilla = new GeneradorCodigoAnilla(datos);
        ACoRGeneracionCodAzuro grillete = new GeneradorCodigoGrillete(datos);
        ACoRGeneracionCodAzuro cancamo = new GeneradorCodigoCancamo(datos);
        ACoRGeneracionCodAzuro gancho = new GeneradorCodigoGancho(datos);
        ACoRGeneracionCodAzuro ganchoAcortador = new GeneradorCodigoGanchoAcortador(datos);
        ACoRGeneracionCodAzuro eslingaTejido = new GeneradorCodigoEslingaTejido(datos);
        ACoRGeneracionCodAzuro eslingaCadena = new GeneradorCodigoEslingaCadena(datos);
        ACoRGeneracionCodAzuro mallaConexion = new GeneradorCodigoMallaConexion(datos);
        ACoRGeneracionCodAzuro trincaje = new GeneradorCodigoTrincaje(datos);
        
        /*
         * este es el ultimo de la cadena
         */
        ACoRGeneracionCodAzuro generico = new GeneradorCodigoGenerico(datos);
        
        
        /*
         * unimos eslabones ergo creamos la cadena
         * --
         * el ultimo elemento siempre tiene que ser el generico.
         * 
         */
        anilla.setNextSolver(grillete);
        grillete.setNextSolver(cancamo);
        cancamo.setNextSolver(gancho);
        gancho.setNextSolver(ganchoAcortador);
        ganchoAcortador.setNextSolver(eslingaTejido);
        eslingaTejido.setNextSolver(eslingaCadena);
        eslingaCadena.setNextSolver(mallaConexion);
        mallaConexion.setNextSolver(trincaje);
        trincaje.setNextSolver(generico);
        
        /*
         * generamos el codigo
         */
        return anilla.getCodigo();
    }

}
