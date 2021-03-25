package com.srvw.sse.codaz.generacion;

import com.srvw.sse.codaz.Inspeccionable;
import com.srvw.sse.domain.articulo.Anilla;
import com.srvw.sse.domain.articulo.DatosInspeccionable;

public class GeneradorCodigoAnilla extends ACoRGeneracionCodAzuro 
{
    private Anilla anilla;
    
    public GeneradorCodigoAnilla(DatosInspeccionable datos)
    {
        super(datos);
        anilla = new Anilla(datos.subFamilia,datos.subSubFamilia);
    }

    @Override
    protected boolean _familiaIgualRaiz()
    {
        return anilla.familiaIgualRaiz();
    }
    
    @Override
    protected String _getCodigo()
    {
        anilla.setDiametro(datos.diametro);
        anilla.setNumeroRamales(datos.numeroRamales);
        anilla.setTonelaje(Inspeccionable.getMaxCapCarga(datos.carga90, datos.carga45, datos.carga60));
        anilla.setTipo(datos.tipo);
        
        return anilla.getCodigo();
    }
    
}