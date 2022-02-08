import java.util.ArrayList;

public class CoffeeKisk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKisk(){
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price){
        Item newItem = new Item();
        newItem.setName(name);
        newItem.setPrice(price);
        menu.add(newItem);
        menu.get(menu.size() - 1).setIndex(menu.size() -1);
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order newOrder = new Order();
        newOrder.setName(name);
        this.displayMenu();
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
            newOrder.items.add(this.menu.get((Integer.parseInt(itemNumber))));
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        System.out.println(newOrder.getName()); 
        for (int i = 0; i < newOrder.items.size(); i++){
            System.out.printf("Item: %s, Price: %.2f \n",newOrder.items.get(i).getName(), newOrder.items.get(i).getPrice());
        }
        
    }


    public void displayMenu(){
        for (int i = 0; i < menu.size(); i++){
            System.out.printf("%s %s -- %.2f \n", menu.get(i).getIndex(), menu.get(i).getName(), menu.get(i).getPrice() );
        }
        
    }
}
