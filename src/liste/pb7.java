package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class pb7 {

    //7. Napisati funkciju koja prima dve ArrayListe i vraca listu dobijenu nadovezivanjem druge liste na prvu.
    //7. Write a function that receives two ArrayLists and returns the list obtained by appending the second list to the first.

    static ArrayList<Integer> spojena (ArrayList<Integer> s1, ArrayList<Integer> s2){

        ArrayList<Integer> spojena= new ArrayList<>();
        spojena.addAll(s1);
        spojena.addAll(s2);

        return spojena;
    }
    public static void main(String[] args) {

        ArrayList<Integer> sp = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> spp = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        ArrayList<Integer> spojenaaa = spojena(sp, spp);
        System.out.println(spojenaaa);
    }
}
