package kayttis;

import kysymykset.KysymysR;
import kysymykset.KysymystenlukijaR;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Kayttoliittyma {
    private List<KysymysR> kysymykset;


    public Kayttoliittyma() {
//        this.kysymykset = new KysymystenlukijaR();
    }

    public void kaynnista() {
        Scanner lukija = new Scanner(System.in);
        KysymystenlukijaR kb = new KysymystenlukijaR();
        List<KysymysR> kysyttavat = kb.kysymyslista();
        Collections.shuffle(kysyttavat);
        
        kysyttavat.remove(kysyttavat.size() - 1);
        int oikein = 0;
        int vaarin = 0;
        System.out.println("Testaa Suomi-tietoutesi!\n");
        for (KysymysR k : kysyttavat) {
            System.out.println(k.getKysymysteksti());
            List<String> vastaukset = k.getVastausvaihtoehdot();
            for (int i = 0; i < 3; i++) {
                System.out.println(vaihtoehtoKirjaimena(i) + ") " + vastaukset.get(i));
            }
            while (true) {
                System.out.print("Vastaus: ");
                String vastaus = lukija.nextLine();
                if (vastaus.isEmpty()||!(vastaus.equals("a")||vastaus.equals("b")||vastaus.equals("c"))) {
                    System.out.println("Vastauksesi ei ole mikään vaihtoehdoista. Vastaa a, b tai c.");
                    continue;
                }
                if (vastaus.equals(k.oikeaVastausMerkkijonona())) {
                    System.out.println("Oikein!");
                    oikein++;
                    break;
                } else {
                    System.out.println("Ei mennyt oikein.");
                    vaarin++;
                    break;
                }
            }
            System.out.println("Oikeita vastauksia " + oikein + ", vääriä vastauksia " + vaarin + ".\n");
        }
    }

    public String vaihtoehtoKirjaimena(int numero) {
        return "" + (char) (numero + 97);
    }
}
