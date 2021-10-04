package partA18385273;

import java.util.List;

public class Module {
    public String name;
    public int id;
    public List<Student> students;
    public List<Course> courses;

    public Module(String name, int id, List<Student> students, List<Course> courses) {
        this.name = name;
        this.id = id;
        this.courses = courses;
        this.students = students;
    }

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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    
}
