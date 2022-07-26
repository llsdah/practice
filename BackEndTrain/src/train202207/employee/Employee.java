package train202207.employee;

// 직원 부분 저장
abstract class Employee {
    private String name;

    public Employee(){

    }
    public Employee(String name) {
        this.name = name;
    }

    // 자식이 반드시 재정희 해야된다.
    public abstract long payment();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
