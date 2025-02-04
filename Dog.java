// Dog.java - Concrete Class
class Dog extends Animal implements Swimmer {
    public Dog(String name, int age) {
        super(name, age);
    }
    
    // Implementing abstract method from Animal
    @Override
    void makeSound() {
        System.out.println("Woof! Bark!");
    }
    
    // Implementing method from Swimmer interface
    public void swim() {
        System.out.println(name + " is splashing in the water!");
    }
}