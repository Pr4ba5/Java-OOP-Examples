package Java_OOP_examples.Constructors;
public class ConstructorExample{

    public static class student{//creating a new class

    String name;
    int age;

    //default constructor
    public student(){
        name = "unknown";
        age = 0;
    }

    //parametarized constructor
    public student(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void DisplayName(){
        System.out.println("The name of the student is "+ name + " and his current age is " + age+ " years old!");
    }
}
        public static void main(String []args){
        student std1 = new student();
        student std2 = new student("Suraj", 19);

        std1.DisplayName();// unknown, 0
        std2.DisplayName();// Suraj, 19
    }
}

