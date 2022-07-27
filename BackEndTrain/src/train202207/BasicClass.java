package train202207;

import java.util.*;
public class BasicClass {

    public static void main(String[] args) {
        String alpha = "asqrq212125n23o";

        char[] ch =alpha.toCharArray();
        int digitSUm = 0;
        char[] reCH = new char[alpha.length()];

        for (int i = 0; i < alpha.length(); i++) {
            if(Character.isUpperCase(ch[i])) reCH[i] = Character.toLowerCase(ch[i]);
            else if (Character.isLowerCase(ch[i])) reCH[i] = Character.toUpperCase(ch[i]);
            else if (Character.isDigit(ch[i])) digitSUm+=Character.getNumericValue(ch[i]);
        }

        System.out.println("digitSUm  : " + digitSUm);
        System.out.println("ch.toString()  : " + ch.toString());
        System.out.println("RDch.toString()  : " + reCH.toString());

    }

}
