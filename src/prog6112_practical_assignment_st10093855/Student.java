package prog6112_practical_assignment_st10093855;
import java.util.ArrayList;
import java.util.Scanner;

public class Student 
{
    private int id;
    private String name;
    private int age;
    private String email;
    private String course;

    private static ArrayList<Student> studentList = new ArrayList<>();

    public Student(int id, String name, int age, String email, String course) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    public void SaveStudent() 
    {
        studentList.add(this);
    }

    public static Student SearchStudent(int id) 
    {
        for (Student student : studentList) 
        {
            if (student.id == id) 
            {
                return student;
            }
        }
        return null;
    }

    public static boolean DeleteStudent(int id) 
    {
        Student student = SearchStudent(id);
        if (student != null) 
        {
            studentList.remove(student);
            return true;
        } 
        else 
        {
            return false;
        }
    }

    public static void StudentReport(Scanner scanner) 
    {
        int studentNumber = 1;
        for (Student student : studentList) 
        {
            System.out.println("Student " + studentNumber);
            System.out.println("--------------------------------------");
            System.out.println("STUDENT ID: " + student.getID());
            System.out.println("STUDENT NAME: " + student.getName());
            System.out.println("STUDENT AGE: " + student.getAge());
            System.out.println("STUDENT EMAIL: " + student.getEmail());
            System.out.println("STUDENT COURSE: " + student.getCourse());
            System.out.println("--------------------------------------");
            studentNumber++;
        }
        System.out.print("Enter (1) to launch menu or any other key to exit");
        String input = scanner.nextLine();
        if (!input.equals("1")) 
        {
            System.exit(0);
        }
    }

    public static void ExitStudentApplication() 
    {
        System.exit(0);
    }
    
    public static void CaptureStudent(Scanner scanner) 
    {
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("*********************");

        System.out.print("Enter the student id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student age: ");
        int age = 0;
        while (true) 
        {
            try 
            {
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 16) 
                {
                    break;
                } 
                else 
                {
                    System.out.println("You have entered an incorrect student age!!!");
                    System.out.print("Please re-enter the student age >> ");
                }
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("You have entered an incorrect student age!!!");
                System.out.print("Please re-enter the student age >> ");
            }
        }

        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        Student student = new Student(id, name, age, email, course);
        student.SaveStudent();
        
        System.out.print("Enter (1) to launch menu or any other key to exit");
        String input = scanner.nextLine();
        if (!input.equals("1")) 
        {
            System.exit(0);
        }
    }

    public static void SearchStudent(Scanner scanner) 
    {
        System.out.print("Enter the student ID to search: ");
        int id = Integer.parseInt(scanner.nextLine());
        

        Student student = SearchStudent(id);
        if (student != null) 
        {
            System.out.println("--------------------------------------");
            System.out.println("STUDENT ID: " + student.getID());
            System.out.println("STUDENT NAME: " + student.getName());
            System.out.println("STUDENT AGE: " + student.getAge());
            System.out.println("STUDENT EMAIL: " + student.getEmail());
            System.out.println("STUDENT COURSE: " + student.getCourse());
            System.out.println("--------------------------------------");
        } 
        else 
        {
            System.out.println("--------------------------------------");
            System.out.println("Student with ID " + id + " was not found!");
            System.out.println("--------------------------------------");
        }
        System.out.println("Enter (1) to launch menu or any other key to exit");
        String input = scanner.nextLine();
        if (!input.equals("1")) 
        {
        System.exit(0);
        }
    }

    public static void DeleteStudent(Scanner scanner) 
    {
        System.out.print("Enter the student ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        Student student = SearchStudent(id);

        if (student != null) 
        {
            System.out.println("Are you sure you want to delete delete student " + student.getID() + " from the system? Yes (y) to delete");
            String confirmation = scanner.nextLine();

            if (confirmation.equalsIgnoreCase("y")) 
            {
                if (DeleteStudent(id)) 
                {
                    System.out.println("--------------------------------------");
                    System.out.println("Student with Student ID " + id + " WAS deleted!");
                    System.out.println("--------------------------------------");
                }
            } 
        } 
        else 
        {
            System.out.println("--------------------------------------");
            System.out.println("Student with Student ID: " + id + " was not found!");
            System.out.println("--------------------------------------");
        }
        System.out.println("Enter (1) to launch menu or any other key to exit");
        String input = scanner.nextLine();
        if (!input.equals("1")) 
        {
        System.exit(0);
        }
    }
    
    public int getID() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getCourse() 
    {
        return course;
    }
}
