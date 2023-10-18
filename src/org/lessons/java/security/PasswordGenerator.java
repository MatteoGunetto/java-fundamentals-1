package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digita il tuo nome");
        String nome = scanner.nextLine();
        System.out.println("digita il tuo cognome");
        String cognome = scanner.nextLine();
        System.out.println("digita il tuo colore preferito");
        String colorePreferito = scanner.nextLine();
        System.out.println("digita il tuo giorno di nascita");
        int giornoNascita = scanner.nextInt();
        System.out.println("digita il tuo mese di nascita");
        int meseNascita = scanner.nextInt();
        System.out.println("digita il tuo anno di nascita");
        int annoNascita = scanner.nextInt();

        int totale = giornoNascita + meseNascita + annoNascita;

        System.out.println("La tua password è " + nome + "-" + cognome + "-" + colorePreferito + "-" + totale);
        scanner.close();
    }
}