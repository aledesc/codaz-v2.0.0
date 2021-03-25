package com.srvw.sse.codaz.generacion;

import com.srvw.sse.domain.articulo.Cable;
import com.srvw.sse.domain.articulo.DatosInspeccionable;

public class GeneradorCodigoCable extends ACoRGeneracionCodAzuro 
{
    private Cable cable;
    public GeneradorCodigoCable(DatosInspeccionable datos)
    {
        super(datos);
        cable = new Cable(datos.subFamilia,datos.subSubFamilia);
    }

    @Override
    protected boolean _familiaIgualRaiz()
    {
        return cable.familiaIgualRaiz();
    }
    
    @Override
    protected String _getCodigo()
    {
        cable.setAcabado(datos.extremos);
        
//        trincaje.setNumeroRamales(datos.numeroRamales);
//        trincaje.setExtremos(datos.extremos);
//        trincaje.setCinta(datos.cinta);
//        trincaje.setProteccion(datos.proteccion);
//        trincaje.setLongitud(datos.longitud);
//        
        return null;
    }
}