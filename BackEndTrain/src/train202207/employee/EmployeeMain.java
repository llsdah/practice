package train202207.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        double size = Commition.COMMISION;
        String name = "길동";
        EmployeeManager mg = new EmployeeManager();
        mg.add(new TempSalse(name,10,200));
        mg.add(new SalsePer(name,10,200));
        mg.add(new annualEmployee(name,10));

        mg.display();

        long temp = mg.aver(name);
        System.out.println("average : " + temp);


        
    }
}
