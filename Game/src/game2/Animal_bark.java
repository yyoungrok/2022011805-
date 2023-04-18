package game2;

public class Animal_bark {
	public static void main(String [] args) {
		//_____________________________________________________________________
		Cat cat = new Cat();
		Cow cow = new Cow();
		Dog dog = new Dog();
		Lion lion = new Lion();
		
		cat.bark1 = "cat!!";
		cow.bark1 = "cow!!";
		dog.bark1 = "dog!!";
		lion.bark1 = "lion!!";
		System.out.println(cat.bark1 + cow.bark1 + dog.bark1+ lion.bark1);
		//_____________________________________________________________________
		
		//__________________________배열________________________________________

		Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();
        animals[3] = new Lion();
        
        for (Animal animal : animals) {
           animal.bark();
        }
		//_____________________________________________________________________

	}
}
