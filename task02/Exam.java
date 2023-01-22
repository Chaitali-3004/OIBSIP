import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
public class Exam
{
	Scanner sc=new Scanner(System.in);
	HashMap<String,Integer> data=new HashMap<String,Integer>();
	public void login()
	{
		//user_name and password
		data.put("abc",321);
		data.put("xyz",213);
		System.out.println("Welcome!!!");
		String user_id;
		int pwd;
		System.out.println("please Login...");
		System.out.println("Enter UserID: ");
		user_id=sc.next();
		System.out.println("Enter Password: ");
		pwd=sc.nextInt();
		if(data.containsKey(user_id) && data.get(user_id)==pwd)
		{
			System.out.println("Login Sucessful!!!");
			menu();
		}
		else
		{
			System.out.println("Invalid login!!!");
			System.out.println("please check Login details and try again");
			login();
		}
	}
	
	public void menu()
	{
		int ch;
		System.out.println("Enter your choice: ");
		System.out.println("1.Update Profile and Passwod");
		System.out.println("2.Start Exam");
		System.out.println("3.Logout");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				data=update();
				menu();
				break;
			case 2:
				start_exam();
				menu();
				break;
			case 3:
				System.exit(0);
				break;
			default :
				System.out.println("Invalid choice!!!");
		}
	}
	
	public HashMap<String,Integer> update()
	{
		String update_user;
		int update_pwd;
		System.out.println("Welcome to your profile!!!");
		System.out.println("Enter Username: ");
		update_user=sc.next();
		System.out.println("Enter Password: ");
		update_pwd=sc.nextInt();
		if(data.containsKey(update_user))
		{
			System.out.println("Enter new Passwod: ");
			update_pwd=sc.nextInt();
			data.replace(update_user,update_pwd);
		}
		else
		{
			System.out.println("User doesn't exist...");
		}
		return data;
	}
	
	public void start_exam()
	{
		long start_time=System.currentTimeMillis();
		long end_time=start_time+30;
		int score=0;
		int ans;
		System.out.println("Start Exam!!!");
		while(System.currentTimeMillis()<end_time)
		{
			System.out.println("You have 5 quetions and time limit is 5 minutes");
			System.out.println("");
			System.out.println("Each quetion for 5 marks and negative marking is there...");
			System.out.println("");
			System.out.println("Q1.Which component is used to compile, debug and execute the java programs?");
			System.out.println("1)JRE"+"\t"+"2)JIT"+"\t"+"3)JDK"+"\t"+"4)JVM");
			System.out.println("Enter your ans: ");
			ans=sc.nextInt();
			System.out.println("----your Answer is saved----");
			if(ans==3)
			{
				score=score+5;
			}
			else
			{
				score--;
			}
			
			System.out.println("");
			
			System.out.println("Q2.Which one of the following is not a Java feature?");
			System.out.println("1)Object-oriented"+"\t"+"2)Use of pointers"+"\t"+"3)Portable"+"\t"+"4)Dynamic and Extensible");
			System.out.println("Enter your ans: ");
			ans=sc.nextInt();
			System.out.println("----your Answer is saved----");
			if(ans==2)
			{
				score=score+5;
			}
			else
			{
				score--;
			}
			
			System.out.println("");
			
			System.out.println("Q3.What is the extension of java code files?");
			System.out.println("1).js"+"\t"+"2).txt"+"\t"+"3).class"+"\t"+"4).java");
			System.out.println("Enter your ans: ");
			ans=sc.nextInt();
			System.out.println("----your Answer is saved----");
			if(ans==4)
			{
				score=score+5;
			}
			else
			{
				score--;
			}
			
			System.out.println("");
			
			System.out.println("Q4.Which of the following is not an OOPS concept in Java?");
			System.out.println("1)Polymorphism"+"\t"+"2)Inheritance"+"\t"+"3)Compilation"+"\t"+"4)Encapsulation");
			System.out.println("Enter your ans: ");
			ans=sc.nextInt();
			System.out.println("----your Answer is saved----");
			if(ans==3)
			{
				score=score+5;
			}
			else
			{
				score--;
			}
			
			System.out.println("");
			
			System.out.println("Q5.Which of these keywords is used to define interfaces in Java?");
			System.out.println("1)intf"+"\t"+"2)Intf"+"\t"+"3)interface"+"\t"+"4)Interface");
			System.out.println("Enter your ans: ");
			ans=sc.nextInt();
			System.out.println("----your Answer is saved----");
			if(ans==3)
			{
				score=score+5;
			}
			else
			{
				score--;
			}
			break;
		}
		
		System.out.println("");
		
		System.out.println("you have finished the Exam!!!");
		System.out.println("");
		System.out.println("Congratulations!!!");
		System.out.println("");
		System.out.println("*****your Score is "+""+score+"/50"+"*****");
		System.out.println("");
	}
	
	public static void main(String args[])
	{
		Exam e1=new Exam();
		e1.login();
	}
}