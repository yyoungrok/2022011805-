package game2;

public class Animal_bark {
	public static void main(String [] args) {
		Cat cat = new Cat();
		Cow cow = new Cow();
		Dog dog = new Dog();
		Lion lion = new Lion();
		
		cat.bark = "cat!!";
		cow.bark = "cow!!";
		dog.bark = "dog!!";
		lion.bark = "lion!!";
		
		System.out.println("cat: "+ cat.bark + "\n" + "cow: " + cow.bark + "\n"+ "dog: " + dog.bark + "\n" + "lion: " + lion.bark);
		
	}

}
