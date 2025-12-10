interface Vehicle {
    void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a kick");
    }
}

class Bus implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bus starts with a button");
    }
}

public class T4 {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();

        v = new Bus();
        v.start();
    }
}