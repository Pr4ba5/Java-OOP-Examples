package Java_OOP_examples.ClassesObjects;

class Car{// here we created a new class named Car

    String brandName;//Now these are the attributes of our car class

    public void Start(){
        System.out.println("Your "+ brandName +" is running now.");
    }
    public void Stop(){
        System.out.println("Your "+ brandName +" is stopped now.");
    }

}

public class main1 {
    
    public static void main(String[]args){
        //As we have alreadu created class for our object
        //now let's create a new obj with that blueprint(class)

        Car car1 = new Car();
        car1.brandName = "Lamborgini";

        car1.Start();//nnow it will use the method start()
        car1.Stop();//likewise it will use that method stop()


        // and now likewise that was only 1 object
        // you might be questioning why that much code for only a object

        // hehe here you get wrong, now using same class you can create multiple object, car2, car3, car4

        // the adv we get here is that, now we don't have to create individual attributes and methods 
        // we can use the single attributes and methods. and it's code reuseability. 

        Car car2 = new Car();
        car2.brandName = "BYD";

        car2.Start();
        //hope you get the output in your mind already.


    }
}
