package abstractfacex1;

import java.util.ArrayList;

public class BuyuluOyun extends SoyutOyun{
    ArrayList<SoyutOda> odalar;

    public BuyuluOyun() {
        odalar = new ArrayList<>();
    }

    @Override
    public void odaEkle(SoyutOda a) {
        odalar.add(a);
    }

    @Override
    public void oyunCalistir() {
        System.out.println("Buyulu oyun calisiyor...");
        if (odalar.size() > 0) {
            if (odalar.get(0).kapiAc()) {
                System.out.println("Kapi acildi!");
            } else {
                System.out.println("Kapi acilmadi!");
            }
        }
    }
}
