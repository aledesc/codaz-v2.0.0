/**
 * 
 */
package com.srvw.sse.codaz;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.srvw.sse.codaz.generacion.GeneradorCodigoAzuro;
import com.srvw.sse.domain.articulo.DatosInspeccionable;

/**
 * @author erik
 *
 */
public class TestGeneradorCodigoAzuro
{
     DatosInspeccionable datos;
     
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception
    {
        datos = new DatosInspeccionable();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception
    {
        datos = null;
    }

    @Test
    public void testTrincaje()
    {
        datos.familia="L";
        datos.subFamilia="X";
        datos.subSubFamilia="X";
        
        datos.carga45 = 23;
        datos.carga60 = 45;
        datos.carga90 = 00;
        datos.numeroRamales=4;
        datos.diametro=25d;
        
        datos.longitudRamal=5;
        datos.cinta="naranjada";
        
        GeneradorCodigoAzuro gc = new GeneradorCodigoAzuro(datos);
        String cod = gc.getCodigo();
        assertTrue( cod.matches("LXX4\\?\\?NAR\\?00500") );
    
    }
    
    @Test
    public void testAnilla()
    {
        datos.familia="C";
        datos.subFamilia="8";
        datos.subSubFamilia="2";
        
        datos.numeroRamales=4;
        datos.diametro=3.2;
        datos.tipo="  1";
        datos.carga90=20;
        
        GeneradorCodigoAzuro gc = new GeneradorCodigoAzuro(datos);
        assertTrue( gc.getCodigo().matches("^C82A4\\?\\?00302000") );
    }
    

}
