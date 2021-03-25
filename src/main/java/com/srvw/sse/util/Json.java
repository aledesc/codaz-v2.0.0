package com.srvw.sse.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.servitware.core.id.base.InvalidIdException;
import com.servitware.core.id.base.InvalidNameException;
import com.servitware.id.core.id.util.LookUp;

public class Json
{
    static final String EMPTY_ARRAY = "[]";
    static final String EMPTY_OBJECT = "{}";
    
    /**
     * Return Json {key:int,value:str} String for Map<String,String>
     *  
     * @param map
     * @return
     */
    public static final String lookUp2Json(List<LookUp> lst)
    {
        if( (lst == null) || (lst.size()<1) )
        {
            return EMPTY_ARRAY;
        }
        
   	 	Gson gson = new Gson();
   	 	return gson.toJson(lst);
    }

    /**
     * Return Json {key:int,value:str} String for Map<String,String>
     *  
     * @param map
     * @return
     */
    public static final String map2JsonLookUpLst(Map<Integer,String> map)
    {
        if( (map == null) || (map.size()<1) )
        {
            return null;
        }
        
        List<LookUp> lst = new ArrayList<LookUp>();
        
        for(Integer i : map.keySet())
        {
	   		 try
	   		 {
	   			 lst.add(new LookUp(i,map.get(i)));
	   		 }
	    	 catch(InvalidIdException ei)
	    	 {
	    		 continue;
	    	 }
	    	 catch(InvalidNameException e)
	    	 {
	    		 continue;
	    	 }
        }

        if( lst.size() < 1 )
        	return EMPTY_ARRAY;
        
   	 	Gson gson = new Gson();
   	 	return gson.toJson(lst);
    }

    public static void main(String[] args)
	{
		List<LookUp> lst = new ArrayList<LookUp>();
    	Map<String,String> map = new HashMap<String,String>();
    	 map.put("1", "value1");
    	 map.put("2", "value2");
    	 
    	 for(String s: map.keySet())
    		 try
    		 {
    			 lst.add(new LookUp(Integer.valueOf(s),map.get(s)));
    		 }
	    	 catch(InvalidIdException ei)
	    	 {
	    		 continue;
	    	 }
	    	 catch(InvalidNameException e)
	    	 {
	    		 continue;
	    	 }
	    	 catch(NumberFormatException ee)
	    	 {
	    		 continue;
	    	 }
    	 
    	 Gson gson = new Gson();
    	 System.out.println("the list --> " +  gson.toJson(lst));
    	 System.out.println("the map --> " +  gson.toJson(map));
	}
}
