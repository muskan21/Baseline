/**
 * Created by muskandhanda on 8/24/15.
 */
public class Item {
    private String itemName;
    private boolean itemTypeInExempt;
    private double salesTax;
    private double itemPrice;
    private int quantity;
    private boolean imported;

    public Item(String itemName,boolean itemTypeInExempt, double itemPrice, int quantity, boolean imported) {
        this.itemName=itemName;
        this.itemTypeInExempt=itemTypeInExempt;
        this.itemPrice=itemPrice;
        this.quantity=quantity;
        this.imported=imported;
    }

    public double calculateTax() {
        return 0;
    }
}
