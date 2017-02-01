
public class Student {
	
	/**
	 * Setting all fields as private by changing modifier.
	 */
	private String firstName;
	private String lastName;
	private int id;
	private int age;
	
	/**
	 * Constructor for a Student object
	 * 
	 * @param firstName the first name of the student
	 * @param lastName the last name of the student
	 * @param id the student ID number
	 * @param age the age of the student
	 */
	public Student () {
		this.firstName = "Mike";
		this.lastName  = "Zou";
		this.id        = 0;
		this.age       = 18;
	}
	
	/**
	 * getter method for accessing the firstName field
	 * 
	 * @return firstName of the student object
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * setter method for setting firstName of student object
	 * 
	 * @param name firstName of the student
	 */
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	/**
	 * getter method for accessing the lastName field
	 * 
	 * @return lastName of the student object
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * setter method for setting lastName of student object
	 * 
	 * @param name lastName of the student
	 */
	public void setLastName(String name) {
		this.lastName = name;
	}
	
	/**
	 * getter method for accessing the id field
	 * 
	 * @return id of the student object
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * setter method for setting id of student object
	 * 
	 * @param iden id of the student
	 */
	public void setId(int iden) {
		this.id = iden;
	}
	
	/**
	 * getter method for accessing the age field
	 * 
	 * @return age of the student object
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * sets the age of student. Age must be positive.
	 * 
	 * @param age the age of the student
	 */
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			throw new IllegalArgumentException();
		}
	}

	/*
	 * Main function for testing purposes (setting fields for new student).
	 * Since this is still the author side not the client side, we can still 
	 * access the private fields in main. So only the setter and getter methods
	 * are tested here.
	 */
	public static void main(String[] args) {
		System.out.println("Creating a new student now ...");
		Student dianne = new Student ();

		dianne.setFirstName("Dianne");
		dianne.setLastName("Cho");
		dianne.setId(1234);
		dianne.setAge(22);

		System.out.println("This student's name is " + dianne.getFirstName() + " " 
				+ dianne.getLastName());
		System.out.println("and her student ID is " + dianne.getId() + 
				". She's " + dianne.getAge() + " years old!");
	}
}
