import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        HashMap<String, String> students = new HashMap<String, String>();

        menu();
        int intInput = 0;

        while(intInput != 5)
        {
            System.out.println("Enter a Command (Enter 5 to Exit): ");
            String input = scan.nextLine();
            intInput = Integer.parseInt(input);
            if(intInput == 1)
            {
                System.out.println("Student Name: ");
                String name = scan.nextLine();
                System.out.println("Student ID: ");
                String id = scan.nextLine();
                students.put(id, name);
            }
            else if(intInput == 2)
            {
                System.out.println("Enter ID: ");
                String id = scan.nextLine();
                if(id == null)
                {
                    System.out.println("Student does not exist in the database.");
                }
                else
                {
                    System.out.println(students.get(id));
                }
            }
            else if(intInput == 3)
            {
                System.out.println("Enter ID: ");
                String id = scan.nextLine();
                if(id == null)
                {
                    System.out.println("Student does not exist in the database.");
                }
                else
                {
                    System.out.println(students.remove(id) + " has been removed.");
                }
            }
            else if(intInput == 4)
            {
                for(String student : students.keySet())
                {
                    System.out.println("Student Name: " + students.get(student) + " Student ID: " + student);
                }
            }
            menu();
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
}