package partA18385273;

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
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
