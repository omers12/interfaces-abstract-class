public class Salary {
    public static void main(String[] args){
        //create different types of employees and print their names and salaries
        Employee oscar= new Employee(50000);
        System.out.println("oscar salary:" +oscar.ComputeSalary()+ " and he is" + oscar.getName());

        Manager Ron=new Manager(400,100);
        System.out.println("Ron's salary is "+ Ron.ComputeSalary()+" and he is "+ Ron.getName());
        salesEmployee Stiv=new salesEmployee(20,30);
        System.out.println("Stiv salary is "+ Stiv.ComputeSalary()+" and he is "+ Stiv.getSaleName());
        SalesManager Ben=new SalesManager(50,80,100);
        System.out.println("Ben salary is "+Ben.ComputeSalary()+" nad he is "+ Ben.getSaleName());
    }


}
