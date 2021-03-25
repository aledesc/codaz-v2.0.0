package com.srvw.sse.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by arquim on 23/05/17.
 */

public final class NombreTipoEslinga
{
	private static Map<Integer, String> nombre;

	static
    {
    	nombre = new HashMap<Integer,String>();
    	
		nombre.put(200,"PA");
		nombre.put(201,"PB");
		nombre.put(202,"PC");
		nombre.put(203,"PD");
		nombre.put(204,"PCS");
		nombre.put(205,"HA");
		nombre.put(206,"HB");
		nombre.put(207,"HC");
		nombre.put(208,"HCS");
		nombre.put(209,"SPECTRA");
		nombre.put(300,"SX");
		nombre.put(301,"SXG");
		nombre.put(302,"E");
		nombre.put(303,"EG");
		nombre.put(304,"MAGNUM");
		nombre.put(305,"MAGNUM G");
		nombre.put(306,"MAGNUM X");
		nombre.put(307,"MAGNUM XG");
		nombre.put(308,"TWINTEX");
		nombre.put(309,"SPECTRA");
    }

	public static final String getNombre(int tipoEslinga)
	{
		return nombre.get(tipoEslinga);
	}
	
	public static Map<Integer,String> getMap()
	{
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		for(Integer i: nombre.keySet() )
			map.put( i, nombre.get(i) );
		
		return map;
	}
}
