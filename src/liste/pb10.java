package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class pb10 {
    //10. Napisati funkciju koja vraca sve neparne brojeve iz ArrayListe.
    //10. Write a function that returns all odd numbers from an ArrayList.

    //1. sa for each
    static ArrayList<Integer> vracaNeparne(ArrayList<Integer> list) {

        ArrayList<Integer> neparni = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 1) {
                neparni.add(i);

            }
        }
        return neparni;
    }

    //sa for
    static ArrayList<Integer> vracaNeparneFor(ArrayList<Integer> list) {

        ArrayList<Integer> neparni = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int broj = list.get(i);
            {
                if (broj % 2 == 1) {
                    neparni.add(broj);
                }
            }
        }
        return neparni;


    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 2, 1));
        ArrayList<Integer> n = vracaNeparne(a);
        System.out.println(n);
        ArrayList<Integer> nf = vracaNeparneFor(a);
        System.out.println(nf);
    }
}
