package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class pb2 {

    //2. Napisati funkciju koja prima ArrayListu integera i vraca ArrayListu ciji
    // su elementi duplirani u odnosu na proslednjenju ArrayListu.
    //2. Write a function that receives an ArrayList of integers and returns an ArrayList whose
    // elements are duplicated compared to passing to the ArrayList.

    static ArrayList<Integer> vracaDuplirano (ArrayList<Integer> lista){
        for (int i = 0; i < lista.size(); i++){
            lista.set(i, lista.get(i)*2);

        }
        return lista;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(l);
        ArrayList<Integer> duplirano = vracaDuplirano(l);
        System.out.println(duplirano);
    }
}
