package com.srvw.sse.codaz.generacion;

import com.srvw.sse.codaz.Inspeccionable;
import com.srvw.sse.domain.articulo.DatosInspeccionable;
import com.srvw.sse.domain.articulo.GanchoAcortador;

public class GeneradorCodigoGanchoAcortador extends ACoRGeneracionCodAzuro 
{
    private GanchoAcortador elemento;
    public GeneradorCodigoGanchoAcortador(DatosInspeccionable datos)
    {
        super(datos);
        elemento = new GanchoAcortador(datos.subFamilia,datos.subSubFamilia);
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