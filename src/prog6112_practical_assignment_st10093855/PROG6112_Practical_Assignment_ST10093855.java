package prog6112_practical_assignment_st10093855;
import java.util.Scanner;

public class PROG6112_Practical_Assignment_ST10093855 
{
   public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("STUDENT MANAGEMENT APPLICATION");
            System.out.println("*******************************");
            System.out.println("Enter (1) to launch menu or any other key to exit");

            String input = scanner.nextLine();

            if (!input.equals("1")) 
            {
                System.exit(0);
            }

            displayMenu(scanner);
        }
    }

    public static void displayMenu(Scanner scanner) 
    {
        while (true) 
        {
            System.out.println("Please select one of the following menu items:");
            System.out.println("(1) Capture a new student.");
            System.out.println("(2) Search for a student.");
            System.out.println("(3) Delete a student.");
            System.out.println("(4) Print student report.");
            System.out.println("(5) Exit Application.");

            String choice = scanner.nextLine();

            switch (choice) 
            {
                case "1":
                    Student.CaptureStudent(scanner);
                    break;
                case "2":
                    Student.SearchStudent(scanner);
                    break;
                case "3":
                    Student.DeleteStudent(scanner);
                    break;
                case "4":
                    Student.StudentReport(scanner);
                    break;
                case "5":
                    Student.ExitStudentApplication();
                    break;
            }
        }
    }
}