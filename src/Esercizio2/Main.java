package Esercizio2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Inserisci un numero: ");
    int num = input.nextInt();

    switch (num) {
      case 0:
      case 1:
      case 2:
      case 3:
        System.out.println("Il numero inserito in lettere è: " + convertiInLettere(num));
        break;
      default:
        System.out.println("Errore: il numero inserito non è compreso tra 0 e 3.");
        break;
    }

    input.close();
  }

  public static String convertiInLettere(int num) {
    switch (num) {
      case 0:
        return "zero";
      case 1:
        return "uno";
      case 2:
        return "due";
      case 3:
        return "tre";
      default:
        return "";
    }
  }
  
}

