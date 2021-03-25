package com.srvw.sse.codaz.generacion;

import com.srvw.sse.domain.articulo.DatosInspeccionable;

public class GeneradorCodigoGenerico extends ACoRGeneracionCodAzuro 
{
    public GeneradorCodigoGenerico(DatosInspeccionable datos)
    {
        super(datos);
    }

    @Override
    protected boolean _familiaIgualRaiz()
    {
        return true;
    }
    
    @Override
    protected String _getCodigo()
    {
        return datos.familia + datos.subFamilia + datos.subSubFamilia + "??????????00";
    }
    
    
    public static void main(String[] args)
    {
        DatosInspeccionable datos = new DatosInspeccionable();
        
        datos.familia="D";
        datos.subFamilia="W";
        datos.subSubFamilia="2";
        
        datos.carga45 = 23;
        datos.carga60 = 45;
        datos.carga90 = 00;
        datos.numeroRamales=4;
        datos.diametro=25d;
        
        GeneradorCodigoGenerico gc = new GeneradorCodigoGenerico(datos);
        
        System.out.println("Cod -> " + gc.getCodigo() );
    }
}