public class Manager extends Employee {
    private float kmult;
    public Manager(float salary, float kmult) {
        super(salary);
        this.kmult=kmult;

    }
    public float ComputeSalary() {
        return this.getSalary()*this.kmult;
    }

    public float getKmult() {
        return kmult;
    }

    public String getName() { return "Manager"; }
}
