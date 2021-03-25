package com.srvw.sse.codaz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class TaxoFamiliar
{
    private static Map<String,String> familia;
    
    static {
        familia = new HashMap<String,String>();
        
        familia.put("F","Eslinga plana");
        familia.put("R","Eslinga redonda");
        familia.put("W","Tejido");
        familia.put("X","Secutex");
        familia.put("M","Otros");
        familia.put("C","Cadena");
        familia.put("H","Aparatos de elevación");
        familia.put("I","Cable");
        familia.put("J","Atípicos");
        familia.put("L","Trincajes");
        familia.put("O","Otros trincajes");
    }
    
    private static Map<String,Map<String,String>> subFamilia;
    
    static 
    {
        
        Map<String,String> _subFamilia = new HashMap<String,String>();

        /*
         * F - Eslingas planas
         */
        _subFamilia.put("H","Hight tech");
        _subFamilia.put("S","Standard");
        _subFamilia.put("U","Unieslingas IBC");
        _subFamilia.put("E","Spectra");
        _subFamilia.put("X","Otros");
        
        subFamilia = new HashMap<String,Map<String,String>>();
        subFamilia.put("F", _subFamilia);
        
        /*
         * R - Eslingas redondas
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("H","Hight tech");
        _subFamilia.put("S","Standard");
        _subFamilia.put("E","Spectra");
        _subFamilia.put("X","Otros");
        subFamilia.put("R", _subFamilia);
        
        /*
         * W _ Tejido
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("A","ASG");
        _subFamilia.put("W","Tejido");
        _subFamilia.put("N","No Cut");
        _subFamilia.put("S","Fundas");
        _subFamilia.put("X","Otros");
        subFamilia.put("W", _subFamilia);

        /*
         * X - Secutex
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("S","Eslingas");
        _subFamilia.put("L","Fundas");
        _subFamilia.put("P","Protección");
        _subFamilia.put("X","Otros");
        _subFamilia.put("D","Diseño");
        subFamilia.put("X", _subFamilia);

        /*
         * M - Otros
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("T","Tow band");
        _subFamilia.put("V","Vads, Nets");
        _subFamilia.put("X","Otros");
        subFamilia.put("M", _subFamilia);

        /*
         * C - Cadena
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("8","Grado 80");
        _subFamilia.put("1","Grado 100");
        _subFamilia.put("R","Prog. Oro");
        _subFamilia.put("E","Exoset");
        subFamilia.put("C", _subFamilia);

        /*
         * H - paratos elevacion
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("H","Hight tech");
        _subFamilia.put("S","Standard");
        subFamilia.put("H", _subFamilia);
        
        
        /*
         * I - Cable
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("C","Especial");
        _subFamilia.put("S","Standard");
        _subFamilia.put("I","Inoxidable");
        _subFamilia.put("A","Accesorios");
        _subFamilia.put("X","Otros");
        subFamilia.put("I", _subFamilia);
        
        
        /*
         * J - Atipicos
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("X","Otros");
        _subFamilia.put("V","Otros");
        subFamilia.put("J", _subFamilia);

        
        /*
         * L  Sistemas de trincaje
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","LF máx 500");
        _subFamilia.put("3","LF máx 3000");
        _subFamilia.put("5","LF máx 5000");
        _subFamilia.put("6","LF máx 6000");
        _subFamilia.put("T","Molinetes de camión");
        _subFamilia.put("X","Otros");
        subFamilia.put("L", _subFamilia);
        
        
        /*
         * O  Otros trincajes
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("I","Interno");
        _subFamilia.put("E","Externo");
        _subFamilia.put("0","Un solo uso");
        _subFamilia.put("D","Dunnage bags");
        _subFamilia.put("X","Otros");
        subFamilia.put("O", _subFamilia);
        
    }
    
    private static Map<String,Map<String,String>> subSubFamilia = new HashMap<String,Map<String,String>>();
    
    static 
    {
        Map<String,String>_subFamilia = new HashMap<String,String>();
        
        /*
         * FH - Eslinga plana - HT
         */
        _subFamilia.put("A","Eslinga A");
        _subFamilia.put("B","Eslinga B");
        _subFamilia.put("C","Eslinga C");
        _subFamilia.put("D","Eslinga D");
        _subFamilia.put("S","Eslinga especial (CS)");
        _subFamilia.put("M","Sistema de elevación");
        _subFamilia.put("P","PH");
        _subFamilia.put("E","Aplicación de segmentos");
        subSubFamilia.put("FH", _subFamilia);
        
        /*
         * FS - Eslinga plana - Standard
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("A","Eslinga A");
        _subFamilia.put("B","Eslinga B");
        _subFamilia.put("C","Eslinga C");
        _subFamilia.put("D","Eslinga D");
        _subFamilia.put("S","Eslinga especial (CS)");
        _subFamilia.put("M","Sistema de elevaci�n");
        _subFamilia.put("E","Aplicación de segmentos");
        subSubFamilia.put("FS", _subFamilia);
        
        /*
         * FU - Eslinga plana - Unieslinga IBC
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("O","Eslinga o");
        subSubFamilia.put("FU", _subFamilia);
        
        /*
         * FE - Eslinga plana - Espectra
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("B","Eslinga B");
        subSubFamilia.put("FE", _subFamilia);

        /*
         * FX - Eslinga plana - Otros
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("1","Accesorios para eslinga plana");
        _subFamilia.put("X","Otros");
        subSubFamilia.put("FX", _subFamilia);
        
        
        /*
         * RH - Eslinga redonda - HT
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("S","Supra");
        _subFamilia.put("G","Magnum");
        _subFamilia.put("X","Magnum X");
        _subFamilia.put("M","Sistema de elevación");
        subSubFamilia.put("RH", _subFamilia);
        
        /*
         * RS - Eslinga redonda - Standard
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("E","Tipo E");
        _subFamilia.put("T","Twintex");
        _subFamilia.put("M","Sistema de elevación");
        subSubFamilia.put("RS", _subFamilia);
        
        /*
         * RE - Eslinga redonda - Espectra
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("E","Espectra");
        subSubFamilia.put("RE", _subFamilia);
        
        /*
         * RX - Eslinga redonda - Otros
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("X","Otros");
        subSubFamilia.put("RX", _subFamilia);
        
        
        /*
         * WA - Tejido - ASG
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","ASG");
        subSubFamilia.put("WA", _subFamilia);
        
        /*
         * WN - Tejido - No cut
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","No cut");
        subSubFamilia.put("WN", _subFamilia);
        
        /*
         * WS - Tejido - Fundas
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","Fundas");
        subSubFamilia.put("WS", _subFamilia);
        
        /*
         * WX - Tejido - Otros
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("X","Otros");
        subSubFamilia.put("WX", _subFamilia);
        
        
        /*
         * XS - Secutex - Eslingas
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("A","Bonded coating tipo A");
        _subFamilia.put("B","Bonded coating tipo B");
        _subFamilia.put("C","Bonded coating tipo C");
        _subFamilia.put("D","Bonded coating tipo D");
        _subFamilia.put("E","Bonded coating tipo CS");
        _subFamilia.put("P","Eslingas con Powerflex");
        _subFamilia.put("X","Eslingas con fundas");
        subSubFamilia.put("XS", _subFamilia);
        
        /*
         * XL - Secutex - Fundas
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","Funda");
        subSubFamilia.put("XL", _subFamilia);
        
        
        /*
         * XP - Secutex - Proteccion
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("G","Proteccion SPG-F");
        _subFamilia.put("W","Proteccion SWH");
        _subFamilia.put("L","Proteccion SPL");
        _subFamilia.put("K","Proteccion SK-B");
        _subFamilia.put("Z","Proteccion SZ");
        subSubFamilia.put("XP", _subFamilia);
        
        /*
         * XX - Secutex - Otros
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("X","Otros");
        subSubFamilia.put("XX", _subFamilia);
        
        /*
         * XD - Secutex - Diseño
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","Jacob");
        subSubFamilia.put("XD", _subFamilia);
        
        
        /*
         * MT - Otros - Tow band
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","Tow band");
        subSubFamilia.put("MT", _subFamilia);
        
        /*
         * MV - Otros - VADS, NETS
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","Vads, Nets");
        subSubFamilia.put("MV", _subFamilia);
        
        /*
         * MX - Otros - Otros
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("X","Otros");
        subSubFamilia.put("MX", _subFamilia);
        
        /*
         * C8 - Cadena - Grado 80
         */
        _subFamilia = new HashMap<String,String>();
//        _subFamilia.put("0","Cadena");
        _subFamilia.put("1","Gancho");
        _subFamilia.put("2","Anilla");
        _subFamilia.put("3","Grillete");
        _subFamilia.put("4","Eslinga");
        _subFamilia.put("5","Cáncamo");
        _subFamilia.put("6","Gancho Acortador");
        _subFamilia.put("7","Malla de conexión");
        _subFamilia.put("9","Accesorios varios");
        subSubFamilia.put("C8", _subFamilia);
        
        /*
         * C1 - Cadena - Grado 100
         */
        _subFamilia = new HashMap<String,String>();
//        _subFamilia.put("0","Cadena");
        _subFamilia.put("1","Gancho");
        _subFamilia.put("2","Anilla");
        _subFamilia.put("3","Grillete");
        _subFamilia.put("4","Eslinga");
        _subFamilia.put("5","Cáncamo");
        _subFamilia.put("6","Gancho Acortador");
        _subFamilia.put("7","Malla de conexión");
        _subFamilia.put("9","Accesorios varios");
        subSubFamilia.put("C1", _subFamilia);
        
        /*
         * CR - Cadena - Prog. Oro
         */
        _subFamilia = new HashMap<String,String>();
//        _subFamilia.put("0","Cadena");
        _subFamilia.put("1","Gancho");
        _subFamilia.put("2","Anilla");
        _subFamilia.put("4","Eslinga");
        _subFamilia.put("5","Cáncamo");
        _subFamilia.put("6","Gancho Acortador");
        _subFamilia.put("7","Malla de conexión");
        _subFamilia.put("9","Accesorios varios");
        subSubFamilia.put("CR", _subFamilia);

        
        /*
         * CE - Cadena - Exoset
         */
        _subFamilia = new HashMap<String,String>();
//        _subFamilia.put("0","Cadena");
        _subFamilia.put("1","Gancho");
        _subFamilia.put("2","Anilla");
        _subFamilia.put("3","Grillete");
        _subFamilia.put("4","Eslinga");
        _subFamilia.put("5","Cáncamo");
        _subFamilia.put("6","Gancho Acortador");
        _subFamilia.put("7","Malla de conexión");
        _subFamilia.put("9","Accesorios varios");
        subSubFamilia.put("CE", _subFamilia);
        

        /*
         * HH - Aparatos elevación - High Tech
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("L","Balancin");
        _subFamilia.put("C","Pinza");
        _subFamilia.put("G","Garza");
        _subFamilia.put("P","Pinza Zclick Zclak");
        _subFamilia.put("B","Porta pallet");
        _subFamilia.put("E","EILON");
        _subFamilia.put("T","Crane");
        _subFamilia.put("A","Gancho C");
        _subFamilia.put("O","Otros");
        _subFamilia.put("V","Volteador");
        subSubFamilia.put("HH", _subFamilia);
        
        
        /*
         * HS - Aparatos elevación - Standard
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("L","Balancin");
        _subFamilia.put("C","Pinza");
        _subFamilia.put("G","Garza");
        _subFamilia.put("P","Horquilla");
        _subFamilia.put("A","Gancho C");
        _subFamilia.put("O","Otros polipastos");
        _subFamilia.put("V","Volteador");
        subSubFamilia.put("HS", _subFamilia);
        
        
        /*
         * IC - Cable - Especial
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","No antigiratorio");
        _subFamilia.put("1","Giratorio");
        _subFamilia.put("2","Eslinga");
        subSubFamilia.put("IC", _subFamilia);
        
        /*
         * IS - Cable - Standard
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","No antigiratorio");
        _subFamilia.put("1","Giratorio");
        _subFamilia.put("2","Eslinga");
        subSubFamilia.put("IS", _subFamilia);
        
        
        /*
         * II - Cable - Inoxidable
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("W","Cable");
        _subFamilia.put("S","Eslinga");
        subSubFamilia.put("II", _subFamilia);
        
        /*
         * IA - Cable - Accesorios
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","Accesorios");
        subSubFamilia.put("IA", _subFamilia);
        
        /*
         * IX - Cable - Accesorios
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("X","Otros");
        subSubFamilia.put("IX", _subFamilia);
        
        /*
         * JX - Atipicos - Otros X
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("X","Otros");
        subSubFamilia.put("JX", _subFamilia);
        
        /*
         * JV - Atipicos - Otros V
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("O","Otros");
        subSubFamilia.put("JV", _subFamilia);
        
        
        /*
         * L0 - Trincaje - LF m-ax 500
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("1","Ref 1155");
        _subFamilia.put("2","Ref 1149-1156");
        _subFamilia.put("3","Ref 1802/4");
        _subFamilia.put("4","Ref 1051");
        _subFamilia.put("5","Ref 1861");
        _subFamilia.put("6","Ref 1152");
        _subFamilia.put("7","Ref 1802/0");
        _subFamilia.put("8","Ref 1131");
        subSubFamilia.put("L0", _subFamilia);
        
        /*
         * L3 - Trincaje - LF m-ax 3000
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("1","Ref 1154");
        _subFamilia.put("2","Ref 1802/P");
        _subFamilia.put("3","Ref 1803/P");
        _subFamilia.put("4","Ref 1804/P");
        _subFamilia.put("5","Ref 2006");
        _subFamilia.put("6","Ref 1803");
        _subFamilia.put("7","Ref 1804/8");
        _subFamilia.put("8","Ref Amarre econo");
        _subFamilia.put("9","Ref 1136");
        subSubFamilia.put("L3", _subFamilia);
        

        /*
         * L5 - Trincaje - LF m-ax 5000
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("1","Sis. amarre ergo");
        _subFamilia.put("2","Sis. amarre ergo plus");
        _subFamilia.put("3","Sis. amarre euro");
        _subFamilia.put("4","Sis. amarre ABS");
        _subFamilia.put("5","Sis. amarre econo");
        _subFamilia.put("6","Sis. amarre molinete");
        _subFamilia.put("7","Sis. amarre 20012");
        _subFamilia.put("8","Sis. amarre ergo ABS");
        _subFamilia.put("9","Sis. amarre ergo new");
        subSubFamilia.put("L5", _subFamilia);
        
        /*
         * L6 - Trincaje - LF m-ax 6000
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("2","Eurokraft");
        _subFamilia.put("3","Superkraft");
        _subFamilia.put("4","Ref 1815 ABS");
        _subFamilia.put("5","Ref 1815");
        subSubFamilia.put("L6", _subFamilia);
        
        /*
         * LT - Trincaje - Molinete camion
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","Molinete camion");
        subSubFamilia.put("LT", _subFamilia);

        
        /*
         * LX - Trincaje - Otros
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("3","Sis. amarre con Kevlar");
        subSubFamilia.put("LX", _subFamilia);
        
        
        /*
         * OI - Otros trincaje - Internos
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","General");
        _subFamilia.put("A","Accesorios");
        _subFamilia.put("W","Componentes de tejido");
        _subFamilia.put("M","Componentes metálicos");
        subSubFamilia.put("OI", _subFamilia);
        
        
        /*
         * OE - Otros trincaje - Externos
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("A","Accesorios");
        _subFamilia.put("W","Componentes de tejido");
        _subFamilia.put("C","Componentes de cadena");
        _subFamilia.put("M","Componentes metálicos");
        subSubFamilia.put("OE", _subFamilia);
        
        /*
         * OO - Otros trincaje - Un solo Uso
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("0","Un solo uso");
        subSubFamilia.put("OO", _subFamilia);
        
        /*
         * OD - Otros trincaje - Dunnage bags
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("O","Dunnage bag");
        subSubFamilia.put("OD", _subFamilia);
        
        /*
         * OX - Otros trincaje - Dunnage bags
         */
        _subFamilia = new HashMap<String,String>();
        _subFamilia.put("X","Otros");
        subSubFamilia.put("OX", _subFamilia);
        
    }
    
    private static final String getJSonFromMap(Map<String,String> map)
    {
      StringBuilder sb = new StringBuilder("[");
      
      int i = 1;
      Set<String> keys = map.keySet();
      int many = keys.size();
      
      for( String key : keys )
      {
          sb.append("{\"key\":\"" + key + "\",\"name\":\"" + map.get(key) + "\"}");
          if( i++ < many )
          {
              sb.append(",");
          }
      }
       
      sb.append("]");
      
      return sb.toString();

    }

    public static final String getJSonFamilias()
    {
        return getJSonFromMap(familia);
    }

    public static final String getJSonSubFamilias(String familia)
    {
        return getJSonFromMap( subFamilia.get(familia) );
    }
    
    public static final String getJSonAllSubFamilias()
    {
        int i = 1;
        Set<String> keys = familia.keySet();
        int many = keys.size();
          
        StringBuilder sb = new StringBuilder("[");
        
        for(String key : keys)
        {
            sb.append("{\"f\":\"" + key + "\",\"sF\":");
            sb.append( getJSonSubFamilias(key)  + "}");
            if( i++ < many )
            {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public static final String getJSonSubSubFamilias(String subFamilia)
    {
        return getJSonFromMap( subSubFamilia.get(subFamilia) );
    }

    public static final String getJSonAllSubSubFamilias()
    {
        int i = 1;
        Set<String> keys = subSubFamilia.keySet();
        int many = keys.size();
          
        StringBuilder sb = new StringBuilder("[");
        
        for(String key : keys)
        {
            sb.append("{\"f\":\"" + key + "\",\"sF\":");
            sb.append( getJSonSubSubFamilias(key) + "}");
            if( i++ < many )
            {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public static Map<String, String> getFamilia()
    {
        return familia;
    }

    public static Map<String, Map<String, String>> getSubFamilia()
    {
        return subFamilia;
    }

    public static Map<String, Map<String, String>> getSubSubFamilia()
    {
        return subSubFamilia;
    }


    private static String _getDescripcion_L_H(String _f, String _subF, String _subsubF)
    {
    	Map<String,String> m = subSubFamilia.get(_f + _subF);
    	
    	if( m == null )
    		return null;
    	
    	/*
    	 * sub sub familia
    	 */
    	String ssf = m.get(_subsubF );
    	if( StringUtils.isEmpty( ssf ) )
    		return null;
    	
    	/*
    	 * sub familia
    	 */
    	Map<String,String> mm = subFamilia.get("H");
    	String sf = mm.get(_subF );
    	
    	if( StringUtils.isEmpty( sf ) )
    		return ssf + ".";
    	
    	else
    		return ssf + ", " + sf + ".";
    }

    public static String getDescripcion(String _familia,String _subFamilia,String _subSubFamilia)
    {
    	final String DEFAULT = "Aparato de elevación.";
    	if( StringUtils.isEmpty(_familia) )
			return( DEFAULT );

    	final String TRINCAJE = "Trincaje.";
    	
    	
		if( _familia.equals("J") || _familia.equals("O") )
			return( TRINCAJE );

		
		if( !_familia.equals("H") && !_familia.equals("L") )
			return( DEFAULT );

				
		StringBuilder desc = new StringBuilder( _familia.equals("H") ? DEFAULT : TRINCAJE );
	
		String t = _getDescripcion_L_H(_familia,_subFamilia,_subSubFamilia );
		if( !StringUtils.isEmpty( t ) )
			desc.append( " " + t );
		
		return desc.toString();
	}

    public static void main(String[] args)
	{
		System.out.println( TaxoFamiliar.getDescripcion("L","5","3") );
		
		String s1 = TaxoFamiliar.getDescripcion("H","H","P");
		System.out.println( s1 );
	}
}
