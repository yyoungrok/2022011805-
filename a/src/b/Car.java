package b;

public class Car {
	private int year;
    private String maker;
    private double speed;
    
    public Car(int year, String maker, double speed) {
        this.year = year;
        this.maker = maker;
        this.speed = speed;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getMake() {
        return maker;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public void accelerate(double amount) {
        speed += amount;
    }
    
    public void brake(double amount) {
        speed -= amount;
    }
    
    public static void main(String[] args) {
        Car myCar = new Car(2021, "Hyundai", 0.0);
        System.out.println("My car is a " + myCar.getYear() + " " + myCar.getMake() + ".");
        
        myCar.accelerate(30.0);
        System.out.println("My car's speed is now " + myCar.getSpeed() + " mph.");
        
        myCar.brake(10.0);
        System.out.println("My car's speed is now " + myCar.getSpeed() + " mph.");
    }


}
