// Animal.java - Abstract Class
abstract class Animal {
    // Abstract classes can have both concrete and abstract methods
    String name;
    int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Concrete method
    void eat() {
        System.out.println(name + " is eating.");
    }
    
    // Abstract method (to be implemented by subclasses)
    abstract void makeSound();
}
