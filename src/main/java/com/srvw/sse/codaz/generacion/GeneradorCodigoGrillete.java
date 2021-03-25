package com.srvw.sse.codaz.generacion;

import com.srvw.sse.codaz.Inspeccionable;
import com.srvw.sse.domain.articulo.DatosInspeccionable;
import com.srvw.sse.domain.articulo.Grillete;

public class GeneradorCodigoGrillete extends ACoRGeneracionCodAzuro 
{
    private Grillete grillete;
    public GeneradorCodigoGrillete(DatosInspeccionable datos)
    {
        super(datos);
        grillete = new Grillete(datos.subFamilia,datos.subSubFamilia);
    }

    @Override
    protected boolean _familiaIgualRaiz()
    {
        return grillete.familiaIgualRaiz();
    }
    
    @Override
    protected String _getCodigo()
    {
        grillete.setDiametroBulon(datos.diametroBulon);
        grillete.setTonelaje(Inspeccionable.getMaxCapCarga(datos.carga90, datos.carga45, datos.carga60));
        grillete.setTipo(datos.tipo);
        
        return grillete.getCodigo();
    }
}