package adapterex1;

import java.util.ArrayList;

public class Player {

    private ArrayList<Ses> liste;

    public Player() {
        liste = new ArrayList<>();
    }

    public void listeyeEkle(Ses ses) {
        liste.add(ses);
    }

    public void Play() {
        for (Ses m : liste) {
            m.MP3Oynat();
        }
    }
}
