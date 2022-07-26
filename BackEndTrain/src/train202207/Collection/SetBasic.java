package train202207.Collection;

import java.util.*;


public class SetBasic {

    public static void main(String[] args) {
        Set<String> grades = new HashSet<String>();
        grades.add("1");
        grades.add("5");
        grades.add("4");
        grades.add("3");
        grades.add("2");
        grades.add("7");

    }

    public static void precessing(Set<String> li){
        int sum =0;
        Iterator<String> it = li.iterator();
        while(it.hasNext()){
            try{
                sum+= Integer.parseInt(it.next());
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        System.out.println(sum);
    }

}
