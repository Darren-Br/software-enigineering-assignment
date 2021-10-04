package partA18385273;

import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author darre
 */
public class CourseTest {
    Course testCourse;
    ArrayList<Student> students;
    ArrayList<Module> modules;
    LocalDate start, end;
    
    
    public CourseTest() {
        ArrayList<Module> emptyModules = new ArrayList<>();
        ArrayList<Course> emptyCourses  = new ArrayList<>();
        ArrayList<Student> emptyStudents = new ArrayList<>();
        
        modules = new ArrayList<>(3);
        Module testModule1 = new Module("CT144", 4506, emptyStudents, emptyCourses);
        Module testModule2 = new Module("CT145", 4507, emptyStudents, emptyCourses);
        Module testModule3 = new Module("CT146", 4508, emptyStudents, emptyCourses);
        modules.add(testModule1);
        modules.add(testModule2);
        modules.add(testModule3);
        
        students = new ArrayList<>(3);
        Student johnDoe = new Student("JohnDoe", 21, "15-03-2000", 18385273, emptyModules, emptyCourses);
        Student sueDoe = new Student("SueDoe", 22, "16-03-1999", 18385274, emptyModules, emptyCourses);
        Student kateDoe = new Student("KateDoe", 23, "16-03-1998", 18385275, emptyModules, emptyCourses);
        students.add(johnDoe);
        students.add(sueDoe);
        students.add(kateDoe);
        
        start = LocalDate.parse("2021-09-06");
        end = LocalDate.parse("2021-12-17");
        testCourse = new Course("Computer Science", start, end, modules, students);
    }
    

    /**
     * Test of getName method, of class Course.
     */
    @Test
    public void testGetName() {
        assertEquals(testCourse.getName(), "Computer Science");
    }

    /**
     * Test of setName method, of class Course.
     */
    @Test
    public void testSetName() {
        testCourse.setName("Engineering");
        assertEquals(testCourse.getName(), "Engineering");
    }

    /**
     * Test of getModules method, of class Course.
     */
    @Test
    public void testGetModules() {
        assertEquals(testCourse.getModules(), modules);
    }

    /**
     * Test of setModules method, of class Course.
     */
    @Test
    public void testSetModules() {
        modules.remove(0);
        testCourse.setModules(modules);
        assertEquals(testCourse.getModules(), modules);
    }

    /**
     * Test of getStudents method, of class Course.
     */
    @Test
    public void testGetStudents() {
        assertEquals(testCourse.getStudents(), students);
    }

    /**
     * Test of setStudents method, of class Course.
     */
    @Test
    public void testSetStudents() {
        students.remove(0);
        testCourse.setStudents(students);
        assertEquals(testCourse.getStudents(), students);
    }

    /**
     * Test of getStartDate method, of class Course.
     */
    @Test
    public void testGetStartDate() {
        assertEquals(testCourse.getStartDate(), start);
    }

    /**
     * Test of setStartDate method, of class Course.
     */
    @Test
    public void testSetStartDate() {
        LocalDate str = LocalDate.parse("2021-09-07");
        testCourse.setStartDate(str);
        assertEquals(testCourse.getStartDate(), str);
    }

    /**
     * Test of getEndDate method, of class Course.
     */
    @Test
    public void testGetEndDate() {
        assertEquals(testCourse.getEndDate(), end);
    }

    /**
     * Test of setEndDate method, of class Course.
     */
    @Test
    public void testSetEndDate() {
        LocalDate en = LocalDate.parse("2021-09-08");
        testCourse.setEndDate(en);
        assertEquals(testCourse.getEndDate(), en);
    }
    
}
