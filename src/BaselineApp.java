import java.util.Scanner;

/**
 * Created by muskandhanda on 8/24/15.
 */
public class BaselineApp {
    public static void main(String []args) {
        System.out.println("Welcome to Baseline!\nStart Shopping!");
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu.\n1.Add new item.\n2.Print Result.\n3.Quit.\nEnter your choice : ");
            choice = input.nextInt();
        }while(choice != 3)
    }
}
