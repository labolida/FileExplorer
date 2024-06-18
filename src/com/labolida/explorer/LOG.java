package com.labolida.explorer;

/**
 * USE:
 * private LOG log = new LOG(this.getClass());
 * log.write(e, "messageString");
 */

public class LOG {

	private Class classname;
	
	public LOG(Class classname) {
		try {
			this.classname=classname;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void write( Exception ex , String message ) {
		System.out.println( classname.getCanonicalName() + " : " + message + " : " + ex.getMessage() );
	}
	public void write( String message ) {
		System.out.println( classname.getCanonicalName() + " : " + message );
	}
	
}
