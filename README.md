# JavaOOPassignment
 Java assignment 1

This program shows:
- Concrete Classes
- Abstract Classes
- Interfaces

## Class Descriptions

### 1. Abstract Class (Animal.java)
- Serves as base class for animals
- Has:
  - Concrete method `eat()`
  - Abstract method `makeSound()`
  - Properties (name, age)
  
### 2. Interface (Swimmer.java)
- Defines swimming capacity
- Contains method signature `swim()`
- Implemented by Dog class

### 3. Concrete Class (Dog.java)
- Inherits from Animal
- Implements Swimmer interface
- Gives implementations for:
  - `makeSound()` (outputs "Woof! Woof!")
  - `swim()` (shows swimming action)

## How to Run
1. Compile files:
```bash
javac *.java
```
2. Execute program:
```bash
java Main
```
