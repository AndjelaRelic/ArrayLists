package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class pb1 {


    //1. Napisati fukciju koja prima ArrayListu integera i ispisuje sve njene elemente.
    //1. Write a function that receives an ArrayList of integers and prints all its elements.
    static void ispisujeElemente (ArrayList<Integer> brojevi){

        System.out.println(brojevi);

    }
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,4,2,3,4,5));
        ispisujeElemente(a);

    }
}
