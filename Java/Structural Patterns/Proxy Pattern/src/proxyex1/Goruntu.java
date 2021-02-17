package proxyex1;

public class Goruntu extends Grafik {
    private byte veri[];
    public Goruntu(String p) {
        dosyaYolu = p;
        veri = null;
    }

    @Override
    public void Ciz() {
        if (veri == null) {
            System.out.println("Dosya yükleniyor: " + dosyaYolu);
            veri = new byte[10000];
            System.out.println("Dosya çiziliyor... (" + dosyaYolu +")");
        } else  {
            System.out.println("Dosya çiziliyor... (" + dosyaYolu +")");
        }
    }

    @Override
    public void grafikBilgisi() {

    }
}
