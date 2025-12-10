class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

class Staff {
    String name;
    Staff(String name) {
        this.name = name;
    }
}

class Admin {
    String name;
    Admin(String name) {
        this.name = name;
    }
}

class College {
    void register(Student s) {
        System.out.println("Registering Student: " + s.name);
    }

    void register(Staff st) {
        System.out.println("Registering Staff: " + st.name);
    }

    void register(Admin a) {
        System.out.println("Registering Admin: " + a.name);
    }
}

public class T5 {
    public static void main(String[] args) {
        College c = new College();

        Student s = new Student("Alice");
        Staff st = new Staff("Bob");
        Admin a = new Admin("Charlie");

        c.register(s);
        c.register(st);
        c.register(a);
    }
}