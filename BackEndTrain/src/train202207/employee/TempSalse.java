package train202207.employee;

// 상속 받기 판매직 임시직
public class TempSalse extends Employee {
    private long date;
    private long salse_point;

    public TempSalse(){

    }

    public TempSalse(String name, long date,long salse_point){
        super(name);
        this.salse_point =salse_point;
        this.date = date;


    }

    @Override // 부모 클래스 재정의
    public long payment() {
        return salse_point*date;
    }

    public long getSalse_point() {
        return salse_point;
    }

    public void setSalse_point(long salse_point) {
        this.salse_point = salse_point;
    }
}

// 연봉직 정규직
class annualEmployee extends Employee{
    private long annual;

    public annualEmployee(){

    }

    public annualEmployee(String name, long annual){
        super(name);
        this.annual =annual;
    }

    @Override
    public long payment() {
        return this.annual;
    }

}
// 판매직이 받는 수수료
class Commition{
    public final static double COMMISION =0.03;
}

//판매직
class SalsePer extends annualEmployee{
    private long salse;

    public SalsePer(){

    }

    public SalsePer(String name, long annual, long salse) {
        super(name, annual);
        this.salse = salse;
    }
    public long pacheck(){
        long temp = super.payment()+(long)(salse* Commition.COMMISION);
        return temp;
    }
}



