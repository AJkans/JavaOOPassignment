// Main.java - Testing Class
public class Main {
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog("Buddy", 3);
        
        // Call methods from different class types
        myDog.eat();        // From Animal (abstract class)
        myDog.makeSound();  // From Dog's implementation
        myDog.swim();       // From Swimmer interface
        
        // Simple print to show it's working
        System.out.println("All methods worked successfully!");
    }
}