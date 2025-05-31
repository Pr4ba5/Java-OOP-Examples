// File: EncapsulationExample.java
// Package: Java_OOP_examples.Encapsulation
// Mission: Show how Java encapsulation works using a Person who respects privacy. 😎

package Java_OOP_examples.Encapsulation;

// Meet our Person class: a humble human who keeps their name and age private
class Person {

    // These variables are shy — they’re private, so no one outside can mess with them directly!
    private String name;
    private int age;

    // Public getter for name — you can *ask* for the name politely
    public String getName() {
        return name;
    }

    // Public getter for age — again, asking nicely
    public int getAge() {
        return age;
    }

    // Public setter for name — use this to assign a name
    public void SetName(String name) {
        this.name = name;  // 'this' refers to the current Person's name, not some random dude’s
    }

    // Public setter for age — with a bit of "parental" validation
    public void SetAge(int age) {
        if (age <= 0) {
            System.out.println("Sorry, age less than or equal to 0 is invalid. Try again, time traveler. ⏳");
        } else {
            this.age = age;
        }
    }
}

// Here's where the magic happens — the Main class

public class EncapsulationExample {
    public static void main(String[] args) {

        // Creating a new Person object, say hello to p1!
        Person p1 = new Person();

        // Setting their secret identity using public setters
        p1.SetName("Prabhash");
        p1.SetAge(19);

        // Politely asking for their details via getters (no privacy laws broken here!)
        System.out.println("Name is: " + p1.getName());
        System.out.println("Age is : " + p1.getAge());
    }
}

