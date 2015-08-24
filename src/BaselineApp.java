import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by muskandhanda on 8/24/15.
 */
public class BaselineApp {
    public static void main(String []args) {
        System.out.println("Welcome to Baseline!\nStart Shopping!");
        Scanner input = new Scanner(System.in);
        ArrayList<Item> items=new ArrayList<Item>();
        int choice;
        do {
            System.out.println("\nMenu.\n1.Add new item.\n2.Print Result.\n3.Quit.\nEnter your choice : ");
            choice = input.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter item details : ");
                    String details;
                    //System.out.println("Yes");
                    Scanner inputs = new Scanner(System.in);
                    details = inputs.nextLine();
                    //System.out.println("Yes");
                    boolean imported=false;
                    if(details.contains("imported")) {
                        imported=true;
                    }
                    boolean exempt=false;
                    if(details.contains("book") || details.contains("chocolate") || details.contains("pill"))
                        exempt=true;
                    int qty=0;
                    int flag=0;
                    int flagn=-1;
                    String name=null;
                    double price=0;
                    String[] dets=details.split(" ");
                    int i=0;
                    for(String det:dets) {
                        if(flag==2) break;
                        if(flag==0 && det.matches("[0-9]+")) {
                            qty=Integer.parseInt(det);
                            //System.out.println(det);
                            flag=1;
                        }
                        else {
                            if (flag == 1 && det.matches("[0-9]+[.]?[0-9]*")) {
                                price = Double.parseDouble(det);
                                //System.out.println(price);
                                flag = 2;
                            }
                            if(flagn==1) {
                                name = det;
                                flagn = (dets.length)+4;
                                //System.out.println(name);
                            }
                            if(flag==1 && flagn != 2 && det.matches("of")) {
                                flagn=1;
                            }
                            if(flag==1 && flagn != 2 && det.matches("at")) {
                                flagn = i;
                            }
                        }
                        i++;
                    }
                    i=1;
                    if(flagn != dets.length+4 && flagn != -1) {
                        while(i<flagn)
                            name = name+dets[i--];
                    }
                    System.out.println(name);
                    Item temp = new Item(name,exempt,price,qty,imported);
                    double tax=temp.calculateTax();
                    System.out.println(tax);
                    items.add(temp);
                    break;

                case 2:
                    printResult(items);

            }
        }while(choice != 3);
    }

    private static void printResult(ArrayList<Item> items) {
        double s=0;
        for(Item i:items) {
            System.out.println(i.getQuantity()+" "+i.getItemName()+" : "+i.getCost());
            s+=i.getSalexTax();
        }
        System.out.println("Salex Tax : "+s);
    }
}
