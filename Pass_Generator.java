import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
public class Pass_Generator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Specify the length of the password (The Minimum Length is 6 and the Maximum Length is 35");
		int length = input.nextInt();
		if(length >= 6 && length < 36) {
		
		StringBuilder password = new StringBuilder(); 
		
		System.out.println("Please choose option down below");
		
		System.out.println("\nType 1 if you would like a password with both lowercase and uppercase");
		System.out.println("\nType 2 if you would like a password with lowercase, uppercase, and symbols");
		System.out.println("\nType 3 if you would like a password with lowercase, uppercase, symbols and numbers");
			
		int selc = input.nextInt();
		
		switch(selc) {
		case 1: 
			upper(password,length);
			break;
		case 2: 
			upper_symbol(password,length);
			break;
		case 3: 
			upper_symbol_num(password,length);
			break;
		}
		input.close();
			}
		else {
			System.out.println("Not a Valid input");
		}
	}
	public static void upper (StringBuilder password, int length) {
		char [] upper = "abcdefghijklmnopqrstuvwxyzABCDEFGJKLMNPRSTUVWXYZ".toCharArray();
		for(int i = 0; i < length; i++) {
			Random r = new SecureRandom(); 
			password.append(upper[r.nextInt(upper.length)]);
			
		}
		System.out.println(password);
	}
	public static void upper_symbol (StringBuilder password, int length){
		
		char [] upper_symbol = "^$?!@#%&abcdefghijklmnopqrstuvwxyzABCDEFGJKLMNPRSTUVWXYZ".toCharArray();
		for(int i = 0; i < length; i++) {
			Random r = new SecureRandom(); 
			password.append(upper_symbol[r.nextInt(upper_symbol.length)]);
		}
		System.out.println(password);
		
		
	}
	public static void upper_symbol_num (StringBuilder password, int length) {
		char [] upper_symbol_num = "^$?!@#%&abcdefghijklmnopqrstuvwxyzABCDEFGJKLMNPRSTUVWXYZ0123456789".toCharArray();
		for(int i = 0; i < length; i++) {
			Random r = new SecureRandom(); 
			password.append(upper_symbol_num[r.nextInt(upper_symbol_num.length)]);
		}
		System.out.println(password);
	}
}
