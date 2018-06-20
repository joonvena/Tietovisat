import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Mitä pelataan?");
		String mitapelataan = lukija.nextLine();
		if(mitapelataan.equals("Kallen peli")) {
        WILDCARD n = new WILDCARD();
        n.kaynnista();
		}
		if(mitapelataan.equals("Joonaksen peli")) {
			WILDCARD n = new WILDCARD();
			n.kaynnista();
		}
		if(mitapelataan.equals("Reijan peli")) {
			WILDCARD n = new WILDCARD();
			n.kaynnista();
		} else {
			WILDCARD n = new WILDCARD();
			n.kaynnista();
		}

    }
}
