package com.srvw.sse.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileNameExtensionUtils
{

	public static void pictureFileNameExtensionToUpperCase(File dir)
	{
		final String JPG = ".JPG";
		
		if( !dir.exists() )
			return;
		
		if( !dir.isDirectory() )
			return;
		
		File[] files = dir.listFiles();
		
		StringBuilder fileName = new StringBuilder();
		
		int i = 0;
		for(File f: files )
		{
			if( f.isDirectory() )
				continue;
			
			fileName.delete(0,fileName.length());
			
			int pos = f.getName().lastIndexOf('.');
			
			if( pos == -1 )
				fileName.append( f.getName() + JPG);
			else
			{
				fileName.append( f.getName().substring(0,pos) + JPG);
					
			}
			
			++i;
			System.out.println( "- " + fileName.toString() );
			
			
			File newFile = new File( f.getParent(), fileName.toString() );
			try
			{
				Files.move(f.toPath(), newFile.toPath());
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println( "--\nCambiados -> " + i + " file names." );
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		final String path = "/usr/tomcat/webapps/statico/img/sse/cliente/1/equipo";
		final File dir = new File( path );
		
		pictureFileNameExtensionToUpperCase(dir);
	}
}
