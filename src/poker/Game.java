package poker;
import java.util.ArrayList;

public class Game {
	public ArrayList<Player> player_list = new ArrayList<Player>();
	public int[] board;
	
	public void create_game(Player p) {
        player_list.add(p);
        board.add(p.score);
	}
	public void join_game(Player p) {
        player_list.add(p);
        board.add(p.score);
	}
	public void leave_game(Player p) {
        player_list.remove(p);
        board.remove(p.score);
	}
	public int[] check_board() {
		return board;
	}
}
