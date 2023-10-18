package org.lessons.java.security;

import java.util.Scanner;

public class PassworldGeneratorAlternative  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome:");
        String nome = scanner.nextLine();

        System.out.println("Inserisci il tuo cognome:");
        String cognome = scanner.nextLine();

        System.out.println("Inserisci il tuo colore preferito:");
        String colorePreferito = scanner.nextLine();

        System.out.println("Inserisci la data di nascita nel formato dd/mm/yyyy:");
        String dataNascitaInput = scanner.nextLine();

        // Dividi la data di nascita in giorno, mese e anno
        String[] partiData = dataNascitaInput.split("/");
        if (partiData.length != 3) {
            System.out.println("Formato data non valido. Inserisci la data nel formato dd/mm/yyyy.");
            return; // Esce dal programma se il formato è errato
        }

        int giornoNascita = Integer.parseInt(partiData[0]);
        int meseNascita = Integer.parseInt(partiData[1]);
        int annoNascita = Integer.parseInt(partiData[2]);

        // Calcola la somma del giorno, mese e anno di nascita
        int sommaDataNascita = giornoNascita + meseNascita + annoNascita;

        // Genera la password concatenando le informazioni fornite
        String password = nome + "/" + cognome + "/" + colorePreferito + "/" + sommaDataNascita;


        System.out.println("La tua password è: " + password);

        scanner.close();
    }
}