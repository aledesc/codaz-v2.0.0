package com.srvw.sse.codaz.generacion;

import com.srvw.sse.codaz.Inspeccionable;
import com.srvw.sse.domain.articulo.DatosInspeccionable;
import com.srvw.sse.domain.articulo.EslingaTejido;

public class GeneradorCodigoEslingaTejido extends ACoRGeneracionCodAzuro 
{
    private EslingaTejido eslinga;
    public GeneradorCodigoEslingaTejido(DatosInspeccionable datos)
    {
        super(datos);
        eslinga = new EslingaTejido(datos.familia,datos.subFamilia,datos.subSubFamilia);
    }

    @Override
    protected boolean _familiaIgualRaiz()
    {
        return eslinga.familiaIgualRaiz();
    }
    
    @Override
    protected String _getCodigo()
    {
        eslinga.setLongitud(datos.longitudRamal);
        eslinga.setAncho(datos.ancho);
        eslinga.setExtremos(datos.extremos);
        eslinga.setTipoProteccion(datos.proteccion);
        eslinga.setNumeroRamales(datos.numeroRamales);
        eslinga.setTonelaje(Inspeccionable.getMaxCapCarga(datos.carga90, datos.carga45, datos.carga60));
        
        return eslinga.getCodigo();
    }
    
    
    public static void main(String[] args)
    {
        DatosInspeccionable datos = new DatosInspeccionable();
        
        datos.familia="F";
        datos.subFamilia="H";
        datos.subSubFamilia="S";
        
        datos.carga45 = 23;
        datos.carga60 = 45;
        datos.carga90 = 90;
        datos.numeroRamales=4;
        datos.longitudRamal=5;
        datos.extremos="DD";

        GeneradorCodigoEslingaTejido gc = new GeneradorCodigoEslingaTejido(datos);
        
        System.out.println("Cod -> " + gc.getCodigo() );
    }
}