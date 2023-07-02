package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class pb8 {


    //8. Napisati funkciju koja vraca zbir svih elemenata iz ArrayListe.
    //8. Write a function that returns the sum of all elements from an ArrayList.

    static int vracaZbir (ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {

            sum += list.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,5,2,9));
        int zbir = vracaZbir(a);
        System.out.println("Zbir je " + zbir);
    }
}
