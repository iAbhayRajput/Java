interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Bird extends Animal implements Flyable {
    Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}

class Fish extends Animal implements Swimmable {
    Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

class Penguin extends Bird implements Swimmable {
    Penguin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        animal.eat();

        Bird bird = new Bird("Parrot");
        bird.eat();
        bird.fly();

        Fish fish = new Fish("Goldfish");
        fish.eat();
        fish.swim();

        Penguin penguin = new Penguin("Emperor Penguin");
        penguin.eat();
        penguin.fly(); // Penguins can't fly, but they inherit the method from Bird
        penguin.swim();
    }
}
