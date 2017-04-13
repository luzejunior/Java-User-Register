package view;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserForm program = new UserForm();
		
		while(true){
			Scanner scan = new Scanner(System.in);
			program.showMenu();
			int option = scan.nextInt();
			if(option == 4){
				break;
			}else{
				program.switchOptions(option);
			}
		}
	}

}
