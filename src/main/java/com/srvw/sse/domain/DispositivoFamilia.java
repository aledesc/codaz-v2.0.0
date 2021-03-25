package com.srvw.sse.domain;

public enum DispositivoFamilia 
{
    CABLE("I"),
    CADENA("C"),
    ESLINGA_PLANA("F"),
    ESLINGA_REDONDA("R"),
    MIXTO("M");
    
    private String familia;

    DispositivoFamilia(String familia)
    {
        this.familia=familia;
    }

    public String getFamilia()
    {
        return familia;
    }
}
