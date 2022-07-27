package train202207;

import java.util.*;

public class CompareClass {

    public static void main(String[] args) {
        NE ne1 = new NE(1);
        NE ne2 = new NE(1);
        System.out.println(ne1.equals(ne2)); // 둘다 참조값 비요
        System.out.println(ne1 == ne2); // 둘다 참조값 비요


        E ne3 = new E(1);
        E ne4 = new E(1);
        System.out.println(ne3.equals(ne4)); // 둘다 참조값 비요
        System.out.println(ne3 == ne4); // 둘다 참조값 비요
    }
}


class NE {
    int v;
    public NE(int value){
        this.v= value;
    }
}

class E{
    int v;
    public E(int value){ v=value;}
    public boolean equals(Object obj){
        return (obj != null) && (v==((E) obj).v);
    }
}
