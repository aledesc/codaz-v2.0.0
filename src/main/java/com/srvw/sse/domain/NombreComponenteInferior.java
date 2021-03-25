package com.srvw.sse.domain;

/**
 * Created by arquim on 23/05/17.
 */

public final class NombreComponenteInferior extends NombreComponente
{
	
    private static final String[] n = {"Cáncamo","En Cesto", "EHOS","EHOSB","EPO","EV","Fundición","Gasa","Grillete","GSH","HOS","HOSB","Joker","OK","OKE","PO","VAGH","VCGH","VMVK","VWH","OTRO"};

    public NombreComponenteInferior()
    {
        super();

        setNombreComponente( n );
        MAX_IDX = IComponenteInferior.OTRO_IDX;
    }
    

    /**
     * Retorna nomenclatura del Componente {nombre-diametro} para mostrar comparar con
     * precision en las operaciones de Eliminacion de componentes de la lista.
     *
     * @return
     */
    @Override public String getNomenclatura(Componente componente)
    {
        if( componente == null )
            return "C";

        final int CANCAMO = 0;
        final int GRILLETE = 8;

        int index = componente.getIndex();
        if( (index == CANCAMO) || (index == GRILLETE) )
            return n[index] + " " + componente.getOtro();

        else
            return super.getNomenclatura(componente);
    }
}
