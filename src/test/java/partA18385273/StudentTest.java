package partA18385273;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.LocalDate;


/**
 *
 * @author darre
 */
public class StudentTest {
    
    ArrayList<Module> modules;
    ArrayList<Course> courses;
    Student johnDoe;
    
    public StudentTest() {
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
        
        johnDoe = new Student("JohnDoe", 21, "15-03-2000", 18385273, modules, courses);
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void testGetUsername() {
        assertEquals(johnDoe.getUsername(),"JohnDoe21");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        assertEquals(johnDoe.getName(),"JohnDoe");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        johnDoe.setName("MichaelDoe");
        assertEquals(johnDoe.getName(),"MichaelDoe");
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        assertEquals(johnDoe.getAge(), 21);
    }

    /**
     * Test of setAge method, of class Student.
     */
    @Test
    public void testSetAge() {
        johnDoe.setAge(22);
        assertEquals(johnDoe.getAge(), 22);
    }

    /**
     * Test of getDob method, of class Student.
     */
    @Test
    public void testGetDob() {
        assertEquals(johnDoe.getDob(), "15-03-2000");
    }

    /**
     * Test of setDob method, of class Student.
     */
    @Test
    public void testSetDob() {
        johnDoe.setDob("16-03-2000");
        assertEquals(johnDoe.getDob(), "16-03-2000");
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        assertEquals(johnDoe.getId(), 18385273);
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        johnDoe.setId(18385274);
        assertEquals(johnDoe.getId(), 18385274);
    }
    
    /**
     * Test of getModules method, of class Student.
     */
    @Test
    public void testGetModules() {
        assertEquals(johnDoe.getModules(), modules);
    }
    
    /**
     * Test of setModules method, of class Student.
     */
    @Test
    public void testSetModules() {
        modules.remove(0);
        johnDoe.setModules(modules);
        assertEquals(johnDoe.getModules(), modules);
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @Test
    public void testGetCourses() {
        assertEquals(johnDoe.getCourses(), courses);
    }

    /**
     * Test of setCourses method, of class Student.
     */
    @Test
    public void testSetCourses() {
        courses.remove(0);
        johnDoe.setCourses(courses);
        assertEquals(johnDoe.getCourses(), courses);
    } 
    
}
