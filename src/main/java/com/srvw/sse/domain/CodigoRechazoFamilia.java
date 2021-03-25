package com.srvw.sse.domain;

public enum CodigoRechazoFamilia 
{
    Generico("*"),
    Cadena("C"),
    Cable("I"),
    Poliester("P"),
    PoliesterEslingaPlana("F"),
    PoliesterEslingaRedonda("R"),
    PoliesterEslingaSecutex("X");
    
    
    private String familia;
    
    CodigoRechazoFamilia(String familia)
    {
        this.familia=familia;
    }
    
    public String getFamilia()
    {
        return this.familia;
    }
    
}
