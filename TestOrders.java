import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args){
        CoffeeKisk test = new CoffeeKisk();
        test.addMenuItem("pizza", 1.00);
        test.addMenuItem("burger", 2.00);
        test.newOrder();
    }
}
