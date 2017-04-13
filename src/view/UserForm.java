package view;

import java.io.IOException;
import java.util.Scanner;

import business.UserControll;
import exceptions.InfraExceptions;
import exceptions.UserFinderException;
import exceptions.UserLoginException;
import exceptions.UserPasswordException;
import model.User;

public class UserForm {
	
	UserControll Control = new UserControll();

	public void showMenu(){
		System.out.println("Escolha uma das Opçoes Abaixo: ");
		System.out.println("1 - Adicionar Usuário");
		System.out.println("2 - Listar Usuários");
		System.out.println("3 - Remover Usuário");
		System.out.println("4 - Sair");
	}
	
	public void switchOptions(int op){
		switch(op){
		case 1:
			System.out.println("");
			Scanner reader = new Scanner(System.in);
			System.out.println("Digite um nome de usuário: ");
			String user_name = reader.nextLine();
			System.out.println("Digite uma senha de Usuário: ");
			String user_pass = reader.nextLine();
			User user = new User(user_name, user_pass);
			try {
				Control.addUsuario(user);
			} catch (UserLoginException | UserPasswordException | InfraExceptions | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				Control.listAll();
			} catch (ClassNotFoundException | UserFinderException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			Scanner reader2 = new Scanner(System.in);
			System.out.println("Digite um nome de usuário para Remover: ");
			String user_name2 = reader2.nextLine();
			try {
				Control.removeUsuario(user_name2);
			} catch (UserFinderException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		}
	}
}
