public class Employee {
    private float salary;
    public Employee(float salary) {
        this.salary= salary;
    }
    public Employee() {this(0);}

    public float ComputeSalary() {
        return salary; //delay the implement for the concratic class
    }

    public float getSalary(){return salary;}
    public String getName() {return "Employee" ; }
}
