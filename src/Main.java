
public class Main {
    public static void main(String[] args) {
        String str1 = "Pippo";
        String str2 = "Paperino";
        System.out.println("La stringa \"" + str1 + "\" ha una lunghezza pari? " + Esercizio1.stringaPariDispari(str1));
        System.out.println("La stringa \"" + str2 + "\" ha una lunghezza pari? " + Esercizio1.stringaPariDispari(str2));

        int anno1 = 2020;
        int anno2 = 2021;
        System.out.println("L'anno " + anno1 + " è bisestile? " + Esercizio1.annoBisestile(anno1));
        System.out.println("L'anno " + anno2 + " è bisestile? " + Esercizio1.annoBisestile(anno2));
    }
}
