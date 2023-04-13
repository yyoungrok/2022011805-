package c;

public class Main {
	public static void main(String[] args) {
        Monster monster = new Monster(1000);
        Hunter hunter = new Hunter();
        
        hunter.attack(monster, 100);
    }

}
