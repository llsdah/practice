package train202207;

interface l1 {void mi1();}
interface l2 {void mi2();}
interface l3 extends l1,l2{void mi3();}

class C1{
    public void mc1(){}
}
class C2 extends C1 implements l3{
    public void mi1(){};
    public void mi2(){};
    public void mi3(){};

}

public class Interface_test {

    public static void main(String[] args) {
        l1 i1 = new C2();
        l2 i2 = (l2) i1;
        i2 =(l3) i1;
        C1 c1 =(C1) i1;
        C2 c2 =(C2) i1;

        c2.mi3();
        c2.mc1();

        // c1 = new C2(); 이걸 수정하던지 <- 정확한
        c1 = new C1();
        try{
            // C2 = (C2) c1;
            c1 = (C1) c2; // 여길 수정하던지
        }catch (ClassCastException e){
            e.printStackTrace();
        }

        System.out.println(i1 instanceof  C2);
        System.out.println(c1 instanceof  C2);

        C1[] carr1 = new C2[10];
        C2[] carr2 = (C2[]) carr1;
        System.out.println(carr1 instanceof  C2[]);



    }
}


