package poker;

public class Choice {
	Poker p;

	public int bet(int chips) {
		p.update_pot(chips);
		return chips;
	}

	public int check() {
        p.update_pot(0);
        return 0;
	}

	public void fold() {
		p.cards = Cards[];
	}
}
