import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kysymys {
    private String kysymys;
    private String oikeaVastaus;
    private ArrayList<String> vaaratVastaukset;

    public Kysymys(String kysymys, String oikeaVastaus, String vaaraVastaus1, String vaaraVastaus2, String vaaraVastaus3) {
        this.vaaratVastaukset = new ArrayList<>();
        this.kysymys = kysymys;
        this.oikeaVastaus = oikeaVastaus;
        this.vaaratVastaukset.add(vaaraVastaus1);
        this.vaaratVastaukset.add(vaaraVastaus2);
        this.vaaratVastaukset.add(vaaraVastaus3);
    }

    public String getOikeaVastaus(){
        return this.oikeaVastaus;
    }

    public void kysy(){
        List<String> kaikkiVaihtoehdot = new ArrayList<>(vaaratVastaukset);
        kaikkiVaihtoehdot.add(this.oikeaVastaus);
        Collections.shuffle(kaikkiVaihtoehdot);

        System.out.println("Kysymys: " + this.kysymys + "\n"
                + "\t" + kaikkiVaihtoehdot.get(0) + "\n"
                + "\t" + kaikkiVaihtoehdot.get(1) + "\n"
                + "\t" + kaikkiVaihtoehdot.get(2) + "\n"
                + "\t" + kaikkiVaihtoehdot.get(3));

    }
}
