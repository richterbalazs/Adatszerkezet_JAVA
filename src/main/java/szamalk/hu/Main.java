package szamalk.hu;

import szamalk.hu.Modell.Nev;

public class Main {
    public static void main(String[] args) {
        Nev nev = new Nev("#");
        nev.kirajzol();
        System.out.println("Jelek megszámlálása a 2 sorban: " + nev.jelekMegszamlalasaSorban(1));
        System.out.println("Jelek megszámlálása a 2 oszlopban: " + nev.jelekMegszamlalasaOszlopban(1));
        System.out.println("A második oszlop telivan-e: " + nev.oszlopTelivanE(1));
        System.out.println("A második sor telivan-e: " + nev.sorTelivanE(1));
    }
}