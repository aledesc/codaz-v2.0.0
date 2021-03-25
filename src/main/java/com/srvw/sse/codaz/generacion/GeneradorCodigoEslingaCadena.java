package com.srvw.sse.codaz.generacion;

import com.srvw.sse.codaz.Inspeccionable;
import com.srvw.sse.domain.articulo.DatosInspeccionable;
import com.srvw.sse.domain.articulo.EslingaCadena;

public class GeneradorCodigoEslingaCadena extends ACoRGeneracionCodAzuro 
{
    private EslingaCadena eslinga;
    public GeneradorCodigoEslingaCadena(DatosInspeccionable datos)
    {
        super(datos);
        eslinga = new EslingaCadena(datos.subFamilia,datos.subSubFamilia);
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
        eslinga.setDiametro(datos.diametro);
        eslinga.setExtremos(datos.extremos);
        eslinga.setNumeroRamales(datos.numeroRamales);
        eslinga.setTonelaje(Inspeccionable.getMaxCapCarga(datos.carga90, datos.carga45, datos.carga60));
        
        return eslinga.getCodigo();
    }
}