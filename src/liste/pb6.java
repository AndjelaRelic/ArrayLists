package liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class pb6 {

    //6.* Napisati funkciju koja trazi najveci element medju tri ArrayListe.
    //6.* Write a function that searches for the largest element among three ArrayLists.


    static double najveciElement(ArrayList<Double> l1, ArrayList<Double> l2, ArrayList<Double> l3) {

        ArrayList<Double> spojena = new ArrayList<>();
        spojena.addAll(l1);
        spojena.addAll(l2);
        spojena.addAll(l3);

        double najveci = spojena.get(0);

        for (int i = 0; i < spojena.size(); i++) {
            if (spojena.get(i) > najveci) {
                najveci = spojena.get(i);
            }
        }
        return najveci;
    }


    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>(Arrays.asList(1.2, 2.6, 3.2));
        ArrayList<Double> list2 = new ArrayList<>(Arrays.asList(1.5, 9.0, 3.2));
        ArrayList<Double> list3 = new ArrayList<>(Arrays.asList(3.2, 7.4, 1.0, 12.6));

        double max = najveciElement(list, list2, list3);
        System.out.println(max);
    }
}
