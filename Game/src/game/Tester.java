package game;

public class Tester {
	public static void main(String [] args) {
		Wizard wizard1 = new Wizard();
		wizard1.hp += 1;
		Dude dude1 = new Dude();
		wizard1.punchFace(dude1);
		dude1.punchFace(wizard1);
		
		System.out.println(wizard1.hp);
		System.out.println(dude1.hp);
		
		GrandWizard grandwizard1 = new GrandWizard();
		grandwizard1.name = "Flash";
		grandwizard1.sayName();
	}

}
