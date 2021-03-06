public class Dog {

	/*
	 * Declaring fields of the class Dog
	 */
	public String name;
	public String color;
	public int age;
	public int intelligence;

	/*
	 * Constructor
	 */
	public Dog (String name, String color, int age, int intelligence) {
		this.name = name;
		this.color = color;
		this.age = age;
		this.intelligence = intelligence;
	}

	/*
	 * Methods of the class Dog
	 */
	public void grow(int years) {
		this.age += years;
	}

	public void smarter() {
		this.intelligence += 200;
	}

	public void bark() {
		System.out.println("Hello Human! "
				+ "I'm " + this.name + " and I'm totally "
				+ this.color + "...");
		System.out.println("I'm " + this.age + " years old this year and my IQ is " 
				+ this.intelligence + "!!!\n");
	}

	/**
	 * Main function that instantiates an object from class Dog. Then we call methods
	 * on the object (with side-effects like printing the properties of the object).
	 * @param args
	 */
	public static void main(String[] args) {
		Dog Doug = new Dog ("Doug", "transluscent", 12, 360);
		Doug.grow(100);
		Doug.smarter();
		Doug.bark();	
	}

}
