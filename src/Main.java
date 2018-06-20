import kayttis.Kayttoliittyma;
import kysymykset.Kysymys;
import kysymykset.Kysymystenlukija;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Kysymystenlukija kys = new Kysymystenlukija();
        List<Kysymys> kysymykset = kys.kysymyslista();
        Kayttoliittyma kl = new Kayttoliittyma(kysymykset);
        kl.kaynnista();
    }
}
