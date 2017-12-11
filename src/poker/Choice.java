package poker;

public class Choice {
	Poker p;

	public int bet(int chips) {
		p.update_pot(chips);
		return chips;
	}

	public int check() {
		return 0;
	}

	public void fold() {
		
	}
}
