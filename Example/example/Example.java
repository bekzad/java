package example;

public class Example {
    public static void main(String args[]) {

        Dog myDog; // Create Address 42 that can point to a example.Dog object
        myDog = new Dog("Rover"); // Create a example.Dog object and address points to a dog object

        System.out.println(myDog.name);

        foo(myDog);

        System.out.println(myDog.name);
    }
    static void foo(Dog someDog) { // 42
        someDog.setName("Max");     // change the value in the address 42 which is Rover to Max

        // someDog = new example.Dog("Fifi");  // Create a pointer 72 and assign a value Fifi
        // someDog.setName("Rowlf");   // Change the name fifi to Rowl
        // System.out.println(someDog.name);
    }
}

class Dog {
    String name;
    Dog(String name) {
        this.name = name;
    }
    void setName(String name) {
        this.name = name;
    }
}