package abstractfacex1;

public class Main {
    public static SoyutOyun oyunOlustur(OyunFactory f) {
        SoyutOyun oyun = f.yeniOyun();
        SoyutOda oda1 = f.odaOlustur();
        SoyutOda oda2 = f.odaOlustur();

        SoyutKapi kapi1 = f.kapiOlustur();
        SoyutKapi kapi2 = f.kapiOlustur();

        oda1.kapiEkle(kapi2);
        oda2.kapiEkle(kapi1);

        oyun.odaEkle(oda1);
        oyun.odaEkle(oda2);

        return oyun;
    }
    public static void main(String[] args) {
        SoyutOyun normalOyun = oyunOlustur(new NormalOyunFactory());
        normalOyun.oyunCalistir();

        SoyutOyun buyuluOyun = oyunOlustur(new BuyuluOyunFactory());
        buyuluOyun.oyunCalistir();
    }
}
