package com.srvw.sse.domain.articulo;

public class ArticuloCatalogo 
{
	private String descriptor;
	private String ndescriptor;
	private String descripcion;

	private String grupo;
	private String familia;
	private String subfamilia;
	private String subsubfamilia;
	
	private int unidadVenta;
	private double precio;
	private String descripcion1;
	private String descripcion2;
	private String descripcion3;
	private String descripcion4;
	
	
    public ArticuloCatalogo()
    {
        super();
    }
    
    public String getDescriptor()
    {
        return descriptor;
    }
    public void setDescriptor(String descriptor)
    {
        this.descriptor = descriptor;
    }
    public String getNdescriptor()
    {
        return ndescriptor;
    }
    public void setNdescriptor(String ndescriptor)
    {
        this.ndescriptor = ndescriptor;
    }
    public String getDescripcion()
    {
        return descripcion;
    }
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    public String getGrupo()
    {
        return grupo;
    }
    public void setGrupo(String grupo)
    {
        this.grupo = grupo;
    }
    public String getFamilia()
    {
        return familia;
    }
    public void setFamilia(String familia)
    {
        this.familia = familia;
    }
    public String getSubfamilia()
    {
        return subfamilia;
    }
    public void setSubfamilia(String subfamilia)
    {
        this.subfamilia = subfamilia;
    }
    public String getSubsubfamilia()
    {
        return subsubfamilia;
    }
    public void setSubsubfamilia(String subsubfamilia)
    {
        this.subsubfamilia = subsubfamilia;
    }
    public int getUnidadVenta()
    {
        return unidadVenta;
    }
    public void setUnidadVenta(int unidadVenta)
    {
        this.unidadVenta = unidadVenta;
    }
    public double getPrecio()
    {
        return precio;
    }
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    public String getDescripcion1()
    {
        return descripcion1;
    }
    public void setDescripcion1(String descripcion1)
    {
        this.descripcion1 = descripcion1;
    }
    public String getDescripcion2()
    {
        return descripcion2;
    }
    public void setDescripcion2(String descripcion2)
    {
        this.descripcion2 = descripcion2;
    }
    public String getDescripcion3()
    {
        return descripcion3;
    }
    public void setDescripcion3(String descripcion3)
    {
        this.descripcion3 = descripcion3;
    }
    public String getDescripcion4()
    {
        return descripcion4;
    }
    public void setDescripcion4(String descripcion4)
    {
        this.descripcion4 = descripcion4;
    }

    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descriptor == null) ? 0 : descriptor.hashCode());
        result = prime * result + ((familia == null) ? 0 : familia.hashCode());
        result = prime * result + ((grupo == null) ? 0 : grupo.hashCode());
        result = prime * result + ((ndescriptor == null) ? 0 : ndescriptor.hashCode());
        result = prime * result + ((subfamilia == null) ? 0 : subfamilia.hashCode());
        result = prime * result + ((subsubfamilia == null) ? 0 : subsubfamilia.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ArticuloCatalogo other = (ArticuloCatalogo) obj;
        if (descriptor == null)
        {
            if (other.descriptor != null)
                return false;
        } else if (!descriptor.equals(other.descriptor))
            return false;
        if (familia == null)
        {
            if (other.familia != null)
                return false;
        } else if (!familia.equals(other.familia))
            return false;
        if (grupo == null)
        {
            if (other.grupo != null)
                return false;
        } else if (!grupo.equals(other.grupo))
            return false;
        if (ndescriptor == null)
        {
            if (other.ndescriptor != null)
                return false;
        } else if (!ndescriptor.equals(other.ndescriptor))
            return false;
        if (subfamilia == null)
        {
            if (other.subfamilia != null)
                return false;
        } else if (!subfamilia.equals(other.subfamilia))
            return false;
        if (subsubfamilia == null)
        {
            if (other.subsubfamilia != null)
                return false;
        } else if (!subsubfamilia.equals(other.subsubfamilia))
            return false;
        return true;
    }
    @Override
    public String toString()
    {
        return "Articulo [descriptor=" + descriptor + ", ndescriptor=" + ndescriptor + ", descripcion=" + descripcion
                + ", grupo=" + grupo + ", familia=" + familia + ", subfamilia=" + subfamilia + ", subsubfamilia="
                + subsubfamilia + ", unidadVenta=" + unidadVenta + ", precio=" + precio + ", descripcion1="
                + descripcion1 + ", descripcion2=" + descripcion2 + ", descripcion3=" + descripcion3 + ", descripcion4="
                + descripcion4 + "]";
    }
	
	
}

