package Java_OOP_examples.Abstraction;


abstract class Animal{
    abstract void makeSound();

    public void sleep(){
        System.out.println("Animal is sleeping quitely..zzz");
    }

}

class Dog extends Animal{

    @Override
    void makeSound(){
        System.out.println("bhow bhow bhow!!");
    }

}


class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow Moew Moew");
    }
}

public class AbstractionExample{
    public static void main(String [] args){
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();  // Dog's implementation
        a2.makeSound();  // Cat's implementation

        a1.sleep();      // Common method
    }
}