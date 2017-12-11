package poker;

import java.util.Scanner;
import java.util.*;

public class Main {
	public String[][] players;
	@SuppressWarnings("null")
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
		else if(i == 2) {
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
			Cards[] cards_52 = new Cards[52];
			
			int j = 0;
			int k = 1;
			for(j=0; j<12; j++ ) {
				cards_52[j] = new Cards();
				cards_52[j].suit = "Diamonds";
				cards_52[j].value = k++; 
			}
			k = 1;
			for(j=13; j<25; j++ ) {
				cards_52[j] = new Cards();
				cards_52[j].suit = "Hearts";
				cards_52[j].value = k++; 
			}
			k = 1;
			for(j=26; j<38; j++ ) {
				cards_52[j] = new Cards();
				cards_52[j].suit = "Spades";
				cards_52[j].value = k++; 
			}
			k = 1;
			for(j=39; j<51; j++ ) {
				cards_52[j] = new Cards();
				cards_52[j].suit = "Clubs";
				cards_52[j].value = k++; 
			}
			
				
			Observer ob = null;
			poker.cards = cards_52;
			System.out.println("Dealing Cards...");
			ArrayList<Cards> deal_cards = new ArrayList<Cards>();
			
			ArrayList<Cards> result = poker.deal(deal_cards, ob);
			
			
		}
		else if(i == 2 ) {
			Game game = new Game();
			game.join_game(p);
			System.out.println("You just joined a Game!");
			
		}
		else if(i == 3) {
			System.out.println(p.view_score());
		}
		else if(i == 4) {
			System.out.println(p.view_friends());
		}
		else if(i == 5) {
			System.exit(0);
		}
		
		
		
	}
}
