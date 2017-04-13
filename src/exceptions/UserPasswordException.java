package exceptions;

public class UserPasswordException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1244646804315661121L;

	public UserPasswordException(){
		super();
	}
	
	public UserPasswordException(String message){
		super(message);
	}
}
