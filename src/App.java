import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        HashMap<String, String> students = new HashMap<String, String>();

        menu();
        System.out.println("Enter a Command (Enter 5 to Exit): ");
        int input = scan.nextInt();

        while(input != 5)
        {
            if(input == 1)
            {
                add();
            }
            else if(input == 2)
            {
                find();
            }
            else if(input == 3)
            {
                delete();
            }
            else if(input == 4)
            {
                showAll();
            }
            menu();
            System.out.println("Enter a Command (Enter 5 to Exit): ");
            input = scan.nextInt();
        }
        System.out.println("Exited program. Have a good day.");
    }

    public static void menu()
    {
        System.out.println("1 - Add Student");
        System.out.println("2 - Find Student");
        System.out.println("3 - Delete Student");
        System.out.println("4 - Show All Student");
        System.out.println("5 - Exit");
    }

    public static void add()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Student Name: ");
        String name = scan.nextLine();
        System.out.println("Student ID");
        String id = scan.nextLine();

        
    }

    public static void find()
    {
        System.out.println("you found");
    }

    public static void delete()
    {
        System.out.println("you deleted");
    }

    public static void showAll()
    {
        System.out.println("you showed all");
    }
}


/*
 * scanner
 * hashmap
 * print for the menu
 * loop
 * methods for all the menu options (except exit)
 */