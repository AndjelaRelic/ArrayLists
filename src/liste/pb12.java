package liste;

import java.util.ArrayList;
import java.util.Arrays;

public class pb12 {

//    12. Napisati funkciju koja vraca najduzi String iz ArrayListe Stringova.

    //ovo ce vratiti prvu najduzu rec, ako ih imamo vise sa istim brojem slova

    //    12. Write a function that returns the longest String from an ArrayList of Strings.
    //this will return the first longest word, if we have more than one with the same number of letters
    static String vracaNajduzu(ArrayList<String> reci) {

        String najduzi = reci.get(0);

        for (int i = 0; i < reci.size(); i++) {
            if (reci.get(i).length() > najduzi.length()) {
                najduzi = reci.get(i);
            }
        }
        return najduzi;

    }

    //Ako moramo da vratimo sve najduze reci, moze ovako (mora lista, String moze samo ako vracamo dve najduze reci
    //jer posle druge dodate (tipa Andjela trenira), nece da doda i trecu iste duzine (crosfit)
    //jer crosfit nije duze od Andjela trenira zajedno, a on te dve reci gleda kao duzinu jednog Stringa


    static ArrayList<String> vracaNajduzeReci(ArrayList<String> reci) {
        ArrayList<String> najduzeReci = new ArrayList<>();
        int najduzaDuzina = 0;

        for (String rec : reci) {
            int duzina = rec.length();

            if (duzina > najduzaDuzina) {
                najduzeReci.clear(); // Brisem prethodne najduze reci
                najduzeReci.add(rec); // Dodajem trenutnu najduzu rec
                najduzaDuzina = duzina;
            } else if (duzina == najduzaDuzina) {   //Ako je duzina = vec najduzoj duzini
                najduzeReci.add(rec); // Dodajem jos jednu rec iste duzine
            }
        }
        return najduzeReci;
    }


    public static void main(String[] args) {

        ArrayList<String> slagalica = new ArrayList<>(Arrays.asList("Andjela", "voli", "da", "trenira", "crosfit"));
        String najduzaRec = vracaNajduzu(slagalica);
        System.out.println(najduzaRec);
        ArrayList<String> najduzeReciLista = vracaNajduzeReci(slagalica);
        System.out.println(najduzeReciLista);
    }
}
