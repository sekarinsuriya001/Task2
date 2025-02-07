package Task2;

class Person {
    String name;
    int age;

    // Default constructor (no arguments) - sets default age to 18
    public Person() {
        this.age = 18; 
    }

    // Constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
       
    	
    	// Create a Person object using the default constructor
        Person person1 = new Person();
        person1.name = "Shivaraj"; 
        // Must set the name separately since default constructor takes no arguments
        person1.displayInfo(); 
        // Output: Name:Shivaraj, Age: 18
        
        // Create a Person object using the constructor with name and age
        Person person2 = new Person("Rudhraa", 25);
        person2.displayInfo(); 
        // Output: Name: Rudhraa, Age: 25
    }
}
