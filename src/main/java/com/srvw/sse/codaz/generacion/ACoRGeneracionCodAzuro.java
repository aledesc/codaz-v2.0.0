package com.srvw.sse.codaz.generacion;

import com.srvw.sse.domain.articulo.DatosInspeccionable;

public abstract class ACoRGeneracionCodAzuro 
{
    protected final int GO_NEXT = -1;
    protected DatosInspeccionable datos;
    
    /*
     * apunta al siguiente eslabon en la cadena
     */
    protected ACoRGeneracionCodAzuro nextInspeccionable;

    
    public ACoRGeneracionCodAzuro(DatosInspeccionable datos)
    {
        super();
        this.datos = datos;
    }

    protected abstract String _getCodigo();
    protected abstract boolean _familiaIgualRaiz();

    /*
     * enlaza con el siguiente eslabon en la cadena
     */
    public void setNextSolver(ACoRGeneracionCodAzuro inspeccionable)
    {
        this.nextInspeccionable = inspeccionable;
    }


    public String getCodigo()
    {
        String result = null;
        
        
        if( _familiaIgualRaiz() )
        {
           result = _getCodigo();
        }
        else if(nextInspeccionable != null)
        {
            result = nextInspeccionable.getCodigo();
        }
        
        return result;
    }

}