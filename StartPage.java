package studman;
import java.util.Scanner;

public class StartPage {
	
	
	Scanner in = new Scanner(System.in);
	public void start()
	{
		StudentDetails obj = new StudentDetails();
		Login lg = new Login();
		boolean condition = true;
		while(condition)
		  {
			lg.enter();
			System.out.println("------------------------------------");
			System.out.println("Press 1 to Add StudentDetails");
			System.out.println("Press 2 to Update StudentDetails");
			System.out.println("Press 3 to Delete StudentDetails");
			System.out.println("Press 4 to Display StudentDetails");
			System.out.println("Press 0 to exit");
			System.out.println("------------------------------------");
			System.out.println("Enter your choice");
			int choice = in.nextInt();
			switch(choice)
			{
			case 0:
				System.out.println("Thanks for using application");
				System.exit(0);
			case 1:
				obj.addDetails();
				break;
			case 2:
				obj.updateDetails();
				break;
			case 3:
				obj.deleteDetails();
				break;
			case 4:
				obj.displayDetails();
				break;
			}
			
	      }
   }

}
