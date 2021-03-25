package com.srvw.sse.domain.articulo;

import java.io.Serializable;

import com.srvw.sse.codaz.Inspeccionable;

public class Cable extends Inspeccionable implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 7797692358839828390L;
    private Integer resistencia;
    private String extremos;
    private String clasificacionEslingas;
    private Integer medidaAperturaBoca;
    private Integer longitud;
    private String acabado;
    
    
    public Cable(String subFamilia, String subSubFamilia)
    {
        super("I",subFamilia,subSubFamilia);
        raizFamilia = "C(C|S|I|X|A)";
    }


    public Integer getResistencia()
    {
        return resistencia;
    }

    public void setResistencia(Integer resistencia)
    {
        this.resistencia = resistencia;
    }

    public String getAcabado()
    {
        return acabado;
    }

    public void setAcabado(String acabado)
    {
        this.acabado = acabado;
    }

    
    public String getClasificacionEslingas()
    {
        return clasificacionEslingas;
    }

    public void setClasificacionEslingas(String clasificacionEslingas)
    {
        this.clasificacionEslingas = clasificacionEslingas;
    }

    
    public String getExtremos()
    {
        return extremos;
    }

    public void setExtremos(String extremos)
    {
        this.extremos = extremos;
    }
    
    

    public Integer getMedidaAperturaBoca()
    {
        return medidaAperturaBoca;
    }


    public void setMedidaAperturaBoca(Integer medidaAperturaBoca)
    {
        this.medidaAperturaBoca = medidaAperturaBoca;
    }


    public Integer getLongitud()
    {
        return longitud;
    }


    public void setLongitud(Integer longitud)
    {
        this.longitud = longitud;
    }


    @Override
    public String getCodigo()
    {
        final String seis = (getSubSubFamilia() == "2") ? getAcabado() : getClasificacionEslingas();
//        final String ocho = (getSubSubFamilia() == "2") ? getLongitud().toString() : getMedidaAperturaBoca().toString();
        
        return getFamilia() + getSubFamilia() + getSubSubFamilia() + getResistencia() + getExtremos() + seis + getMedidaAperturaBoca() + getLongitud(longitud) + getProveedor();
    }
        
    
    
}
