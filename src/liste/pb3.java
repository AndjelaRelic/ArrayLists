package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class pb3 {

    //3. Napisati funkciju koja proverava da li su dve double ArrayListe potpuno iste.
    //3. Write a function that checks if two double ArrayLists are exactly the same.

    static boolean daLiSuIste (ArrayList<Double> lista1, ArrayList<Double> lista2){

        if (lista1.size() != lista2.size()){
        return false;}
        for (int i = 0; i < lista1.size(); i++) {
            if(!(lista1.get(i).equals(lista2.get(i)))){
                return false;
            }
        }
        return true;
        }
    public static void main(String[] args) {

        ArrayList<Double> d1 = new ArrayList<>(Arrays.asList(1.3,1.4,1.5));
        ArrayList<Double> d2 = new ArrayList<>(Arrays.asList(1.3,1.4,1.5));
        ArrayList<Double> d3 = new ArrayList<>(Arrays.asList(1.0));

        boolean b1 = daLiSuIste(d1,d2);
        System.out.println(b1);
        boolean b2 = daLiSuIste(d2,d3);
        System.out.println(b2);
    }
}
