package partA18385273;


import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author darre
 */
public class ModuleTest {
    Module testModule;
    ArrayList<Student> students;
    ArrayList<Course> courses;
    
    public ModuleTest() {
        ArrayList<Module> emptyModules = new ArrayList<>();
        ArrayList<Course> emptyCourses  = new ArrayList<>();
        ArrayList<Student> emptyStudents = new ArrayList<>();
        
        students = new ArrayList<>(3);
        Student johnDoe = new Student("JohnDoe", 21, "15-03-2000", 18385273, emptyModules, emptyCourses);
        Student sueDoe = new Student("SueDoe", 22, "16-03-1999", 18385274, emptyModules, emptyCourses);
        Student kateDoe = new Student("KateDoe", 23, "16-03-1998", 18385275, emptyModules, emptyCourses);
        students.add(johnDoe);
        students.add(sueDoe);
        students.add(kateDoe);
        
        courses = new ArrayList<>(3);
        LocalDate start = LocalDate.parse("2021-09-06");
        LocalDate end = LocalDate.parse("2021-12-17");
        Course testCourse1 = new Course("Computer Science", start, end, emptyModules, emptyStudents);
        
        start = LocalDate.parse("2021-09-05");
        end = LocalDate.parse("2021-12-16");
        Course testCourse2 = new Course("Biomedical Engineering", start, end, emptyModules, emptyStudents);
        
        start = LocalDate.parse("2021-09-04");
        end = LocalDate.parse("2021-12-15");
        Course testCourse3 = new Course("Nursing", start, end, emptyModules, emptyStudents);
        
        courses.add(testCourse1);
        courses.add(testCourse2);
        courses.add(testCourse3);
        
        testModule = new Module("CT144", 4506, students, courses);
    }
    
    /**
     * Test of getName method, of class Module.
     */
    @Test
    public void testGetName() {
        assertEquals(testModule.getName(), "CT144");
    }

    /**
     * Test of setName method, of class Module.
     */
    @Test
    public void testSetName() {
        testModule.setName("CT145");
        assertEquals(testModule.getName(), "CT145");
    }

    /**
     * Test of getId method, of class Module.
     */
    @Test
    public void testGetId() {
        assertEquals(testModule.getId(), 4506);
    }

    /**
     * Test of setId method, of class Module.
     */
    @Test
    public void testSetId() {
        testModule.setId(4507);
        assertEquals(testModule.getId(), 4507);
    }

    /**
     * Test of getStudents method, of class Module.
     */
    @Test
    public void testGetStudents() {
        assertEquals(testModule.getStudents(), students);
    }

    /**
     * Test of setStudents method, of class Module.
     */
    @Test
    public void testSetStudents() {
        students.remove(0);
        testModule.setStudents(students);
        assertEquals(testModule.getStudents(), students);
    }

    /**
     * Test of getCourses method, of class Module.
     */
    @Test
    public void testGetCourses() {
        assertEquals(testModule.getCourses(), courses);
    }

    /**
     * Test of setCourses method, of class Module.
     */
    @Test
    public void testSetCourses() {
        courses.remove(0);
        testModule.setCourses(courses);
        assertEquals(testModule.getCourses(), courses);
    }
    
}
