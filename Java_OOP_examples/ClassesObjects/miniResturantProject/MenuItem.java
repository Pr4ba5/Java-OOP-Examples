package Java_OOP_examples.ClassesObjects.miniResturantProject;

public class MenuItem {

    String item;
    double price; 


    public MenuItem(String item, double price){
        this.item = item;
        this.price = price;
    }

    public void DisplayItem(){
        System.out.println(item + " - $" + price);
    }
    
}
