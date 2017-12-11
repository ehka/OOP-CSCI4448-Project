package poker;

public interface Observer {
	public void update();
	public void add(Observer o, Poker p);
}
