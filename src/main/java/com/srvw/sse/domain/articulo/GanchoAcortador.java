package com.srvw.sse.domain.articulo;

import java.security.InvalidParameterException;

public class GanchoAcortador extends ElementoCadenaXDiametro
{
    /**
     * 
     */
    private static final long serialVersionUID = 5082317125157946177L;

    public GanchoAcortador(String subFamilia, String subSubFamilia) throws InvalidParameterException
    {
        super(subFamilia, subSubFamilia);
        raizSubSubFamilia = "6";
    }
}
