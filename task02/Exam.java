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
		data.put("abc",101);
		data.put("xyz",201);
		System.out.println("Welcome!!!");
		String user_id;
		int pwd;
		System.out.println("Please Login...");
		System.out.println("Enter UserID: ");
		user_id=sc.next();
		System.out.println("Enter Password: ");
		pwd=sc.nextInt();
		if(data.containsKey(user_id) && data.get(user_id)==pwd)
		{
			System.out.println("Login Sucessful!!!\n");
			menu();
		}
		else
		{
			System.out.println("\nInvalid login!!!");
			System.out.println("please check Login details and try again");
			login();
		}
	}
	
	public void menu()
	{
		int ch;
		System.out.println("Enter your choice: ");
		System.out.println("1.Update Profile and Password");
		System.out.println("2.Start Exam");
		System.out.println("3.Logout");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				data = update();
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
			System.out.println("Each quetion for 5 marks and negative marking(-1) is there...");
			System.out.println("");
			System.out.println("Q1.The index of the first character in the string is_____");
			System.out.println("1)0"+"\t"+"2)1"+"\t"+"3)n-1"+"\t"+"4)n");
			System.out.println("Enter your ans: ");
			ans=sc.nextInt();
			System.out.println("----your Answer is saved----");
			if(ans==1)
			{
				score=score+5;
			}
			else
			{
				score--;
			}
			
			System.out.println("");
			
			System.out.println("Q2.Which operator is used to repeat a string 'n' number of times?");
			System.out.println("1)+"+"\t"+"2)*"+"\t"+"3)[]"+"\t"+"4)+=");
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
			
			System.out.println("Q3.The index of the last character in the string is_______");
			System.out.println("1)0"+"\t"+"2)1"+"\t"+"3)n"+"\t"+"4)-1");
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
			
			System.out.println("Q4.Which error is generated when a character in a string variable is modified?");
			System.out.println("1)IndexError"+"\t"+"2)NameError"+"\t"+"3)TypeError"+"\t"+"4)BoundError");
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
			
			System.out.println("Q5. What will be the output of the “hello” +1+2+3?");
			System.out.println("1)Error"+"\t"+"2)hello"+"\t"+"3)hello123"+"\t"+"4)hello6");
			System.out.println("Enter your ans: ");
			ans=sc.nextInt();
			System.out.println("----your Answer is saved----");
			if(ans==1)
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
		
		System.out.println("You have finished the Exam!!!");
		System.out.println("");
		System.out.println("Congratulations!!!");
		System.out.println("");
		System.out.println("*****your Score is "+""+score+"/25"+"*****");
		System.out.println("");
	}
	
	public static void main(String args[])
	{
		Exam e1=new Exam();
		e1.login();
	}
}