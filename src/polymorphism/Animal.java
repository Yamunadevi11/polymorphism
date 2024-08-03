package polymorphism;
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Animal reference but Dog object
        Animal myCat = new Cat(); // Animal reference but Cat object

        myDog.sound(); // Output: Dog barks
        myCat.sound(); // Output: Cat meows
    }
}
