package studman;

import java.util.ArrayList;
import java.util.Scanner;



public class StudentDetails {
	Scanner in = new Scanner(System.in);
	ArrayList<StudentDetails> studList = new ArrayList<StudentDetails>();
	String studName;
	int studRollNo;
	int studAge;
	String studGender;
	String studAddress;
	long studPhoneNo;
	
	
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudRollNo() {
		return studRollNo;
	}
	public void setStudRollNo(int studRollNo) {
		this.studRollNo = studRollNo;
	}
	public int getStudAge() {
		return studAge;
	}
	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	public String getStudGender() {
		return studGender;
	}
	public void setStudGender(String studGender) {
		this.studGender = studGender;
	}
	public String getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}
	public long getStudPhoneNo() {
		return studPhoneNo;
	}
	public void setStudPhoneNo(long studPhoneNo) {
		this.studPhoneNo = studPhoneNo;
	}
	

	public void addDetails() 
	{
		StudentDetails sdObj= new StudentDetails();
		int index=-1;
		System.out.println("Enter the name of the Student ");
		studName = in.next();
		sdObj.setStudName(studName);
		System.out.println("Enter the age of the Student ");
		studAge=in.nextInt();
		sdObj.setStudAge(studAge);
		System.out.println("Enter the Rollno of Student");
		studRollNo = in.nextInt();
		sdObj.setStudRollNo(studRollNo);
		for(int i=0;i<studList.size();i++)
		{
			if(studRollNo==studList.get(i).getStudPhoneNo())
			{
				System.out.println("The entered RollNo is already assigned");
				index=i;
				break;
			}
		}
		if(index==-1)
		{
		System.out.println("Enter the Gender of Student");
		studGender = in.next();
		sdObj.setStudGender(studGender);
		System.out.println("Enter the address of Student");
		studAddress = in.next();
		sdObj.setStudAddress(studAddress);
		System.out.println("Enter the phone no of Student");
		sdObj.setStudPhoneNo(studPhoneNo);
		studPhoneNo = in.nextLong();
		studList.add(sdObj);
		}
		
	}
	
	
	
	
	public void updateDetails()
	{
		int index=-1;
		System.out.println("Enter the RollNo of student to be updated");
		int id=in.nextInt();
		for(int i=0;i<studList.size();i++)
		{
			if(id==studList.get(i).getStudRollNo())
			{
				index=i;
			}
		}
		if(index==-1)
		{
			System.out.println("There is no Details with RollNo "+id);
			
		}
		else
		{
			System.out.println("To update student Name Press 1");
			System.out.println("To update student Age Press 2");
			System.out.println("To update student Gender Press 3");
			System.out.println("To update student Address Press 4");
			System.out.println("To update student Phone No Press 5");
			int choice = in.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the new name");
				String tempName=in.next();
				studList.get(index).setStudName(tempName);
				break;
			case 2:
				System.out.println("Enter the new age of student");
				int temAge=in.nextInt();
				studList.get(index).setStudAge(temAge);
				break;
			case 3:
				System.out.println("Enter the Gender to be updated");
				String tempGen=in.next();
				studList.get(index).setStudGender(tempGen);
				break;
			case 4:
				System.out.println("Enter the Address to be updated");
				String tempAddress= in.next();
				studList.get(index).setStudAddress(tempAddress);
				break;
			case 5:
				System.out.println("Enter the Phone no to be updated");
				long tempPhno=in.nextLong();
				studList.get(index).setStudPhoneNo(tempPhno);
				break;
			}
		}
	}
	
	
	public void deleteDetails()
	{
		System.out.println("Enter the RollNo of Student to be deleted");
		int id=in.nextInt();
		int index=-1;
		for(int i=0;i<studList.size();i++)
		{
			if(id==studList.get(i).getStudRollNo())
			{
				index=i;
				studList.remove(i);
				System.out.println("Removed Successfully");
			}
		}
		
		if(index==-1)
		{
			System.out.println("There is no StudentDetail with Rollno "+id);
		}
	}
	
	
	public void displayDetails()
	{
		
		if(studList.isEmpty())
		{
			System.out.println("There is no details to display");
		}
		
		else
		{
			for (StudentDetails i : studList)
			{
				System.out.println("NAME : "+i.studName);
				System.out.println("AGE : "+i.studAge);
				System.out.println("ROLLNo : "+i.studRollNo);
				System.out.println("GENDER : "+i.studGender);
				System.out.println("ADDRESS : "+i.studAddress);
				System.out.println("PHONE NUMBER : "+i.studPhoneNo);
			}
		}
		
	}
}
