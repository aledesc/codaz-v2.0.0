package com.srvw.sse.codaz.generacion;

import com.srvw.sse.domain.articulo.DatosInspeccionable;
import com.srvw.sse.domain.articulo.Trincaje;

public class GeneradorCodigoTrincaje extends ACoRGeneracionCodAzuro 
{
    private Trincaje trincaje;
    public GeneradorCodigoTrincaje(DatosInspeccionable datos)
    {
        super(datos);
        trincaje = new Trincaje(datos.subFamilia,datos.subSubFamilia);
    }

    @Override
    protected boolean _familiaIgualRaiz()
    {
        return trincaje.familiaIgualRaiz();
    }
    
    @Override
    protected String _getCodigo()
    {
        trincaje.setNumeroRamales(datos.numeroRamales);
        trincaje.setExtremos(datos.extremos);
        trincaje.setCinta(datos.cinta);
        trincaje.setProteccion(datos.proteccion);
        trincaje.setLongitud(datos.longitudRamal);
        
        return trincaje.getCodigo();
    }
}