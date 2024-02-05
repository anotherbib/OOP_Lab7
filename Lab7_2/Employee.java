import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String position;
    private int salary;
    private List<Employee> empList;
    
    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.empList = new ArrayList<>();
    }
    public void add(Employee e) {
        empList.add(e);
    }
    public void remove(Employee e) {
        empList.remove(e);
    }
    public List<Employee> getEmp() {
        return empList;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
    }
}