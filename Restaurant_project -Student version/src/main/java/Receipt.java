import java.time.LocalTime;

public class Receipt {

    public double totalPrice;
    public String itemName;
    public double price;
    public int quantity;

    public double getPrice() {
        return price;
    }

    public Receipt(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;

    }


}