package org.lessons.java;

import java.util.Scanner;

public class BigliettoTreno {
    /*Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere e l’età del passeggero.
    *Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
    *il prezzo del biglietto è definito in base ai km (0.21 € al km) va applicato uno sconto del 20% per i minorenni va applicato uno sconto del 40% per gli over 65.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double prezzoKm = 0.21;
        int minore_18 = 20;
        int maggiore_65 = 40;

        System.out.println("Quanti km vuoi percorrere?");
        int kmDaPercorrere = scanner.nextInt();
        System.out.println("Quanti anni hai?");
        int eta = scanner.nextInt();

        double total = kmDaPercorrere * prezzoKm;

        if(eta < 18){
            total = total * (100 - minore_18) / 100;
        } else if (eta >=65) {
            total = total * (100 - maggiore_65) / 100;
        }

        System.out.println("Il biglietto costa " + total +"€");

        scanner.close();
    }
}