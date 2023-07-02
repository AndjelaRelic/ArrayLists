package liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortiranjeOdNajveceg {


    static void sortirajOdNajveceg(ArrayList<Integer> lista) {

        Collections.sort(lista, Collections.reverseOrder());

        System.out.println(lista);
    }

    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 7, 9, 2, 33));
        sortirajOdNajveceg(a);
    }
}
