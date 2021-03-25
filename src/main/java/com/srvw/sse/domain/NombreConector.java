package com.srvw.sse.domain;

/**
 * Created by arquim on 23/05/17.
 */

public final class NombreConector extends NombreComponente
{
    private final String[] n = {"KKA","SKR","EV","V","VVS","Grillete","OTRO"};

    public NombreConector()
    {
        super();

        setNombreComponente( n );
        MAX_IDX = IComponenteDeConexion.OTRO_IDX;
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

        final int GRILLETE = 5;

        int index = componente.getIndex();
        if( index == GRILLETE )
            return n[index] + " " + componente.getOtro();

        else
            return super.getNomenclatura(componente);
    }
}
