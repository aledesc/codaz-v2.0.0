package com.srvw.sse.domain;

import java.util.List;

import com.google.gson.annotations.Expose;

public final class Ramales
{
    public static int MIN_RAMAL = 0;
    public static int CANT_POR_DEFECTO = 2;
    public static int CANT_MAXIMA = 4;

    @Expose(serialize = true,deserialize = true)
    private String nombre = "RAMALES";

    @Expose(serialize = true,deserialize = true)
    private List<Ramal> ramales = null;

    public Ramales()
    {
    }

    public int getCantidad()
    {
        return (ramales == null) ? 0 : ramales.size();
    }


    public List<Ramal> getRamales() {
        return ramales;
    }

    public void setRamales(List<Ramal> ramales)
    {
        this.ramales = ramales;
    }

}