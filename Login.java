package studman;

import java.util.HashMap;
import java.util.Scanner;

public class Login {
	
	Scanner in = new Scanner(System.in);
	
	public void enter()
	{
		System.out.println("Enter User Name");
		String userName = in.nextLine();
		System.out.println("Enter the password");
		String passWord = in.nextLine();
		if(userName.equals("admin"))
		{
			if(passWord.equals("1234"))
			
			{
				System.out.println("------------Welcome ADMIN--------------");	
			}
			else
			{
				System.out.println("-_-_-_-Your password is incorrect Login again-_-_-_-");
				enter();
			}
		}
		else
		{
			System.out.println("-_-_-_-_- Your UserName is incorrect -_-_-_-_-");
			enter();
		}
			
	}

}
