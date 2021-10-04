package partA18385273;
 
import java.util.List;

public class Student {
    public String name;
    public int age;
    public String dob;
    public int id;
    public List<Module> modules;
    public List<Course> courses;
    public String username;

    public Student(String name, int age, String dob, int id, List<Module> modules, List<Course> courses) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.modules = modules;
        this.courses = courses;
    }

    public String getUsername() {
        this.username = name + Integer.toString(age);
        return username;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    
}
