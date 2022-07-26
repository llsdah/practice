package train202207.Collection;

import java.util.*;
import java.util.HashMap;
import java.util.Random;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<String,Student>();

        for (int i = 0; i <10; i++) {
            map.put("1234"+i,new Student("길동"+i, new Random().nextInt(6) ));
        }

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            Student temp = map.get(it.next());
            int grade = temp.getGrade();
            String name = temp.getName();
            System.out.println(name +" :: "+grade);
        }
    }
}

class Student{
    private String name;
    private int grade;
    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    public String getName(){
        return this.name;
    }
    public int getGrade(){
        return this.grade;
    }


}
