package Java_OOP_examples.Inheritance;


// Superclass
class Animal {


    public void sleep(){
        System.out.println("The animal is sleeping.");
    }

    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {//here dog has now inherited the properties from animal already
    public void bark() {
        System.out.println("The dog barks.");
    }
}

//we can create another subclass also inherting the super class
class cat extends Animal{
    public void sound(){
        System.out.println("The cat is meowing.");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();// here we created the instance from the class dog
        // d.eat();   // see, we didn't create any method like eat in dog class,
        //  but since its extended(inherited) from animal class, 
        //  it can use the properties/methods of animal without any restirction

        d.eat();
        d.bark();  // defined in Dog


        //same goes for cat class
        cat cat2 = new cat();
        cat2.sleep();//same like previous, it inherited the properties from super class(animal)
        cat2.sound();// defined in cat
    }
}



