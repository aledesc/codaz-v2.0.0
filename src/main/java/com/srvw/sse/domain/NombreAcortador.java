package com.srvw.sse.domain;

/**
 * Created by arquim on 23/05/17.
 */

public final class NombreAcortador extends NombreComponente
{
    private static final String[] n = {"Cazoleta","EPO","PO","VMUK","OTRO"};

    public NombreAcortador()
    {
        super();

        setNombreComponente( n );
        MAX_IDX = IComponenteAcortador.OTRO_IDX;
    }
}
