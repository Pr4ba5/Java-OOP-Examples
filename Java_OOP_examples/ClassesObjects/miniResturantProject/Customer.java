package Java_OOP_examples.ClassesObjects.miniResturantProject;

public class Customer {
    String name;

    public Customer(String name){
        this.name = name;
    }

    public void DisplayName(){
        System.out.println("Customer: " + name);
    }
}
