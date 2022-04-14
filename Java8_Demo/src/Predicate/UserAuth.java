package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	
	String username;
	String password;
	User(String username,String password){
		this.username= username;
		this.password = password;
	}
}

public class UserAuth {

	public static void main(String[] args) {
		Predicate<User> p=u -> u.username.equals("Rishi") && u.password.equals("java");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username : ");
		String username = scan.nextLine();
		System.out.println("Enter password : ");
		String password = scan.nextLine();
		scan.close();
		
		User user = new User(username,password);
		if(p.test(user)) {
			System.out.println("You are eligible to avail all services ");
		}else {
			System.out.println("Sorry ! Please enter correct credentials ");
		}
		

	}

}
