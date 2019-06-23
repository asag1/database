
import medziai.*;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MedziuGeneratorius medziuGeneratorius = new MedziuGeneratorius();
        Spygliuociai spygliuociai;
        Lapuociai lapuociai;
//        Azuolas azuolas1 = new Azuolas("ąžuolas", 50, 15, "tamsiai žalias", "vingiuotas");
//        Azuolas azuolas2 = new Azuolas("ąžuolas", 100, 15, "tamsiai žalias", "vingiuotas");
//        Berzas berzas1 = new Berzas("beržas", 15, 12.5, "šviesiai žalias", "mažas karpytas");
//        Berzas berzas2 = new Berzas("beržas", 10, 7, "šviesiai žalias", "mažas karpytas");
//        Liepa liepa1 = new Liepa("liepa", 24, 95, "šviesiai žalias", "mažas lygus");
//        Liepa liepa2 = new Liepa("liepa", 4, 1.5, "šviesiai žalias", "mažas lygus");
//        Egle egle1 = new Egle("egle", 7, 5, "trumpi");
//        Egle egle2 = new Egle("egle", 2, 1, "trumpi");
//        Pusis pusis1 = new Pusis("pusis", 12, 2, "ilgi");
//        Pusis pusis2 = new Pusis("pusis", 20, 8, "ilgi");
//        System.out.println(azuolas1.toString());
//        System.out.println("šio medžio " + azuolas1.kirsti());
//        System.out.println(pusis1.toString());
//        System.out.println("šio medžio " + pusis1.kirsti());

        Spygliuociai naujasSpygliuotis = medziuGeneratorius.spygliuociuGeneratorius();
        System.out.println(naujasSpygliuotis.toString()+ " " + naujasSpygliuotis.kirsti());

        Lapuociai naujasLapuotis = medziuGeneratorius.lapuociuGeneratorius();
        System.out.println(naujasLapuotis.toString()+ " " + naujasLapuotis.kirsti());
    }
}
