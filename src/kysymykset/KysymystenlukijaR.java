package kysymykset;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KysymystenlukijaR {
    private List kysymykset;
    
    public KysymystenlukijaR() {
        this.kysymykset = this.kysymyslista();
    }

    public List kysymyslista() {
        ArrayList<KysymysR> kysymys1 = new ArrayList<>();
        try (Scanner tiedostonLukija = new Scanner(new File("kysymyksetR.txt"))) {
            while (tiedostonLukija.hasNextLine()) {
                String kysymys = tiedostonLukija.nextLine();
                List<String> vastausvaihtoehdot = new ArrayList<>();

                for (int i = 0; i < 3; i++) {
                    vastausvaihtoehdot.add(tiedostonLukija.nextLine());
                }
                int vastaus = Integer.parseInt(tiedostonLukija.nextLine());
                KysymysR k = new KysymysR(kysymys, vastausvaihtoehdot, vastaus);
                kysymys1.add(k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Virhe: " + e.getMessage());
        }
        return kysymys1;
    }
}

