// Java code snippet
public class HeapMemoryExample {

    public static void main(String[] args) {
        // Creating objects in heap memory
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        person1.displayDetails();
        person2.displayDetails();

    }
}

class Person {
    private String name;
    private int age;

    // Constructor for initializing object properties
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Displaying object details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

