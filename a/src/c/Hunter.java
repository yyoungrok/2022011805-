package c;

public class Hunter {
	public void attack(Monster monster, int power) {
        int newHp = monster.getHp() - power;
        monster.setHp(newHp);
        System.out.println("Hunter attacked Monster with a power of " + power + ".");
        System.out.println("Monster has " + monster.getHp() + " hp.");
    }

}
