package com.srvw.sse.domain;

import com.srvw.sse.domain.articulo.IGaza;

public class Gaza implements IGaza
{
    private static final String[] gazas = {"Gaza","Gaza - GuardaCabo","Guardacabo - GuardaCabo","Gazas trenzadas"};
    
    public static final String getJsonTuplaGazas()
    {
        return "[\"Gaza\",\"Gaza - GuardaCabo\",\"Guardacabo - GuardaCabo\",\"Gazas trenzadas\"]";
    }
    
    public static final String[] getTuplaGazas()
    {
        return gazas;
    }
}
