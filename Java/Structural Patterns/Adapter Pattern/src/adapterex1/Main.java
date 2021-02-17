package adapterex1;

public class Main {
    public static void main(String[] args) {
        Player p = new Player();
        p.listeyeEkle(new Ses("Kuş"));
        p.listeyeEkle(new Ses("Böcek"));
        p.listeyeEkle(new OGGAdaptoru("Taş, Toprak")); //OGG uzantısı
        p.Play();
    }
}
