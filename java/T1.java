class Animal {
    String name;

    Animal() {
        this("Unknown Animal");
    }

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    int age;

    Dog() {
        this("Doggy", 1);
    }

    Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class T1 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal("Tiger");

        Dog d1 = new Dog();
        Dog d2 = new Dog("Buddy", 3);

        Animal ref;
        ref = d1;
        ref.sound();
    }
}