package Esercizio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str;
        do {
            System.out.print("Inserisci una stringa (digita :q per uscire): ");
            str = input.nextLine();
            suddividiStringa(str);
        } while (!str.equals(":q"));

        input.close();
    }

    public static void suddividiStringa(String input) {
        String[] caratteri = input.split("");
        String output = "";

        for (int i = 0; i < caratteri.length; i++) {
            output += caratteri[i];

            if (i != caratteri.length - 1) {
                output += ",";
            }
        }

        System.out.println(output);
        
    }
}

