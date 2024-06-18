package com.labolida.explorer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// UTILS
public class FileManager {

	public static String[] getFiles ( String directory ) throws Exception {
		try{
			File fileObj  =   new File(directory);
			File files[]  =   fileObj.listFiles();
			
			String returns = new String();
			
			for (int i=0; i<files.length; i++ ) {
				if ( files[i].isFile() ) {
					returns = returns +  files[i].getName() + "%%";
				}
			}
			return returns.split("%%");	
		}
		catch(Exception e){
			throw new Exception( "Error at FileManager.getFiles():  directory="+directory + " error=" + e.getMessage() );
		}
	}

	public static String getExtension ( String fileName ) {
		String arr[] = fileName.split("\\.");
		return arr[arr.length-1];
	}
	
	public static byte[] read ( String filePath ) throws Exception {
		try{
			File file = new File(filePath);
			FileInputStream fis = new FileInputStream( file );
			byte content[] = new byte[(int)file.length()];
			fis.read(content);
			fis.close();
			return content;
		}
		catch(Exception e){
			throw new Exception( "Error at FileManager.readFile():  directory="+filePath + " error=" + e.getMessage() );
		}

	}
	
	public static void write ( String filePath , byte[] content ) throws Exception {
		try{
			File file = new File(filePath);
			FileOutputStream fos = new FileOutputStream( file );
			fos.write(content);
			fos.close();
		}
		catch(Exception e){
			throw new Exception( "Error at FileManager.writeFile():  directory="+filePath + " error=" + e.getMessage() );
		}

	}
	
	public static void delete ( String filePath  ) {
		File file = new File(filePath);
		file.delete();
	}
	
}
