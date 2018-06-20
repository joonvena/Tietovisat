
import kayttis.KayttoliittymaR;
import kysymykset.KysymysR;
import kysymykset.KysymystenlukijaR;

import java.util.List;

public class MainR {

    public static void main(String[] args) {
        KysymystenlukijaR kys = new KysymystenlukijaR();
        List<KysymysR> kysymykset = kys.kysymyslista();
        KayttoliittymaR kl = new KayttoliittymaR();
        kl.kaynnista();
    }
}

//import java.util.Scanner;

//public class MainR {
//    public static void main(String[] args) {
//		Scanner lukija = new Scanner(System.in);
//		System.out.println("Mitä pelataan?");
//		String mitapelataan = lukija.nextLine();
//		if(mitapelataan.equals("Kallen peli")) {
//        TekstikayttoliittymaK t = new TekstikayttoliittymaK();
//        t.kaynnista();
//		}
//		if(mitapelataan.equals("Joonaksen peli")) {
//			//käynnistä Joonaksen peli
//		}
//		if(mitapelataan.equals("Reijan peli")) {
//        KayttoliittymaR kl = new KayttoliittymaR();
//        kl.kaynnista();
//		}

//    }
//}

