import java.util.*;

public class Usuario{

	private String userName;
	private String userLogin;

	public Usuario(String userName, String userLogin){
		this.userName = userName;
		this.userLogin = userLogin;
	}

	public String getUserName(){
		return userName;
	}

	public String getUserLogin(){
		return userLogin;
	}

}