public class salesEmployee extends Employee implements Sale {
    private float commis;

    public salesEmployee(float salary, float commis) {
        super(salary);
        this.commis = commis;
    }
    public salesEmployee() {this(0,0);}

    public float ComputeSalary() {
        return this.getSalary()*(1+(commis/100));
    }

    @Override
    public float getCom() {
        return this.commis;
    }

    @Override
    public String getSaleName() {
        return "Sales Employee";
    }
}



