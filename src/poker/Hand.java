package poker;
import java.util.ArrayList;

public class Hand implements Observer{
	public ArrayList<Cards> hand = new ArrayList<Cards>();
	public Cards[] five_card;
	int hand_rate;
	
	private Cards[] determine_five_best(Poker p) {
		
		return p.cards;
	}
	
	private int determine_hand_rate() {
		return 0;
	}
	
	@Override
	public void update() {
		 hand_rate = determine_hand_rate();
	}

	@Override
	public void add(Observer o, Poker p) {
		p.observers.add(o);
		
	}
}
