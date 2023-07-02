package liste;

import java.util.ArrayList;

public class duplirano {

    //1. Napisati funkciju koja prima ArrayListu integera i vraca ArrayListu ciji su elementi duplirani u odnosu na
    // 	proslednjenju ArrayListu.
    //1. Write a function that receives an ArrayList of integers and returns an ArrayList whose elements are duplicated in relation to
    // passing to the ArrayList.
    static ArrayList<Integer> duplirajElemente(ArrayList<Integer> lista){

        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i)*2);
        }
        return lista;
    }
    public static void main(String[] args) {

        ArrayList<Integer> origLista = new ArrayList<>();
        origLista.add(1);
        origLista.add(2);
        origLista.add(12);

        ArrayList<Integer> duplirano = duplirajElemente(origLista);
        System.out.println(duplirano);
    }
}
