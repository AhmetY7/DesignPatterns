package observerex1;

public class Main {
    public static void main(String[] args) {
        Veri veri = new Veri();
        PastaGrafik pastaGrafik = new PastaGrafik(veri);
        CubukGrafik cubukGrafik = new CubukGrafik(veri);

        veri.Attach(pastaGrafik);
        veri.Attach(cubukGrafik);

        veri.yeniVeri();
        veri.yeniVeri();

        veri.Detach(cubukGrafik);

        veri.yeniVeri();
    }
}
