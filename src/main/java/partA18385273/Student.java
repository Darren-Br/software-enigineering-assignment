//Darren Browne - 18385273
package partA18385273;

//imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Student {
    //class variables
    private String name;
    private int age;
    private String dob;
    private int id;
    private List<String> modules;
    private List<String> courses;
    private String username;

    //constructor
    public Student(String name, int age, String dob, int id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.modules = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    //getters and setters
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

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    public void addModule(String mod) {
        modules.add(mod);
    }

    public void removeModuleByName(String name) {
        //creates an iterator and goes through the modules
        //until the module is found by name and is deleted
        //if a module is not found will not delete anything
        Iterator<String> itr = modules.iterator();
        while (itr.hasNext()) {
            String mod = itr.next();
            if (mod.equals(name)) {
                modules.remove(mod);
                break;
            }
        }
    }

    public void removeModuleByLocation(int loc) {
        //remove module by location in list
        modules.remove(loc);
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public void addCourse(String c) {
        courses.add(c);
    }

    public void removeCourseByLocation(int loc) {
        //remove course by location in array
        courses.remove(loc);
    }

    public void removeCourseByName(String name) {
        //creates an iterator and goes through the Courses
        //until the Course is found by name and is deleted
        //if a course is not found will not delete anything
        Iterator<String> itr = courses.iterator();
        while (itr.hasNext()) {
            String c = itr.next();
            if (c.equals(name)) {
                courses.remove(c);
                break;
            }
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        output += "Student Name: " + name + "\n";
        output += "Student Age: " + Integer.toString(age) + "\n";
        output += "Student DOB: " + dob + "\n";
        output += "Student ID: " + Integer.toString(id) + "\n";
        output += "Student Username: " + username + "\n";
        output += "Student Modules: " + String.join(", ", modules) + "\n";
        output += "Student Courses: " + String.join(", ", courses) + "\n";
        return output;
    }

}
