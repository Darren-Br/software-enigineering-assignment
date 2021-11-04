// Darren Browne - 18385273
package partA18385273;

// Imports
import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModuleTest {
    public Course testCourse;
    public Module testModule;
    public Student testStudent;
    public ArrayList<Student> students;
    public ArrayList<Course> courses;
    public ArrayList<String> courseNames;

    public ModuleTest() {

        students = new ArrayList<>(3);
        testStudent = new Student("JohnDoesey", 20, "14-03-2000", 18385272);
        Student johnDoe = new Student("JohnDoe", 21, "15-03-2000", 18385273);
        Student sueDoe = new Student("SueDoe", 22, "16-03-1999", 18385274);
        Student kateDoe = new Student("KateDoe", 23, "16-03-1998", 18385275);
        students.add(johnDoe);
        students.add(sueDoe);
        students.add(kateDoe);

        courses = new ArrayList<>(3);
        courseNames = new ArrayList<>(3);
        LocalDate start = LocalDate.parse("2021-09-06");
        LocalDate end = LocalDate.parse("2021-12-17");
        testCourse = new Course("Physics", start, end);
        Course testCourse1 = new Course("Computer Science", start, end);

        start = LocalDate.parse("2021-09-05");
        end = LocalDate.parse("2021-12-16");
        Course testCourse2 = new Course("Biomedical Engineering", start, end);

        start = LocalDate.parse("2021-09-04");
        end = LocalDate.parse("2021-12-15");
        Course testCourse3 = new Course("Nursing", start, end);

        courses.add(testCourse1);
        courseNames.add(testCourse1.getName());
        courses.add(testCourse2);
        courseNames.add(testCourse2.getName());
        courses.add(testCourse3);
        courseNames.add(testCourse3.getName());

        testModule = new Module("CT144", 4506);
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
        testModule.setStudents(students);
        assertEquals(testModule.getStudents(), students);
    }

    /**
     * Test of setStudents method, of class Module.
     */
    @Test
    public void testSetStudents() {
        testModule.setStudents(students);
    }

    /**
     * Test of getCourses method, of class Module.
     */
    @Test
    public void testGetCourses() {
        testModule.setCourses(courseNames);
        assertEquals(testModule.getCourses(), courseNames);
    }

    /**
     * Test of setCourses method, of class Module.
     */
    @Test
    public void testSetCourses() {
        testModule.setCourses(courseNames);
    }

    /**
     * Test of addStudent method, of class Module.
     */
    @Test
    public void testAddStudent() {
        testModule.addStudent(testStudent);
    }

    /**
     * Test of removeStudentByLocation method, of class Module.
     */
    @Test
    public void testRemoveStudentByName() {
        testModule.addStudent(testStudent);
        int size = testModule.getStudents().size();
        //should do nothing
        testModule.removeStudentByName("fake");
        assertEquals(size, testModule.getStudents().size());

        size = testModule.getStudents().size();
        testModule.removeStudentByName("JohnDoesey");
        assertEquals(size - 1, testModule.getStudents().size());
    }

    /**
     * Test of removeStudentById method, of class Module.
     */
    @Test
    public void testRemoveStudentById() {
        testModule.setStudents(students);
        int size = testModule.getStudents().size();
        //should do nothing
        testModule.removeStudentById(0000);
        assertEquals(size, testModule.getStudents().size());

        size = testModule.getStudents().size();
        testModule.removeStudentById(18385273);
        assertEquals(size - 1, testModule.getStudents().size());
    }

    /**
     * Test of removeStudentByLocation method, of class Module.
     */
    @Test
    public void testRemoveStudentByLocation() {
        testModule.setStudents(students);
        int size = testModule.getStudents().size();
        testModule.removeStudentByLocation(0);
        assertEquals(size - 1, testModule.getStudents().size());
    }

    /**
     * Test of addCourse method, of class Module.
     */
    @Test
    public void testAddCourse() {
        testModule.addCourse(testCourse.getName());
    }

    /**
     * Test of removeCourseByName method, of class Module.
     */
    @Test
    public void testRemoveCourseByName() {
        testModule.setCourses(courseNames);
        int size = testModule.getCourses().size();
        //should do nothing
        testModule.removeCourseByName("fake");
        assertEquals(size, testModule.getCourses().size());
        
        size = testModule.getCourses().size();
        testModule.removeCourseByName("Computer Science");
        assertEquals(size - 1, testModule.getCourses().size());
    }

    /**
     * Test of removeCourseByLocation method, of class Module.
     */
    @Test
    public void testRemoveCourseByLocation() {
        testModule.addCourse(testCourse.getName());
        int size = testModule.getCourses().size();
        testModule.removeCourseByLocation(0);
        assertEquals(size - 1, testModule.getCourses().size());
    }

}
