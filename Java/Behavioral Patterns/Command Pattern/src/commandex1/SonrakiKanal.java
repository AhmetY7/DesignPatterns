package commandex1;

public class SonrakiKanal implements Command{
    private Televizyon tv;

    public SonrakiKanal(Televizyon tv) {
        this.tv = tv;
    }

    @Override
    public void Execute() {
        tv.birSonrakiKanal();
        System.out.println("Geçerli Kanal: " + tv.gecerliKanal());
    }

    @Override
    public String toString() {
        return "Sonraki Kanal";
    }
}
