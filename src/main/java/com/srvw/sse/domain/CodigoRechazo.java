package com.srvw.sse.domain;

import java.io.Serializable;

import com.google.gson.annotations.Expose;

public class CodigoRechazo implements Serializable
{
    private static final long serialVersionUID = -4771147249438519394L;
    
    @Expose(serialize = true,deserialize = true)
    private int id;
    
    @Expose(serialize = true,deserialize = true)
    private String codigo;
    
    private String familia;
    private String descripcion;
    private String norma;

    @Expose(serialize = true,deserialize = true)
    private String foto;

        
    public CodigoRechazo()
    {
        super();
    }
    
    
    public CodigoRechazo(String codigo)
    {
        super();
        this.codigo=codigo;
    }
    
    public CodigoRechazo(String familia, String codigo, String descripcion, String norma)
    {
        super();
        this.familia = familia;
        this.codigo=codigo;
        this.descripcion = descripcion;
        this.norma = norma;
    }
       
    
    
    public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getCodigo()
	{
		return codigo;
	}


	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}


	public String getFamilia()
	{
		return familia;
	}


	public void setFamilia(String familia)
	{
		this.familia = familia;
	}


	public String getDescripcion()
	{
		return descripcion;
	}


	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}


	public String getNorma()
	{
		return norma;
	}


	public void setNorma(String norma)
	{
		this.norma = norma;
	}

	public String getFoto()
	{
		return foto;
	}
	public void setFoto(String foto)
	{
		this.foto = foto;
	}


	
	@Override
	public String toString()
	{
		return "CodigoRechazo [codigo=" + codigo + ", familia=" + familia + ", descripcion=" + descripcion + ", norma="
				+ norma + ", foto=" + foto + "]";
	}


//	public static void main(String[] args)
//	{
//		Gson gson = new Gson();
//    	
//		String json = "[{\"codigo\":\"1001\",\"foto\":\"I_75_R_001_F_20170808_-1926950791.JPG\"},{\"codigo\":\"1002\",\"foto\":\"I_75_R_001_F_20170808_-945069514.JPG\"},{\"codigo\":\"1000\",\"foto\":\"I_75_R_001_F_20170808_1825688742.JPG\"}]";
//
//		Type listTypeCR = new TypeToken<ArrayList<CodigoRechazo>>(){}.getType();
//        List<CodigoRechazo> cr = gson.fromJson(json,listTypeCR);
//		
//		
//		for(CodigoRechazo cR: cr)
//		{
//			System.out.println( cR.toString() );
//		}
//		
//		
//		json = gson.toJson( cr );
//		
//		System.out.println( "JSON\n-------------------------------------\n"  + json );
//		
//		
//	}
    
}
