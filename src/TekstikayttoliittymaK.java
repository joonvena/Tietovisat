import java.util.List;
import java.util.Scanner;
import java.io.*;
import javax.sound.sampled.*;

public class Tekstikayttoliittyma {
    private Kysymystenlukija kysymykset;

    public Tekstikayttoliittyma() {
        this.kysymykset = new Kysymystenlukija();
    }

    public void kaynnista() {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Tervetuloa peliin! Kysymme 10 kysymystä ja näihin voi sitten kai vastata. 'Ei jags' lopettaa. Vastaa 'Ok' jatkaaksesi");
        String komento = lukija.nextLine();
        System.out.println("Peli alkaa, ensimmäinen kysymys:");
        Kysymystenlukija k = new Kysymystenlukija();
        List kysymykset = k.luekysymykset();
        Kysymys testi = (Kysymys) kysymykset.get(2);
        int oikeat = 0;

        while (true) {
            if (komento.equals("Ei jags")) {
                break;
            }
            for (int i = 0; i < 10; i++) {
                Kysymys t = (Kysymys) kysymykset.get(i);
                System.out.println(t.getKysymys());
                String lukijanvastaus = lukija.nextLine();
                if (lukijanvastaus.equals("Ei jags")) {
                    break;
                }
                if (lukijanvastaus.equals(t.getVastaus())) {
                    oikeat++;
                    System.out.println("Oikein!");
                    this.playSound();
                } else {
                    System.out.println("Väärin meni!");
					this.playSoundIncorrect();
                }

            }
            break;
        }
        System.out.println("Peli päättyi! Pisteitä: " + oikeat + "/10");
        if (oikeat == 10) {
            System.out.println("Olet nero!");
        }
        if (oikeat == 0) {
            System.out.println("Et ole nero!");
        }
    }

    public void playSound() {

        try {
            File yourFile = new File("Oikein.wav");
            AudioInputStream stream;
            AudioFormat format;
            DataLine.Info info;
            Clip clip;

            stream = AudioSystem.getAudioInputStream(yourFile);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
        } catch (Exception e) {
            //whatevers
        }
    }
	
	
	public void playSoundIncorrect() {

        try {
            File yourFile = new File("Väärin.wav");
            AudioInputStream stream;
            AudioFormat format;
            DataLine.Info info;
            Clip clip;

            stream = AudioSystem.getAudioInputStream(yourFile);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
        } catch (Exception e) {
            //whatevers
        }
    }
}
