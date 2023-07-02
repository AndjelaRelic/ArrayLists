package liste;

import java.util.*;

public class pb5 {


    static double drugiNajmanjiElement(ArrayList<Double> lista) {

        // Sortiranje liste prema rastucem redosledu
        // Sort the list in ascending order
        Collections.sort(lista);

        // Drugi element nakon sortiranja je drugi najmanji element
        // The second element after sorting is the second smallest element
        return lista.get(1);
    }

    public static void main(String[] args) {

        ArrayList<Double> br = new ArrayList<>(Arrays.asList(1.2, 3.4, 5.6, 2.1));
        double a = drugiNajmanjiElement(br);
        System.out.println(a);
    }
}
