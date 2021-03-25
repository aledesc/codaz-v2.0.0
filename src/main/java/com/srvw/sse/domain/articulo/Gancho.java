package com.srvw.sse.domain.articulo;

import java.security.InvalidParameterException;

public class Gancho extends ElementoCadenaXDiametro
{
    /**
     * 
     */
    private static final long serialVersionUID = 4930489507469558191L;

    public Gancho(String subFamilia, String subSubFamilia) throws InvalidParameterException
    {
        super(subFamilia, subSubFamilia);
        raizSubSubFamilia = "1";
    }
}
