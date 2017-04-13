package infra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import exceptions.InfraExceptions;
import model.User;

public class UserDAO{
	
	protected FileOutputStream file_out;
	protected FileInputStream file_in;
	protected ObjectOutputStream out;
	protected ObjectInputStream in;
 
	public void Save(ArrayList<User> usuarios) throws InfraExceptions, IOException{
		file_out = new FileOutputStream("usuarios.bin");
		out = new ObjectOutputStream(file_out);
		out.writeObject(usuarios);
		out.close();
		file_out.close();
	}
	
	public ArrayList<User> Load() throws IOException, ClassNotFoundException{
		file_in = new FileInputStream("usuarios.bin");
		in = new ObjectInputStream(file_in);
		ArrayList<User> tmpUser = (ArrayList<User>) in.readObject();
		in.close();
		file_in.close();
		return tmpUser;
	}
}
