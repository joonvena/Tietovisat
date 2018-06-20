import kayttis.KayttoliittymaR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.println("Mitä pelataan?");
        System.out.println("Kallen peliä, Reijan Peliä vai Joonaksen peliä?");

        while (true) {
            System.out.println("Syötä käsky.");
            String sana = lukija.nextLine();
            if (sana.equals("lopeta tämä hulluus")) {
                System.out.println("Olet vapaa!");
                break;
            }


            if (sana.equals("Kallen peli")) {
                Tekstikayttoliittyma t = new Tekstikayttoliittyma();
                t.kaynnista();
            }

            if (sana.equals("Joonaksen peli")) {
                Kayttoliittyma j = new Kayttoliittyma();
                j.kaynnista();
            }
            if (sana.equals("Reijan peli")) {
                KayttoliittymaR r = new KayttoliittymaR();
                r.kaynnista();
            }
            System.out.println("Peli päättyi. Siirry seuraavan kirjoittamalla pelin nimi. Kirjoittamalla 'lopeta tämä hulluus' lopetat tämän hulluuden");

        }

        }

    }

