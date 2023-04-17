package c;

class Hunter {
	public void attack(Monster monster, int power) {
        int newHp = monster.getHp() - power;
        monster.setHp(newHp);
        System.out.println("Hunter attacked Monster with a power of " + power + ".");
        System.out.println("Monster has " + monster.getHp() + " hp.");
    }

}
class Monster {
	private int hp;
    
    public Monster(int hp) {
        this.hp = hp;
    }
    
    public int getHp() {
        return hp;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }

}
class Main {
	public static void main(String[] args) {
        Monster monster = new Monster(1000);
        Hunter hunter = new Hunter();
        
        hunter.attack(monster, 100);
    }

}
