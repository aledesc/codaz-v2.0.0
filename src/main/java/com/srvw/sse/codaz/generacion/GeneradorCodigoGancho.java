package com.srvw.sse.codaz.generacion;

import com.srvw.sse.codaz.Inspeccionable;
import com.srvw.sse.domain.articulo.DatosInspeccionable;
import com.srvw.sse.domain.articulo.Gancho;

public class GeneradorCodigoGancho extends ACoRGeneracionCodAzuro 
{
    private Gancho elemento;
    public GeneradorCodigoGancho(DatosInspeccionable datos)
    {
        super(datos);
        elemento = new Gancho(datos.subFamilia,datos.subSubFamilia);
    }

    @Override
    protected boolean _familiaIgualRaiz()
    {
        return elemento.familiaIgualRaiz();
    }
    
    @Override
    protected String _getCodigo()
    {
        elemento.setDiametro(datos.diametro);
        elemento.setTonelaje(Inspeccionable.getMaxCapCarga(datos.carga90, datos.carga45, datos.carga60));
        elemento.setTipo(datos.tipo);
        
        return elemento.getCodigo();
    }
}