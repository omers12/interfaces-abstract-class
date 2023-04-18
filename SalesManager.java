public class SalesManager extends Manager implements Sale{
    private float commis;

    public SalesManager(){this(0,0,0);}
    public SalesManager(float salary, float kmult, float commis){
        super(salary,kmult);
        this.commis=commis;
    }
    public float ComputeSalary(){
        return this.getSalary() * this.getKmult()*(1+commis/100);
    }

    @Override
    public float getCom() {
        return this.commis;
    }

    @Override
    public String getSaleName() {
        return "Sales Manager";
    }
}
