package item;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoffeeItem {
    private String type;
    private String state;
    private double price;
    private double weight;

    public CoffeeItem(String type, String state, double price, double weight) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        if (state == null) {
            throw new IllegalArgumentException("State cannot be null");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.type = type;
        this.state = state;
        this.price = price;
        this.weight = weight;
    }


    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", State: " + state + ", Weight: " + weight + " kg, Price: " + price + " grn";
    }

}
