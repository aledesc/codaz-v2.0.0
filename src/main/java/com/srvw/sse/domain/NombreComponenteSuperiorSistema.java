package com.srvw.sse.domain;

/**
 * Created by arquim on 23/05/17.
 * 
insert into sse.lk_componente_superior_sistema values(0,'A1');
insert into sse.lk_componente_superior_sistema values(1,'A2');
insert into sse.lk_componente_superior_sistema values(2,'EA1');
insert into sse.lk_componente_superior_sistema values(3,'EA2');
insert into sse.lk_componente_superior_sistema values(4,'EG3/4');
insert into sse.lk_componente_superior_sistema values(5,'G3/4');
insert into sse.lk_componente_superior_sistema values(6,'VAK1');
insert into sse.lk_componente_superior_sistema values(7,'VAK2');
insert into sse.lk_componente_superior_sistema values(8,'VAK4');
insert into sse.lk_componente_superior_sistema values(9,'Otro');
 
 */

public final class NombreComponenteSuperiorSistema extends NombreComponente
{
    private static final String[] n = {"A1","A2","EA1","EA2","EG3/4","G3/4","VAK1","VAK2","VAK4","OTRO"};

    public NombreComponenteSuperiorSistema()
    {
        super();

        setNombreComponente( n );
        MAX_IDX = IComponenteSuperiorSistema.OTRO_IDX;
    }
}
