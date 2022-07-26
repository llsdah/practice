package train202207.employee;

public class EmployeeManager {
    private Employee[] employees;
    private int count;

    public EmployeeManager(){
        this(10);
    }
    public EmployeeManager(int size){
        employees = new Employee[size];
    }

    public void add(Employee employee){
        employees[count++] =employee;
    }

    public void display(){
        for (Employee emp: employees) {
            if(emp==null) return;
            System.out.println("emp :"+emp.toString() );
        }
    }

    // 부서별 평균값 구하느 것이지만, name 작업을 나중에 정의해 추가 수정은 하지 않았다.
    public long aver(String name){
        long pay =0;
        for (Employee emp: employees) {
            if(emp==null) break;
            if(emp.getName().equals(name)) pay +=emp.payment();
        }
        return pay;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
