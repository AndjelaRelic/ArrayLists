package liste;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class pb11 {

    //11. Napisati funkciju koja vraca prosecnu vrednost iz ArrayListe.
    //11. Write a function that returns the average value from an ArrayList.

    static double prosecnaVrednost(ArrayList<Double> lista) {
        double sum = 0;
        for (int i = 0; i < lista.size(); i++) {
            sum += lista.get(i);
        }
        return sum / lista.size();
    }

    public static void main(String[] args) {

        ArrayList<Double> brojevi = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
        double prosek = prosecnaVrednost(brojevi);
        System.out.println("Prosek je: "+ prosek);
    }
}
