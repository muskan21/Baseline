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
                    boolean imported;
                    if(details.contains("imported")) {
                        imported=true;
                    }
                    boolean exempt;
                    if(details.contains("book") || details.contains("chocolate") || details.contains("pill"))
                        exempt=true;
                    int qty=0;
                    int flag=0;
                    int flagn=0;
                    String name;
                    double price=0;
                    for(String det:details.split(" ")) {
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
                                flagn = 2;
                                System.out.println(name);
                            }
                            if(flag==1 && det.matches("of")) {
                                flagn = 1;
                            }

                        }
                    }
                    //System.out.println(qty);
                    items.add(new Item());
                    break;
            }
        }while(choice != 3);
    }
}
