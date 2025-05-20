package Java_OOP_examples.Polymorphism;

/*Why in so hurry :> ?? chill bro we have enough time so,
I humbly request you to visit and understand the basic concepts from the readme. of this particular topic
before starting to understand the code. */

class Animal{
    public void makesSound(){
        System.out.println("Animal is making sound");
    }
}

class Dog extends Animal{
    @Override//As we already know its the type of polymorphism
    public void makesSound(){
        System.out.println("Bhow Bhow");//here we override the same method which we inherited from the super class(Animal)
    }

}

class Cat extends Animal{


    @Override
    public void makesSound(){
        System.out.println("Meow Meow");//once again like in previous we are overrriding the method
    }

    //now let's look into method overloading also
    //its done in samee class
    public void makesSound(int NumOfsound){
        for(int i = 0; i < NumOfsound; i++){
            System.out.println("Cat is Meowing, meow meow");//now we overload the same method
        }
    }

    // still not understand then
    //the default makesSound method will be "Meow Meow" but when we pass the value to same method then, the second method will run
    //and like this how overload method work under same class
}

public class PolymorphismExample{
    public static void main(String[] args) {
        Animal anm1 = new Animal();
        anm1.makesSound();// the output will be "Animal is making sound" 


        Dog dog = new Dog();
        dog.makesSound();//know it won't print the same output as animal although methods are same
        //output will be "Bhow Bhow" since we've already override the inherited method

        Cat cat = new Cat();
        cat.makesSound();//the default method will run
        cat.makesSound(3);//but when we give value, the method that takes value will run
    }
}