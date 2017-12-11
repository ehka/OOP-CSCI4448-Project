package poker;

public class Poker {
	public Cards[] cards;
	public Cards[] seven_cards;
	public int pot;
	public Observer[] observers;
	
	public Cards[] deal(Observer ob) {
		return cards;
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
