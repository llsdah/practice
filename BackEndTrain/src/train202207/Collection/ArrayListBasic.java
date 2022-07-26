package train202207.Collection;

import java.util.*;


public class ArrayListBasic {

    public static void main(String[] args) {
        List<String> grades = new ArrayList<String>();
        grades.add("1");
        grades.add("5");
        grades.add("4");
        grades.add("3");
        grades.add("2");
        grades.add("7");

    }

    public static void precessing(List<String> li){
        int sum =0;
        for (int i = 0; i < li.size(); i++) {
            try{
               sum += Integer.parseInt(li.get(i));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(sum);
    }

}
