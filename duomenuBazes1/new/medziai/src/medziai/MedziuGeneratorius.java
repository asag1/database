package medziai;

import java.util.Random;

public class MedziuGeneratorius {
    Random random = new Random();

    public Spygliuociai spygliuociuGeneratorius() {
        String[] spygliuotis = {"Egle", "Pušis"};
        String sugneruotasSpigliuotis = spygliuotis[random.nextInt(2)];

        if (sugneruotasSpigliuotis.equals("Eglė")) {
            return new Egle(sugneruotasSpigliuotis, metuGeneratorius(), aukscioGeneratorius(), "trumpi");
        }
        return new Pusis(sugneruotasSpigliuotis, metuGeneratorius(), aukscioGeneratorius(), "ilgi");
    }

    public Lapuociai lapuociuGeneratorius() {
        String[] spygliuotis = {"Ažuolas", "Beržas", "Liepa"};
        String sugneruotasSpigliuotis = spygliuotis[random.nextInt(2)];

        if (sugneruotasSpigliuotis.equals("Ažuolas")) {
            return new Azuolas(sugneruotasSpigliuotis, metuGeneratorius(), aukscioGeneratorius(), "tamsiai žalias", "vingiuotas");
        } else if (sugneruotasSpigliuotis.equals("Beržas"))
            return new Berzas(sugneruotasSpigliuotis, metuGeneratorius(), aukscioGeneratorius(), "šviesiai žalias", "mažas karpytas");
        return new Liepa(sugneruotasSpigliuotis, metuGeneratorius(), aukscioGeneratorius(), "šviesiai žalias", "mažas lygus");
    }

    public int aukscioGeneratorius() {
        return random.nextInt(30) + 1;
    }

    public int metuGeneratorius() {
        return random.nextInt(100) + 1;
    }
}
