package Java_OOP_examples.ClassesObjects.miniResturantProject;


import java.util.*;
public class main {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        MenuItem[] menu = {

            new MenuItem("Samosa", 0.20),
            new MenuItem("Paratha", 0.30),
            new MenuItem("Pizza", 3),
            new MenuItem("Momo (Chicken)", 1.50),
            new MenuItem("Momo (Vegetable)", 1.20),
            new MenuItem("Momo (Buff)", 1.80),
            new MenuItem("Chowmein (Egg)", 1.00),
            new MenuItem("Chowmein (Chicken)", 1.30),
            new MenuItem("Chowmein (Vegetable)", 0.80),
            new MenuItem("Thukpa (Mixed)", 2.00),
            new MenuItem("Thukpa (Vegetable)", 1.50),
            new MenuItem("Sel Roti (per piece)", 0.15),
            new MenuItem("Aloo Tama", 1.20)
            

        };

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        Customer customer = new Customer(name);
        Order order = new Order(customer);


        System.out.println("--------MENU   ITEMS--------");
        for(int i = 0; i < menu.length; i++){
            System.out.print(i + 1 +". ");
            menu[i].DisplayItem();
        }

        //Take order
        String choice;
        do{
            System.out.print("Enter item number to order (or 'done' to finish): ");
            choice = sc.nextLine();

            if (!choice.equalsIgnoreCase("done")) {
                int index = Integer.parseInt(choice) - 1;

                if (index >= 0 && index < menu.length) {
                    order.addItem(menu[index]);
                }else{
                    System.out.println("Invalid item number.");
                }
            }
        }while(!choice.equalsIgnoreCase("done")); 

        //display order summary
        System.out.println("\n -----order summary------");
        order.DisplayOrder();


        sc.close();
    }
    
}
