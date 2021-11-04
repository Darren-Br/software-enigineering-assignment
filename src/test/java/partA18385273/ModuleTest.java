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

    public ModuleTest() {
        ArrayList<Module> emptyModules = new ArrayList<>();
        ArrayList<Course> emptyCourses  = new ArrayList<>();
        ArrayList<Student> emptyStudents = new ArrayList<>();

        students = new ArrayList<>(3);
        testStudent = new Student("JohnDoesey", 20, "14-03-2000", 18385272, emptyModules, emptyCourses);
        Student johnDoe = new Student("JohnDoe", 21, "15-03-2000", 18385273, emptyModules, emptyCourses);
        Student sueDoe = new Student("SueDoe", 22, "16-03-1999", 18385274, emptyModules, emptyCourses);
        Student kateDoe = new Student("KateDoe", 23, "16-03-1998", 18385275, emptyModules, emptyCourses);
        students.add(johnDoe);
        students.add(sueDoe);
        students.add(kateDoe);

        courses = new ArrayList<>(3);
        LocalDate start = LocalDate.parse("2021-09-06");
        LocalDate end = LocalDate.parse("2021-12-17");
        testCourse = new Course("Physics", start, end, emptyModules, emptyStudents);
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

        testModule = new Module("CT144", 4506, emptyStudents, emptyCourses);
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
        testModule.setCourses(courses);
        assertEquals(testModule.getCourses(), courses);
    }

    /**
     * Test of setCourses method, of class Module.
     */
    @Test
    public void testSetCourses() {
        testModule.setCourses(courses);
    }

    /**
     * Test of addStudent method, of class Module.
     */
    @Test
    public void testAddStudent() {
        testCourse.addStudent(testStudent);
    }

    /**
     * Test of removeStudentByLocation method, of class Module.
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
        assertEquals(size-1, testCourse.getStudents().size());
    }

    /**
     * Test of removeStudentById method, of class Module.
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
     * Test of removeStudentByLocation method, of class Module.
     */
    @Test
    public void testRemoveStudentByLocation() {
        testCourse.setStudents(students);
        int size = testCourse.getStudents().size();
        testCourse.removeStudentByLocation(0);
        assertEquals(size - 1, testCourse.getStudents().size());
    }

    /**
     * Test of addCourse method, of class Module.
     */
    @Test
    public void testAddCourse() {
        testStudent.addCourse(testCourse);
    }

    /**
     * Test of removeCourseByName method, of class Module.
     */
    @Test
    public void testRemoveCourseByName() {
        testStudent.setCourses(courses);
        int size = testStudent.getCourses().size();
        //should do nothing
        testStudent.removeCourseByName("fake");
        assertEquals(size, testStudent.getCourses().size());
        
        size = testStudent.getCourses().size();
        testStudent.removeCourseByName("Computer Science");
        assertEquals(size - 1, testStudent.getCourses().size());
    }

    /**
     * Test of removeCourseByLocation method, of class Module.
     */
    @Test
    public void testRemoveCourseByLocation() {
        testStudent.addCourse(testCourse);
        int size = testStudent.getCourses().size();
        testStudent.removeCourseByLocation(0);
        assertEquals(size - 1, testStudent.getCourses().size());
    }

}
