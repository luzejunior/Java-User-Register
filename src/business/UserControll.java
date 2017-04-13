package business;

import java.io.IOException;
import java.util.ArrayList;
import model.User;
import exceptions.InfraExceptions;
import exceptions.UserFinderException;
import exceptions.UserLoginException;
import exceptions.UserPasswordException;
import infra.UserDAO;

public class UserControll {
	ArrayList<User> usuarios = new ArrayList<User>();
	UserDAO reader = new UserDAO();
	
	public void addUsuario(User usuario) throws UserLoginException, UserPasswordException, InfraExceptions, IOException{
		if(usuario.getUserName().isEmpty())
			throw new UserLoginException("Seu usuário está vazio");
		else if(usuario.getUserName().length() > 20)
			throw new UserLoginException("O Seu nome de Usuário não pode conter mais que 20 Caracteres");
		else if(usuario.getUserName().matches(".*%\\d.*"))
			throw new UserLoginException("O Seu nome de Usuário não pode conter números");
		if(usuario.getUserPasswordn().length() > 12 || usuario.getUserPasswordn().length() < 8)
			throw new UserPasswordException("A sua senha não pode ter menos de 8 caracteres e mais de 12 caracteres.");
		usuarios.add(usuario);
		reader.Save(usuarios);
	}
	
	public void removeUsuario(String usuario) throws UserFinderException{
		boolean found_flag = false;
		System.out.println(usuario);
		for(int i=0; i<usuarios.size(); i++){
			System.out.println("" + usuarios.get(i).getUserName());
			if(usuarios.get(i).getUserName().equals(usuario)){
				usuarios.remove(i);
				found_flag = true;
				try {
					reader.Save(usuarios);
				} catch (InfraExceptions | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if(!found_flag){
			throw new UserFinderException("O Usuário Buscado não foi encontrado");
		}
	}
	
	public void listAll() throws UserFinderException, ClassNotFoundException, IOException{
		ArrayList<User> tmpUser = reader.Load();
		usuarios = tmpUser;
		if(usuarios.size() == 0){
			throw new UserFinderException("Não existem usuários para listar");
		}
		for(int i=0; i<usuarios.size(); i++){
			toString(i);
		}
	}
	
	public void toString(int i){
		System.out.println("Usuário numero: " + i);
		System.out.println("User Name: " + usuarios.get(i).getUserName());
		System.out.println("User Password: " + usuarios.get(i).getUserPasswordn());
		System.out.println();
	}
	
}

