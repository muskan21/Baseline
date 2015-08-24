import static java.lang.Math.round;
import static oracle.jrockit.jfr.events.Bits.doubleValue;

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
    private double cost;
    private double salexTax;

    public Item(String itemName,boolean itemTypeInExempt, double itemPrice, int quantity, boolean imported) {
        this.itemName=itemName;
        this.itemTypeInExempt=itemTypeInExempt;
        this.itemPrice=itemPrice;
        this.quantity=quantity;
        this.imported=imported;
        salesTax=0;
        cost=this.itemPrice;
    }

    public double calculateTax() {
        double genTax,iTax;
        if(itemTypeInExempt) {
            genTax=0;
        }
        else {
            genTax=this.itemPrice*0.1;
        }
        if(!imported) {
            iTax=0;
        }
        else {
            iTax=this.itemPrice*0.05;
        }
        this.salesTax=genTax+iTax;
        this.cost=itemPrice+salesTax;
        return salesTax;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getCost() {
        return cost;
    }

    public double getSalexTax() {
        return salexTax;
    }
}
