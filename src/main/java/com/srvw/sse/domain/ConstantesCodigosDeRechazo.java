package com.srvw.sse.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

/**
 * Usado para la generacion legible del co
 * 
 */
class FamiliaCodigos
{
    private String familia;
    private List<CodigoRechazo> codigos;

    
    public FamiliaCodigos(String familia, List<CodigoRechazo> codigos)
    {
        super();
        this.familia = familia;
        this.codigos = codigos;
    }
    
    public String getFamilia()
    {
        return familia;
    }
    public void setFamilia(String familia)
    {
        this.familia = familia;
    }
    public List<CodigoRechazo> getCodigos()
    {
        return codigos;
    }
    public void setCodigos(List<CodigoRechazo> codigos)
    {
        this.codigos = codigos;
    }
    
}

public class ConstantesCodigosDeRechazo
{
    private static Map<String,List<CodigoRechazo>> codigos;

    static 
    {
        
        List<CodigoRechazo> lst = new ArrayList<CodigoRechazo>();
        codigos = new HashMap<String,List<CodigoRechazo>>();
        
        /*
         * inicializamos el codigo genérico
         */
        lst = new ArrayList<CodigoRechazo>();
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Generico.getFamilia(),"Ge-1","No acredita cumplimiento de los requisitos Directiva Máquinas o Normas Armonizadas","Directiva 2006/42/CE"));
        
        codigos.put("*", lst);
        
        
        /*
         * cadena
         */
        lst = new ArrayList<CodigoRechazo>();
        
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-1","Descripción Normativa Aplicable","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-2","Anilla sin marca de fabricante","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-3","Anilla deformada","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-4","Anilla con desgaste","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-5","Anilla con corrosión","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-6","Anilla redonda","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-7","De la anilla principal ó satélite salen 3 ramales ó más","UNE EN 818; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-8","Cadena con desgaste","UNE EN 818; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-9","Cadena con estiramientos","UNE EN 818; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-10","Cadena con deformación","UNE EN 818; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-11","Cadena con corrosión","UNE EN 818; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-12","Cadena con paso N.H.","UNE EN 818; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-13","Cadena sin marca de fabricante","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-14","Conector sin marca de fabricante","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-15","Conector con desgaste","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-16","Conector con deformación","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-17","Conector con pasador deteriorado","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-18","Ganchos sin marca de fabricante","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-19","Ganchos con boca abierta","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-20","Ganchos sin pestillo","UNE EN 818; UNE EN 1677; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-30","Ganchos con base deteriorada","UNE EN 818; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cadena.getFamilia(),"Cd-31","Sistema en cadena sin etiqueta","UNE EN 818; UNE EN 12195"));

        codigos.put("C", lst);
        
        /*
         * cable
         */
        lst = new ArrayList<CodigoRechazo>();
        
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-1","Gazas con hilos rotos","UNE EN 13414; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-2","Gazas con aplastamientos","UNE EN 13414; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-3","Casquillo deteriorado","UNE EN 13414; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-4","Zona de trabajo con hilos rotos","UNE EN 13414; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-5","Zona de trabajo con aplastamientos","UNE EN 13414; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-6","Zona de trabajo con cordón roto","UNE EN 13414; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-7","Zona de trabajo con torceduras ó dobleces","UNE EN 13414; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-8","Zona de trabajo con desgaste","UNE EN 13414; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-9","Zona de trabajo con corrosión","UNE EN 13414; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-10","Eslinga sin etiqueta","UNE EN 13414; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-11","Eslinga con etiqueta ilegible","UNE EN 13414; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-30","Sistema en cable sin etiqueta","UNE EN 13414; UNE EN 12195"));
        lst.add( new CodigoRechazo( CodigoRechazoFamilia.Cable.getFamilia(),"Cb-31","Sistema en cable con etiqueta ilegible","UNE EN 13414; UNE EN 12195"));

        codigos.put("I", lst);

        /*
         * Poliester
         * --
         */
        List<CodigoRechazo> poliester = new ArrayList<CodigoRechazo>();
        
        poliester.add( new CodigoRechazo( CodigoRechazoFamilia.Poliester.getFamilia(),"Pol-1","Descripción Normativa Aplicable","UNE EN 1492; UNE EN 12195"));
        poliester.add( new CodigoRechazo( CodigoRechazoFamilia.Poliester.getFamilia(),"Pol-2","Gazas con corte","UNE EN 1492; UNE EN 12195"));
        poliester.add( new CodigoRechazo( CodigoRechazoFamilia.Poliester.getFamilia(),"Pol-3","Gazas con abrasión","UNE EN 1492; UNE EN 12195"));
        poliester.add( new CodigoRechazo( CodigoRechazoFamilia.Poliester.getFamilia(),"Pol-4","Zona de trabajo con cortes","UNE EN 1492; UNE EN 12195"));
        poliester.add( new CodigoRechazo( CodigoRechazoFamilia.Poliester.getFamilia(),"Pol-5","Zona de trabajo con abrasión","UNE EN 1492; UNE EN 12195"));
        poliester.add( new CodigoRechazo( CodigoRechazoFamilia.Poliester.getFamilia(),"Pol-6","Zona de trabajo con calor","UNE EN 1492; UNE EN 12195"));
        poliester.add( new CodigoRechazo( CodigoRechazoFamilia.Poliester.getFamilia(),"Pol-7","Zona de trabajo con ácido","UNE EN 1492; UNE EN 12195"));
        poliester.add( new CodigoRechazo( CodigoRechazoFamilia.Poliester.getFamilia(),"Pol-8","Hilos internos con cortes","UNE EN 1492; UNE EN 12195"));
        poliester.add( new CodigoRechazo( CodigoRechazoFamilia.Poliester.getFamilia(),"Pol-9","Eslinga sin etiqueta","UNE EN 1492; UNE EN 12195"));
        poliester.add( new CodigoRechazo( CodigoRechazoFamilia.Poliester.getFamilia(),"Pol-10","Eslinga con etiqueta ilegible","UNE EN 1492; UNE EN 12195"));
        poliester.add( new CodigoRechazo( CodigoRechazoFamilia.Poliester.getFamilia(),"Pol-30","Eslinga con nudos","UNE EN 1492; UNE EN 12195"));
        poliester.add( new CodigoRechazo( CodigoRechazoFamilia.Poliester.getFamilia(),"Pol-31","Sistema en poliéster sin etiqueta","UNE EN 1492; UNE EN 12195"));

        
        /*
         * poliester
         */
        codigos.put("P", poliester);
        
        
        /*
         * creamos lista para eslingas redondas, planas y secutex
         * 
         * --
         * eslingas planas
         */
        codigos.put("F", poliester);
        
        
        /*
         * eslingas redondas
         */
        codigos.put("R", poliester);
        
        
        /*
         * secutex
         */
        codigos.put("X", poliester);
        

    }
    
    /**
     * Retorna estructura intermedia para la generacion del cod JSON.
     * 
     * @return
     */
    private static List<FamiliaCodigos> getFamiliaCodigos()
    {
        if( (codigos==null) || codigos.size()<1 )
            return null;
        
        List<FamiliaCodigos> lst = new ArrayList<FamiliaCodigos>();
        
        for(String key : codigos.keySet() )
            lst.add( new FamiliaCodigos( key, codigos.get(key) ) );
        
        return lst;
    }
    
    /**
     * Retorna json de todo el mapa y listas de codigos de rechazo
     * --
     *      
     * @return
     *    [{familia:,codigos:[]}] si familia es un parámetreo correcto
     *    
     *    [] si familia es null, o es cadena vacia "" o cadena de blancos " " o no existe esa familia
     *    o se pasa un familia que no tiene codigos de rechazo
     *    
     */

    public static final String getJSonCodigosRechazo()
    {
        final String EMPTY_JSON = "{}";
        
        if( (codigos==null) || codigos.size()<1 )
            return EMPTY_JSON;
        
        Gson gson = new Gson();

        try
        {
            return gson.toJson( getFamiliaCodigos() );
        } 
        catch (Exception e)
        {
            e.printStackTrace();
            return EMPTY_JSON;
        }
    }
    

    /**
     * Retorna json de codigos de rechazo para una familia
     * --
     * 
     * @param familia
     *      familia cuyos codigos se desean
     *      
     *      
     * @return
     *    [{familia,nombre,descripcion,norma}] si familia es un parámetreo correcto
     *    
     *    [] si familia es null, o es cadena vacia "" o cadena de blancos " " o no existe esa familia
     *    o se pasa un familia que no tiene codigos de rechazo
     *    
     */
    public static final String getJSonCodigosRechazo(String familia)
    {
        final String EMPTY_JSON = "[]";
        
        List<CodigoRechazo> lst = getLstCodigosRechazo(familia);
        
        if( lst == null )
            return EMPTY_JSON;
        
        Gson gson = new Gson();
        
        try
        {
            return gson.toJson( lst );
        } 
        catch (Exception e)
        {
            e.printStackTrace();
            return EMPTY_JSON;
        }

    }
    

    /**
     * Retorna lista de codigos de rechazo para una familia
     * --
     * 
     * @param familia
     *      familia cuyos codigos se desean
     *      
     *      
     * @return
     *    List<CodigoRechazo> si familia es un parámetreo correcto
     *    
     *    CodigoRechazo GENERICO en caso de que no exista esa familia o se pasa un familia que no tiene codigos de rechazo
     *    
     *    null si familia es null, o es cadena vacia "" o cadena de blancos " " 
     *    
     */
    public static final List<CodigoRechazo> getLstCodigosRechazo(String familia)
    {
        if( (familia==null) || StringUtils.isEmpty(familia) || StringUtils.isBlank(familia) )
            return null;
        
        if( (codigos==null) || (codigos.size()<1)  )
            return null;

        if( familia.equals(CodigoRechazoFamilia.Generico.getFamilia()) ||
          ( !familia.equals(CodigoRechazoFamilia.Cable.getFamilia()) &&
            !familia.equals(CodigoRechazoFamilia.Cadena.getFamilia()) &&
            !familia.equals(CodigoRechazoFamilia.Poliester.getFamilia()) &&
            !familia.equals(CodigoRechazoFamilia.PoliesterEslingaPlana.getFamilia()) &&
            !familia.equals(CodigoRechazoFamilia.PoliesterEslingaRedonda.getFamilia()) &&
            !familia.equals(CodigoRechazoFamilia.PoliesterEslingaSecutex.getFamilia()) ))
        {    
            return codigos.get(CodigoRechazoFamilia.Generico.getFamilia());
        }

        List<CodigoRechazo> lst = codigos.get( familia );
        lst.add( codigos.get(CodigoRechazoFamilia.Generico.getFamilia()).get( 0 ) );
        
        return lst;
    }

}
