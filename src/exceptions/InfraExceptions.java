package exceptions;

import java.io.FileNotFoundException;

public class InfraExceptions extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4952253479789065303L;
	
	public InfraExceptions(){
		super();
	}
	
	public InfraExceptions(String message){
		super(message);
	}

}
