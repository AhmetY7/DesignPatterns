package commandex1;

public class Televizyon {
    private int kanal;
    public Televizyon() {
        kanal = 1;
    }

    public void kanalDegistir(int kanal) {
        this.kanal = kanal;
    }

    public void birSonrakiKanal() {
        kanal++;
    }

    public void birOncekiKanal() {
        kanal--;
    }

    public int gecerliKanal() {
        return kanal;
    }
}
