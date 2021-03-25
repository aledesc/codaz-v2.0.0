package com.srvw.sse.domain.articulo;

import java.security.InvalidParameterException;

public class MallaConexion extends ElementoCadenaXDiametro 
{
    /**
     * 
     */
    private static final long serialVersionUID = -5352606773190697965L;

    public MallaConexion(String subFamilia, String subSubFamilia) throws InvalidParameterException
    {
        super(subFamilia, subSubFamilia);
        raizSubSubFamilia = "7";
    }
}
