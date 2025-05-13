package Java_OOP_examples.ClassesObjects.miniResturantProject;


import java.util.ArrayList;
public class Order {
    Customer customer;
    ArrayList<MenuItem> items;

    public Order(Customer customer){
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item){
        items.add(item);
    }

    public void DisplayOrder(){
        customer.DisplayName();
        System.out.println("Your order: ");
        double total = 0;
        for(MenuItem item : items){
            item.DisplayItem();
            total += item.price;
        }

        System.out.println("Total: $" + total);
    }
}
