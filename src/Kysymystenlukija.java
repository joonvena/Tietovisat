import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kysymystenlukija {
    private List kysymyslista;

    public Kysymystenlukija() {
        this.kysymyslista = this.luekysymykset();
    }


    public List luekysymykset() {
        String tulos = null;
        List <KalleKysymys> kysymyset = new ArrayList<>();
        List <String> kyssarit = new ArrayList<>();
        List <String> vastaukset = new ArrayList<>();
        try (FileReader fr = new FileReader("Kysymykset.txt"); BufferedReader in = new BufferedReader(fr)) {
            StringBuilder teksti = new StringBuilder();
            String rivi;
            while ((rivi = in.readLine()) != null) {
                teksti.append(rivi).append("\n");
            }
            tulos = teksti.toString();
            String[] juttu = tulos.split("\n");
            for (int i = 0; i < juttu.length; i++) {
                if (i % 2 != 0) {
                    vastaukset.add(juttu[i]);
                } else {
                    kyssarit.add(juttu[i]);
                }
            }
            for (int x = 0; x < kyssarit.size(); x++) {
                kysymyset.add(new KalleKysymys(kyssarit.get(x), vastaukset.get(x)));
            }
            Collections.shuffle(kysymyset);
            return kysymyset;



        } catch (FileNotFoundException ex) {
            System.out.println("Virhe: tiedostoa ei löytynyt");
        } catch (IOException ex) {
            System.out.println("Virhe: muu virhe lukiessa");
        }
        return kysymyset;
    }
}