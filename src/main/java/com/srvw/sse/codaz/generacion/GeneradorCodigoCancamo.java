package com.srvw.sse.codaz.generacion;

import com.srvw.sse.codaz.Inspeccionable;
import com.srvw.sse.domain.articulo.Cancamo;
import com.srvw.sse.domain.articulo.DatosInspeccionable;

public class GeneradorCodigoCancamo extends ACoRGeneracionCodAzuro 
{
    private Cancamo cancamo;
    public GeneradorCodigoCancamo(DatosInspeccionable datos)
    {
        super(datos);
        cancamo = new Cancamo(datos.subFamilia,datos.subSubFamilia);
    }

    @Override
    protected boolean _familiaIgualRaiz()
    {
        return cancamo.familiaIgualRaiz();
    }
    
    @Override
    protected String _getCodigo()
    {
        cancamo.setMetricaTornillo(datos.metricaTornillo);
        cancamo.setTonelaje(Inspeccionable.getMaxCapCarga(datos.carga90, datos.carga45, datos.carga60));
        cancamo.setSoldable(datos.esSoldable);
        
        return cancamo.getCodigo();
    }
}