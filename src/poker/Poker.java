package poker;
import java.util.ArrayList;
import java.util.Random;


public class Poker {
	public Cards[] cards;
	public Cards[] seven_cards;
	public int pot;
	public Observer[] observers;
	
	public ArrayList<Cards> deal(ArrayList<Cards> deal_cards, Observer ob) {
		
		Random rand = new Random();
		int  n = rand.nextInt(51) + 1;
		deal_cards.add(cards[n]);
		System.out.println("Your cards are:");
		System.out.printf("%s %d \n",cards[n].suit, cards[n].value);
		rand = new Random();
		n = rand.nextInt(51) + 1;
		deal_cards.add(cards[n]);
		System.out.printf("%s %d",cards[n].suit, cards[n].value);
		return deal_cards;
	}
	public Cards[] flop(Cards flop_cards, Observer ob) {
		return cards;
	}
	public Cards[] flip(Cards flip_cards, Observer ob) {
		return cards;
	}
	public void update_pot (int chips) {
		
	}
	public void attach(Observer o) {
		
	}
	public void notify1() {
		
	}
	public void detach(Observer o) {
		
	}
}
