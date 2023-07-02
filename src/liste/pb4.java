package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class pb4 {

    //4. Napisati funkciju koja vraca najveci, a onda funkciju koja vraca najmanji element iz ArrayListe.
    //4. Write a function that returns the largest, and then a function that returns the smallest element from the ArrayList.

    static int najveci(ArrayList<Integer> lista) {
        int max = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > max) {
                max = lista.get(i);
            }
        }
        return max;
    }

    static int najmanji(ArrayList<Integer> lista) {
        int min = lista.get(0);   //pretpostavljam da je prvi najmanji
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < min) {    //ako je neki veci od prvog
                min = lista.get(i);  //taj postaje max
            }
        }
        return min;
    }

    public static void main(String[] args) {

        ArrayList<Integer> br = new ArrayList<>(Arrays.asList(1, 2, 5, 10, 3, 2, 6));
        int min = najmanji(br);
        System.out.println(min);
        int max = najveci(br);
        System.out.println(max);
    }
}
