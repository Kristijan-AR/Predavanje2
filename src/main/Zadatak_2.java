package main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak_2 {

public static void main(String[] arsg) throws IOException {

    Scanner scanner = new Scanner(System.in);
    double  unosKilometara;

    while (true) {
        System.out.println("Unesite broj kilometara: ");
        unosKilometara = scanner.nextDouble();
        if (unosKilometara > 0) { ;            break;
        } else {
            System.out.println("Unesite pozitivan broj!");
        }
    }


    double unosKonFaktor;

    while (true) {
        System.out.println("Unesite konverzijski faktor: ");
        unosKonFaktor = scanner.nextDouble();
        if (unosKonFaktor > 0) { ;           ;
            break;
        } else {
            System.out.println("Unesite pozitivan broj!");
        }
    }

    File file = new File("konverzijski_faktor.txt");

    FileWriter writer = new FileWriter(file);

    writer.write("konverzijskiFaktor = 1,6");

    writer.close();

    FileReader reader = new FileReader(file);
    char [] buffer = new char[24];
    reader.read(buffer);
    reader.close();

    String contents = new String(buffer);

    String konFaktTxt = contents.substring(21,24);

    double konFakBroj = Double.parseDouble(konFaktTxt. replace(',', '.'));

    double rezultat = unosKilometara/konFakBroj;

    int rezMiljeTrue = (int)rezultat;

    if (konFakBroj==unosKonFaktor) { ;
    } else {
      System.out.println("Niste upisali ispravan konverzijski broj za milje! Ispravan broj je 1,6 i " +
              "izračun ćemo napraviti koristeći taj podatak!");
    }


    System.out.println("Iz datoteke: " + contents);

    System.out.println("Uneseno je: " + unosKilometara + " kilometara, što je " + rezMiljeTrue + " milja.");



    }
}
