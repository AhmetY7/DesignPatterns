package proxyex1;

public class GoruntuVekili extends Grafik {
    private Goruntu goruntu;

    public GoruntuVekili(String goruntu) {
        dosyaYolu = goruntu;
        this.goruntu = new Goruntu(goruntu);
    }
    @Override
    public void Ciz() {
        goruntu.Ciz();
    }

    @Override
    public void grafikBilgisi() {
        System.out.println("Dosya adı: " + dosyaYolu);
    }
}
