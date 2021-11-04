//Darren Browne - 18385273
package partA18385273;

//imports
import java.util.Iterator;
import java.util.List;


public class Student {
    //class variables
    private String name;
    private int age;
    private String dob;
    private int id;
    private List<Module> modules;
    private List<Course> courses;
    private String username;

    //constructor
    public Student(String name, int age, String dob, int id,
                   List<Module> modules, List<Course> courses) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.modules = modules;
        this.courses = courses;
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

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public void addModule(Module mod) {
        modules.add(mod);
    }

    public void removeModuleByName(String name) {
        //creates an iterator and goes through the modules
        //until the module is found by name and is deleted
        //if a module is not found will not delete anything
        Iterator<Module> itr = modules.iterator();
        while (itr.hasNext()) {
            Module mod = itr.next();
            if (mod.getName().equals(name)) {
                modules.remove(mod);
                break;
            }
        }
    }

    public void removeModuleByLocation(int loc) {
        //remove module by location in list
        modules.remove(loc);
    }

    public void removeModuleById(int id) {
        //creates an iterator and goes through the modules
        //until the module is found by id and is deleted
        //if an id is not found it will not delete anything
        Iterator<Module> itr = modules.iterator();
        while (itr.hasNext()) {
            Module mod = itr.next();
            if (mod.getId() == id) {
                modules.remove(mod);
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

    public void removeCourseByLocation(int loc) {
        //remove course by location in array
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
