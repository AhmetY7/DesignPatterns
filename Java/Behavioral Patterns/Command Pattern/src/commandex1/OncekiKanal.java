package commandex1;

public class OncekiKanal implements Command{
    private Televizyon tv;

    public OncekiKanal(Televizyon tv) {
        this.tv = tv;
    }

    @Override
    public void Execute() {
        tv.birOncekiKanal();
        System.out.println("Geçerli Kanal: " + tv.gecerliKanal());
    }

    @Override
    public String toString() {
        return "Önceki Kanal";
    }
}
