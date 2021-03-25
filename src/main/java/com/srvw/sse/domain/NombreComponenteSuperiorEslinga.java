package com.srvw.sse.domain;

/**
 * Created by arquim on 23/05/17.
 * 
 * insert into sse.lk_componente_superior_eslinga values(0,'A1');
insert into sse.lk_componente_superior_eslinga values(1,'EA1');
insert into sse.lk_componente_superior_eslinga values(2,'Grillete');
insert into sse.lk_componente_superior_eslinga values(3,'VAK1');
insert into sse.lk_componente_superior_eslinga values(4,'VSAK');
insert into sse.lk_componente_superior_eslinga values(5,'Otro');

 */

public final class NombreComponenteSuperiorEslinga extends NombreComponente
{
    private static final String[] n = {"A1","EA1","GRILLETE","VAK1","VSAK","OTRO"};

    public NombreComponenteSuperiorEslinga()
    {
        super();

        setNombreComponente( n );
        MAX_IDX = IComponenteSuperiorEslinga.OTRO_IDX;
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

        final int GRILLETE = 2;

        int index = componente.getIndex();
        if( index == GRILLETE )
            return n[index] + " " + componente.getOtro();

        else
            return super.getNomenclatura(componente);
    }
}
