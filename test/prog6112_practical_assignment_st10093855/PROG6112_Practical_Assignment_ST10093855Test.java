package prog6112_practical_assignment_st10093855;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PROG6112_Practical_Assignment_ST10093855Test 
{

    @Test
    public void testSaveStudent() 
    {
        Student student = new Student(1, "John Doe", 20, "john.doe@example.com", "Computer Science");
        student.SaveStudent();
        assertEquals(student, Student.SearchStudent(1));
    }

    @Test
    public void testSearchStudent() 
    {
        Student student = new Student(2, "Jane Smith", 22, "jane.smith@example.com", "Engineering");
        student.SaveStudent();
        Student foundStudent = Student.SearchStudent(2);
        assertNotNull(foundStudent);
        assertEquals(2, foundStudent.getID());
        assertEquals("Jane Smith", foundStudent.getName());
        assertEquals(22, foundStudent.getAge());
        assertEquals("jane.smith@example.com", foundStudent.getEmail());
        assertEquals("Engineering", foundStudent.getCourse());
    }

    @Test
    public void testSearchStudent_StudentNotFound() 
    {
        Student foundStudent = Student.SearchStudent(999);
        assertNull(foundStudent);
    }

    @Test
    public void testDeleteStudent() 
    {
        Student student = new Student(3, "Sam Jones", 18, "s.jones@example.com", "Mathematics");
        student.SaveStudent();
        boolean isDeleted = Student.DeleteStudent(3);
        assertTrue(isDeleted);
        assertNull(Student.SearchStudent(3));
    }

    @Test
    public void testDeleteStudent_StudentNotFound() 
    {
        boolean isDeleted = Student.DeleteStudent(999);
        assertFalse(isDeleted);
    }

    @Test
    public void testStudentAge_StudentAgeValid() 
    {
        Student student = new Student(4, "Valid Age", 20, "valid.age@example.com", "History");
        assertTrue(student.getAge() >= 16);
    }
}
