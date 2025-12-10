class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
        super.sound(); 
    }
}

public class T2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}