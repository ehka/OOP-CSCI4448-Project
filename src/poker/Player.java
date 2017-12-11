package poker;

public class Player {
	public int score;
	public String name;
	public String[] friends;
	public int chips;
	
	public void signup(String name, String password) {
		System.out.println("Signup was successfull");
	}
	public void login(String name, String password) {
		System.out.println("Login was successfull");
	}
	public void add_friend(String name) {
		
	}
	public int view_score() {
		return 0;
	}
	public String[] view_friends(){
		return friends;
	}
}
