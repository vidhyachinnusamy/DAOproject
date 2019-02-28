package User.Registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import User.Registration.Basic.RegisterInit;
import User.Registration.DAO.RegisterDAO;
import User.Registration.DAO.RegisterDAOImpl;

public class RegisterNow {
public static void main(String arg[]) throws IOException
{
	RegisterDAO obj = (RegisterDAO) new RegisterDAOImpl();
	BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Name :");
	String name = buff.readLine();
	int roll=Integer.parseInt(buff.readLine());
	RegisterInit ob=new RegisterInit(name,roll);
	boolean b=obj.Insertion(ob);
	if(b)
	{
		System.out.println("Successfully Inserted");
	}
	else
	{
		System.out.println("Failed to insert");
	}
}
}
