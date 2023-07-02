package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class listaNizKomb {


    //3. Napisati funkciju koja prima ArrayListu integera
    // i niz integera i u prosledjenu listu dodaje sve elemente iz prosledjenog niza.
    //3. Write a function that receives an ArrayList of integers
    // and an array of integers and adds all elements from the array to the passed list.

    static void dodajeElemente(ArrayList<Integer> lista, int[] niz) {

        for (int i : niz) {
            lista.add(i);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1,2,3));
        int[] n = {6,7,8};
        dodajeElemente(l,n);
        System.out.println(l);
    }
}
