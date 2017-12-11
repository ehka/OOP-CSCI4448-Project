package poker;

import java.util.Scanner;
import java.util.*;

public class Main {
	public String[][] players;
	public static void main(String [] args) {
		String username;
		String password;
		Player p = new Player();
		System.out.println("1.Log in");
		System.out.println("2.Sign up");
		System.out.println("3.Exit");
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		int i = sc.nextInt();
		if(i == 1) {
			System.out.println("Enter your username: ");
			scanner = new Scanner(System.in);
			username = scanner.nextLine();
			System.out.println("Enter your passoword: ");
			password = scanner.nextLine();
			p.login(username, password);
		}
		if(i == 2) {
			System.out.println("Enter your username: ");
			scanner = new Scanner(System.in);
			username = scanner.nextLine();
			System.out.println("Enter your passoword: ");
			password = scanner.nextLine();
			p.signup(username, password);
		}
		else if(i == 3) {
			System.exit(0);
		}
		else {
			System.out.println("wrong iput!");
		}
		System.out.println("1.Create a Game");
		System.out.println("2.Join a Game");
		System.out.println("3.Check Score");
		System.out.println("4.View Friends");
		System.out.println("5.Exit");
		i = sc.nextInt();
		if(i == 1) {
			System.out.println("1.Invite a Friend");
			
			System.out.println("2.Start a Game");
			i = sc.nextInt();
			if(i == 1) {
				System.out.println("Enter your friend's name:");
				String friend_name = scanner.nextLine();
				p.add_friend(friend_name);
				System.out.println("Your friend was invited.");
			}
			System.out.println("creating a game...");
			Game game = new Game();
			game.player_list.add(p);
			game.create_game();
			System.out.println("You entered a game!");
			Poker poker = new Poker();
			
		}
		if(i == 2 ) {
			Game game = new Game();
			game.join_game(p);
			System.out.println("You just joined a Game!");
			
		}
		if(i == 3) {
			System.out.println(p.view_score());
		}
		if(i == 4) {
			System.out.println(p.view_friends());
		}
		if(i == 5) {
			System.exit(0);
		}
		
		
		
	}
}
