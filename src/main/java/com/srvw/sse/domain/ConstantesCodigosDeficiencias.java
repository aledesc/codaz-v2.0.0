package com.srvw.sse.domain;

import java.util.HashMap;
import java.util.Map;

public class ConstantesCodigosDeficiencias
{
	private static Map<Integer,String> deficiencia;
	
	static {
		
		deficiencia = new HashMap<Integer,String>();
		
		deficiencia.put(1000,"No acredita cumplimiento de los requisitos Directiva Máquinas o Normas Armonizadas");
		deficiencia.put(1001,"Descripción Normativa Aplicable");
		deficiencia.put(1002,"Anilla sin marca de fabricante");
		deficiencia.put(1003,"Anilla deformada");
		deficiencia.put(1004,"Anilla con desgaste");
		deficiencia.put(1005,"Anilla con corrosión");
		deficiencia.put(1006,"Anilla redonda");
		deficiencia.put(1007,"De la anilla principal ó satélite salen 3 ramales ó más");
		deficiencia.put(1008,"Cadena con desgaste");
		deficiencia.put(1009,"Cadena con estiramientos");
		deficiencia.put(1010,"Cadena con deformación");
		deficiencia.put(1011,"Cadena con corrosión");
		deficiencia.put(1012,"Cadena con paso N.H.");
		deficiencia.put(1013,"Cadena sin marca de fabricante");
		deficiencia.put(1014,"Conector sin marca de fabricante");
		deficiencia.put(1015,"Conector con desgaste");
		deficiencia.put(1016,"Conector con deformación");
		deficiencia.put(1017,"Conector con pasador deteriorado");
		deficiencia.put(1018,"Ganchos sin marca de fabricante");
		deficiencia.put(1019,"Ganchos con boca abierta");
		deficiencia.put(1020,"Ganchos sin pestillo");
		deficiencia.put(1021,"Ganchos con base deteriorada");
		deficiencia.put(1022,"Sistema en cadena sin etiqueta");
		deficiencia.put(2001,"Gazas con hilos rotos");
		deficiencia.put(2002,"Gazas con aplastamientos");
		deficiencia.put(2003,"Casquillo deteriorado");
		deficiencia.put(2004,"Zona de trabajo con hilos rotos");
		deficiencia.put(2005,"Zona de trabajo con aplastamientos");
		deficiencia.put(2006,"Zona de trabajo con cordón roto");
		deficiencia.put(2007,"Zona de trabajo con torceduras ó dobleces");
		deficiencia.put(2008,"Zona de trabajo con desgaste");
		deficiencia.put(2009,"Zona de trabajo con corrosión");
		deficiencia.put(2010,"Eslinga sin etiqueta");
		deficiencia.put(2011,"Eslinga con etiqueta ilegible");
		deficiencia.put(2012,"Sistema en cable sin etiqueta");
		deficiencia.put(2013,"Sistema en cable con etiqueta ilegible");
		deficiencia.put(3001,"Descripción Normativa Aplicable");
		deficiencia.put(3002,"Gazas con corte");
		deficiencia.put(3003,"Gazas con abrasión");
		deficiencia.put(3004,"Zona de trabajo con cortes");
		deficiencia.put(3005,"Zona de trabajo con abrasión");
		deficiencia.put(3006,"Zona de trabajo con calor");
		deficiencia.put(3007,"Zona de trabajo con ácido");
		deficiencia.put(3008,"Hilos internos con cortes");
		deficiencia.put(3009,"Eslinga sin etiqueta");
		deficiencia.put(3010,"Eslinga con etiqueta ilegible");
		deficiencia.put(3011,"Eslinga con nudos");
		deficiencia.put(3012,"Sistema en poliéster sin etiqueta");
	}

	public static String getTextoDeficiencia(Integer key)
	{
		if( key == null )
			return null;
		
		if( key > 3012 )
			return null;
		
		if( key < 3001 )
		{
			if( key > 2013 )
			{
				return null;
			}	
		}
		
		if( key < 2001 )
		{
			if( key > 1022 )
			{
				return null;
			}	
		}

		if( key < 1000 )
		{
			return null;
		}	

		return deficiencia.get(key);
	}
	
	public static void main(String[] args)
	{
		System.out.println(getTextoDeficiencia(3012));
	}
}
