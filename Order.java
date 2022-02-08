import java.util.ArrayList;

public class Order {
    private String name;
    private boolean isReady;
    private double total;
    public ArrayList<Item> items = new ArrayList<Item>();

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getTotal(){
        double total = 0.0;
        for(Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }

    public boolean getIsReady(){
        return this.isReady;
    }

    public void setIsReady(boolean isReady){
        this.isReady = isReady;
    }

}