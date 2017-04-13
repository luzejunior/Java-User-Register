package exceptions;

public class UserFinderException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4659358459431940987L;
	
	public UserFinderException(){
		super();
	}
	
	public UserFinderException(String message){
		super(message);
	}
}
