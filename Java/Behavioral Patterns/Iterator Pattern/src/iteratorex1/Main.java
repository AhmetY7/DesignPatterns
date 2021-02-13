package iteratorex1;

public class Main {
    public static void main(String[] args) {
        // Liste örneği için
        Listeleme.Listele(new Dizi());

        // Ağaç örneği için
        Agac agac = new Agac(12);
        Agac sag = new Agac(13);
        Agac sol = new Agac(15);
        Agac sag2 = new Agac(20);
        agac.setSol(sol);
        agac.setSag(sag);
        sag.setSag(sag2);

        Listeleme.Listele(agac);

    }
}
