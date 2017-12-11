package poker;

import java.util.Scanner;

public class Main {
	public String[][] players;
	public static void main(String [] args) {
		Player p = new Player();
		System.out.println("1.Log in");
		System.out.println("2.Sign up");
		System.out.println("3.Exit");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i == 1) {
			System.out.println("Enter your username: ");
			Scanner scanner = new Scanner(System.in);
			String username = scanner.nextLine();
			System.out.println("Enter your passoword: ");
			String password = scanner.nextLine();
			p.login(username, password);
		}
		if(i == 2) {
			System.out.println("Enter your username: ");
			Scanner scanner = new Scanner(System.in);
			String username = scanner.nextLine();
			System.out.println("Enter your passoword: ");
			String password = scanner.nextLine();
			p.signup(username, password);
		}
		else if(i == 3) {
			System.exit(0);
		}
		else {
			System.out.println("wrong iput!");
		}
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		System.out.println("Enter your passoword: ");
		String password = scanner.nextLine();
		System.out.println("1.Create a Game");
		System.out.println("2.Join a Game");
		System.out.println("3.Exit");
		i = sc.nextInt();
		if(i == 1) {
			System.out.println("1.Invite a Friend");
			System.out.println("2.Start a Game");
		}
		if(i == 2 ) {
			System.out.println("You just joined a Game!");
		}
		if(i == 3) {
			System.exit(0);
		}
		
		
		
	}
}
