// Darren Browne - 18385273
package partA18385273;

// Imports
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.LocalDate;

public class StudentTest {
    public Course testCourse;
    public Module testModule;
    public Student testStudent;
    public ArrayList<Module> modules;
    public ArrayList<String> moduleNames;
    public ArrayList<Course> courses;
    public ArrayList<String> courseNames;

    public StudentTest() {

        modules = new ArrayList<>(3);
        moduleNames = new ArrayList<>(3);
        testModule = new Module("CT143", 4505);
        Module testModule1 = new Module("CT144", 4506);
        Module testModule2 = new Module("CT145", 4507);
        Module testModule3 = new Module("CT146", 4508);
        modules.add(testModule1);
        moduleNames.add("CT144");
        modules.add(testModule2);
        moduleNames.add("CT145");
        modules.add(testModule3);
        moduleNames.add("CT146");

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

        testStudent = new Student("JohnDoe", 21, "15-03-2000", 18385273);
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void testGetUsername() {
        assertEquals(testStudent.getUsername(),"JohnDoe21");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        assertEquals(testStudent.getName(),"JohnDoe");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        testStudent.setName("MichaelDoe");
        assertEquals(testStudent.getName(),"MichaelDoe");
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        assertEquals(testStudent.getAge(), 21);
    }

    /**
     * Test of setAge method, of class Student.
     */
    @Test
    public void testSetAge() {
        testStudent.setAge(22);
        assertEquals(testStudent.getAge(), 22);
    }

    /**
     * Test of getDob method, of class Student.
     */
    @Test
    public void testGetDob() {
        assertEquals(testStudent.getDob(), "15-03-2000");
    }

    /**
     * Test of setDob method, of class Student.
     */
    @Test
    public void testSetDob() {
        testStudent.setDob("16-03-2000");
        assertEquals(testStudent.getDob(), "16-03-2000");
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        assertEquals(testStudent.getId(), 18385273);
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        testStudent.setId(18385274);
        assertEquals(testStudent.getId(), 18385274);
    }

    /**
     * Test of getModules method, of class Student.
     */
    @Test
    public void testGetModules() {
        testStudent.setModules(moduleNames);
        assertEquals(testStudent.getModules(), moduleNames);
    }

    /**
     * Test of setModules method, of class Student.
     */
    @Test
    public void testSetModules() {
        testStudent.setModules(moduleNames);
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @Test
    public void testGetCourses() {
        testStudent.setCourses(courseNames);
        assertEquals(testStudent.getCourses(), courseNames);
    }

    /**
     * Test of setCourses method, of class Student.
     */
    @Test
    public void testSetCourses() {
        testStudent.setCourses(courseNames);
    }

    /**
     * Test of addModule method, of class Student.
     */
    @Test
    public void testAddModule() {
        testStudent.addModule(testModule.getName());
    }

    /**
     * Test of removeModuleByName method, of class Student.
     */
    @Test
    public void testRemoveModuleByName() {
        testStudent.setModules(moduleNames);
        int size = testStudent.getModules().size();
        //should do nothing
        testStudent.removeModuleByName("fake");
        assertEquals(size, testStudent.getModules().size());
        
        size = testStudent.getModules().size();
        testStudent.removeModuleByName("CT144");
        assertEquals(size - 1, testStudent.getModules().size());
    }

    /**
     * Test of removeModuleByLocation method, of class Student.
     */
    @Test
    public void testRemoveModuleByLocation() {
        testStudent.addModule(testModule.getName());
        int size = testStudent.getModules().size();
        testStudent.removeModuleByLocation(0);
        assertEquals(size - 1, testStudent.getModules().size());
    }

    /**
     * Test of addCourse method, of class Student.
     */
    @Test
    public void testAddCourse() {
        testStudent.addCourse(testCourse.getName());
    }

    /**
     * Test of removeCourseByName method, of class Student.
     */
    @Test
    public void testRemoveCourseByName() {
        testStudent.setCourses(courseNames);
        int size = testStudent.getCourses().size();
        //should do nothing
        testStudent.removeCourseByName("fake");
        assertEquals(size, testStudent.getCourses().size());

        size = testStudent.getCourses().size();
        testStudent.removeCourseByName("Computer Science");
        assertEquals(size - 1, testStudent.getCourses().size());
    }

    /**
     * Test of removeCourseByLocation method, of class Student.
     */
    @Test
    public void testRemoveCourseByLocation() {
        testStudent.addCourse(testCourse.getName());
        int size = testStudent.getCourses().size();
        testStudent.removeCourseByLocation(0);
        assertEquals(size - 1, testStudent.getCourses().size());
    }

}
