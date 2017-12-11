package poker;

import java.util.Scanner;

public class Main {
	public String[][] players;
	public static void main(String [] args) {
		System.out.println("1.Log in");
		System.out.println("2.Sign up");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i == 1 || i == 2) {
			
		}
		else {
			System.out.println("wrong iput!");
		}
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		System.out.println("Enter your passoword: ");
		String password = scanner.nextLine();
		
	}
}
