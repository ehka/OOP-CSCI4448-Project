package poker;
import java.util.ArrayList;

public class Hand implements Observer{
	public ArrayList<Cards> hand = new ArrayList<Cards>();
	public Cards[] five_card;
	
	private Cards[] determine_five_best(Poker p) {
		return p.cards;
	}
	
	private int determine_hand_rate() {
		return 0;
	}
	
	@Override
	public void update() {
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
}
