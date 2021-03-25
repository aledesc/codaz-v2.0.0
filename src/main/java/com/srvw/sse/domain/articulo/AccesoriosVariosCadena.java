package com.srvw.sse.domain.articulo;

import java.security.InvalidParameterException;

public class AccesoriosVariosCadena extends ElementoCadenaXDiametro
{
    private static final long serialVersionUID = 6416775462567041790L;

    public AccesoriosVariosCadena(String familia, String subFamilia, String subSubFamilia) throws InvalidParameterException
    {
        super(subFamilia, subSubFamilia);
        raizSubSubFamilia = "9";
    }
}
