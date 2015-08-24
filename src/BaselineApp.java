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
                    String details = input.nextLine();
                    boolean imported;
                    if(details.contains("imported")) {
                        imported=true;
                    }
            }
        }while(choice != 3)
    }
}
