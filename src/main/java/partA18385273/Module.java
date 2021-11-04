//Darren Browne - 18385273
package partA18385273;

//imports
import java.util.Iterator;
import java.util.List;

public class Module {
    //class variables
    private String name;
    private int id;
    private List<Student> students;
    private List<Course> courses;

    //constructor
    public Module(String name, int id, List<Student> students,
                  List<Course> courses) {
        this.name = name;
        this.id = id;
        this.courses = courses;
        this.students = students;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student su) {
        students.add(su);
    }

    public void removeStudentByName(String name) {
        //creates an iterator and goes through the students
        //until the student is found by name and is deleted
        //if a student is not found will not delete anything
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            Student stu = itr.next();
            if (stu.getName().equals(name)) {
                students.remove(stu);
                break;
            }
        }
    }

    public void removeStudentByLocation(int loc) {
        //remove student by location in list
        students.remove(loc);
    }

    public void removeStudentById(int id) {
        //creates an iterator and goes through the students
        //until the student is found by id and is deleted
        //if an id is not found will not delete anything
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            Student stu = itr.next();
            if (stu.getId() == id) {
                students.remove(stu);
                break;
            }
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void removeCourse(int loc) {
        //remove course by location in list
        courses.remove(loc);
    }

    public void removeCourseByName(String name) {
        //creates an iterator and goes through the Courses
        //until the Course is found by name and is deleted
        //if a course is not found will not delete anything
        Iterator<Course> itr = courses.iterator();
        while (itr.hasNext()) {
            Course c = itr.next();
            if (c.getName().equals(name)) {
                courses.remove(c);
                break;
            }
        }
    }

}
