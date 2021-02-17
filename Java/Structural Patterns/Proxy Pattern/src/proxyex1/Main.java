package proxyex1;

public class Main {
    public static void bilgiler(Grafik grafik) {
        grafik.grafikBilgisi();
    }

    public static void ekranaCiz(Grafik grafik) {
        grafik.Ciz();
    }
    public static void main(String[] args) {
        GoruntuVekili goruntuVekili = new GoruntuVekili("resim.jpg");
        bilgiler(goruntuVekili);
        ekranaCiz(goruntuVekili);

        GoruntuVekili goruntuVekili1 = new GoruntuVekili("foto.jpg");
        bilgiler(goruntuVekili1);
        ekranaCiz(goruntuVekili1);
        ekranaCiz(goruntuVekili);
    }
}
