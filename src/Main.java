
import kayttis.Kayttoliittyma;
import kysymykset.Kysymys;
import kysymykset.Kysymystenlukija;

import java.util.ArrayList;
import java.util.List;

//public class Main {
//
//    public static void main(String[] args) {
//        Kysymystenlukija kys = new Kysymystenlukija();
//        List<Kysymys> kysymykset = kys.kysymyslista();
//        Kayttoliittyma kl = new Kayttoliittyma(kysymykset);
//        kl.kaynnista();
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Mitä pelataan?");
		String mitapelataan = lukija.nextLine();
		if(mitapelataan.equals("Kallen peli")) {
        Tekstikayttoliittyma t = new Tekstikayttoliittyma();
        t.kaynnista();
		}
		if(mitapelataan.equals("Joonaksen peli")) {
			//käynnistä Joonaksen peli
		}
		if(mitapelataan.equals("Reijan peli")) {
			
		}

    }
}

