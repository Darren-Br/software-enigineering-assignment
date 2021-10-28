package partA18385273;

import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;


public class Course {
    public String Name;
    public List<Module> modules;
    public List<Student> students;
    public LocalDate startDate;
    public LocalDate endDate;

    public Course(String Name, LocalDate startDate, LocalDate endDate, List<Module> modules, List<Student> students) {
        this.Name = Name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modules = modules;
        this.students = students;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
    
    public void addModule(Module mod){
        modules.add(mod);
    }
    
    public void removeModuleByName(String name){
        //creates an iterator and goes through the modules
        //until the module is found by name and is deleted
        //if a module is not found will not delete anything
        Iterator<Module> itr = modules.iterator();
        while(itr.hasNext()){
            Module mod = itr.next();
            if (mod.getName().equals(name)){
                modules.remove(mod);
                break;
            }
        }
    }
    
    public void removeModule(int loc){
        //remove module by location in list
        modules.remove(loc);
    }
    
    public void addStudent(Student su){
        students.add(su);
    }
    
    public void removeStudent(int loc){
        //remove student by location in list
        students.remove(loc);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public void removeStudentByName(String name){
        //creates an iterator and goes through the students
        //until the student is found by name and is deleted
        //if a student is not found will not delete anything
        Iterator<Student> itr = students.iterator();
        while(itr.hasNext()){
            Student stu = itr.next();
            if (stu.getName().equals(name)){
                students.remove(stu);
                break;
            }
        }
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
}
