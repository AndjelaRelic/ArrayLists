package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class pb9 {


    //9. Napisati funkciju koja vraca proizvod svih elemenata uvecanih za 3 iz ArrayListe.
    //9. Write a function that returns the product of all elements increased by 3 from an ArrayList.

    static int proizvodUvecanih(ArrayList<Integer> list) {
        int proizvod = 1;
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 3);  //povecavam prvo svaki za 3
            proizvod *= list.get(i);   //tek onda ih dodajem u proizvod
        }
        return proizvod;
    }

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(3, 3));
        int p = proizvodUvecanih(l);
        System.out.println(p);
    }
}
