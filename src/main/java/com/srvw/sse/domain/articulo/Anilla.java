package com.srvw.sse.domain.articulo;

import java.io.Serializable;

public class Anilla extends ElementoCadenaXDiametro implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 2025514985384283220L;
    private int numeroRamales = -1;

    /*
     * ***********************************************************************************
     * NO TOCAR - NO GENERADO
     * *********************************************************************************** 
     */
    public Anilla(String subFamilia, String subSubFamilia)
    {
        super(subFamilia, subSubFamilia);
        raizSubSubFamilia = "2";
    }

    public void setNumeroRamales(int numeroRamales)
    {
        if( (numeroRamales<1) || (numeroRamales>9) )
        {
            this.numeroRamales = 1;
            return;
        }
        
        this.numeroRamales = numeroRamales;
    }

    @Override
    public String getTipo()
    {
        /*
         * o se ha introducido un tipo valido
         */
        if( super.getTipo() != null )
        {
            return super.getTipo();
        }
        
        /*
         * o lo construimos contando ramales
         */
        return "A" + String.valueOf(numeroRamales) + "??";
    }
    
    @Override
    public void setTipo(String tipo)
    {
        if( (tipo!=null) && !tipo.matches("A\\d{3}") )
        {
            tipo = null;
            return;
        }
        super.setTipo(tipo);
    }
    /*
     * ***********************************************************************************
     * FIN - NO TOCAR - NO GENERADO
     * *********************************************************************************** 
     */
    
    public int getNumeroRamales()
    {
        return numeroRamales;
    }

}
