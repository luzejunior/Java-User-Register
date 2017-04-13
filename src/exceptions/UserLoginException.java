package exceptions;

public class UserLoginException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8451793815784711203L;

	public UserLoginException(){
		super();
	}
	
	public UserLoginException(String message){
		super(message);
	}
}
