package org.lessons.java;

import java.util.Scanner;

public class FestaFerragnez {
    /*
    * State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post)
    *Nel programma bisogna:
    *creare e inizializzare l’array contenente i nomi degli invitati (trovate un esempio in fondo alla traccia)
    *chiedere all’utente come si chiama
    *verificare che il nome sia presente nella lista lasciarlo entrare o rispedirlo cortesemente da dove è venuto
    *Attenzione: per verificare se due stringhe sono uguali non usare == ma il metodo equals()
    *Bonus se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa
    *Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        boolean inLista = false;

        System.out.println("Chi sei?");
        String nomeUser = scanner.nextLine();


//      Ciclo while
//        int i = 0;
//        while(i < invitati.length){
//            if (nomeUser.equalsIgnoreCase(invitati[i].toLowerCase())){
//                inList = true;
//                break;
//            }
//            i++;
//        }

//       Ciclo for
        for(String nome : invitati){
            if (nomeUser.equalsIgnoreCase(nome.toLowerCase())){
                inLista = true;
                break;
            }
        }
        System.out.println(inLista ? "Buon divertimento!" : "Non puoi entrare!");
        scanner.close();
    }
}