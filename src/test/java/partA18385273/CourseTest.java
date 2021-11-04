// Darren Browne - 18385273
package partA18385273;

// Imports
import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class CourseTest {
    public Course testCourse;
    public Module testModule;
    public Student testStudent;
    public ArrayList<Student> students;
    public ArrayList<Module> modules;
    public LocalDate start, end;

    public CourseTest() {
        ArrayList<Module> emptyModules = new ArrayList<>();
        ArrayList<Course> emptyCourses  = new ArrayList<>();
        ArrayList<Student> emptyStudents = new ArrayList<>();

        modules = new ArrayList<>(3);
        testModule = new Module("CT143", 4505, emptyStudents, emptyCourses);
        Module testModule1 = new Module("CT144", 4506, emptyStudents, emptyCourses);
        Module testModule2 = new Module("CT145", 4507, emptyStudents, emptyCourses);
        Module testModule3 = new Module("CT146", 4508, emptyStudents, emptyCourses);
        modules.add(testModule1);
        modules.add(testModule2);
        modules.add(testModule3);

        students = new ArrayList<>(3);
        testStudent = new Student("JohnDoesey", 20, "14-03-2000", 18385272, emptyModules, emptyCourses);
        Student johnDoe = new Student("JohnDoe", 21, "15-03-2000", 18385273, emptyModules, emptyCourses);
        Student sueDoe = new Student("SueDoe", 22, "16-03-1999", 18385274, emptyModules, emptyCourses);
        Student kateDoe = new Student("KateDoe", 23, "16-03-1998", 18385275, emptyModules, emptyCourses);
        students.add(johnDoe);
        students.add(sueDoe);
        students.add(kateDoe);

        start = LocalDate.parse("2021-09-06");
        end = LocalDate.parse("2021-12-17");
        testCourse = new Course("Computer Science", start, end, emptyModules, emptyStudents);
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
     * Test of setModules method, of class Course.
     */
    @Test()
    public void testSetModules() {
        testCourse.setModules(modules);
    }

    /**
     * Test of getModules method, of class Course.
     */
    @Test()
    public void testGetModules() {
        testCourse.setModules(modules);
        assertEquals(testCourse.getModules(), modules);
    }

    /**
     * Test of setStudents method, of class Course.
     */
    @Test()
    public void testSetStudents() {
        testCourse.setStudents(students);
    }

    /**
     * Test of getStudents method, of class Course.
     */
    @Test
    public void testGetStudents() {
        testCourse.setStudents(students);
        assertEquals(testCourse.getStudents(), students);
    }

    /**
     * Test of addStudent method, of class Course.
     */
    @Test
    public void testAddStudent() {
        testCourse.addStudent(testStudent);
    }

    /**
     * Test of removeStudentByLocation method, of class Course.
     */
    @Test
    public void testRemoveStudentByName() {
        testCourse.addStudent(testStudent);
        int size = testCourse.getStudents().size();
        //should do nothing
        testCourse.removeStudentByName("fake");
        assertEquals(size, testCourse.getStudents().size());

        size = testCourse.getStudents().size();
        testCourse.removeStudentByName("JohnDoesey");
        assertEquals(size - 1, testCourse.getStudents().size());
    }

    /**
     * Test of removeStudentById method, of class Course.
     */
    @Test
    public void testRemoveStudentById() {
        testCourse.setStudents(students);
        int size = testCourse.getStudents().size();
        //should do nothing
        testCourse.removeStudentById(0000);
        assertEquals(size, testCourse.getStudents().size());

        size = testCourse.getStudents().size();
        testCourse.removeStudentById(18385273);
        assertEquals(size - 1, testCourse.getStudents().size());
    }

    /**
     * Test of removeStudentByLocation method, of class Course.
     */
    @Test
    public void testRemoveStudentByLocation() {
        testCourse.setStudents(students);
        int size = testCourse.getStudents().size();
        testCourse.removeStudentByLocation(0);
        assertEquals(size - 1, testCourse.getStudents().size());
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

    /**
     * Test of addModule method, of class Course.
     */
    @Test
    public void testAddModule() {
        testCourse.addModule(testModule);
    }

    /**
     * Test of removeModuleByName method, of class Course.
     */
    @Test
    public void testRemoveModuleByName() {
        testCourse.setModules(modules);
        int size = testCourse.getModules().size();
        //should do nothing
        testCourse.removeModuleByName("fake");
        assertEquals(size, testCourse.getModules().size());
        
        size = testCourse.getModules().size();
        testCourse.removeModuleByName("CT144");
        assertEquals(size - 1, testCourse.getModules().size());
    }

    /**
     * Test of removeModuleById method, of class Course.
     */
    @Test
    public void testRemoveModuleById() {
        testCourse.setModules(modules);
        int size = testCourse.getModules().size();
        //should do nothing
        testCourse.removeModuleById(0000);
        assertEquals(size, testCourse.getModules().size());

        size = testCourse.getModules().size();
        testCourse.removeModuleById(4506);
        assertEquals(size - 1, testCourse.getModules().size());
    }

    /**
     * Test of removeModuleByLocation method, of class Course.
     */
    @Test
    public void testRemoveModuleByLocation() {
        testCourse.addModule(testModule);
        int size = testCourse.getModules().size();
        testCourse.removeModuleByLocation(0);
        assertEquals(size - 1, testCourse.getModules().size());
    }

}
