package abstractfacex1;

public class BuyuluOyunFactory extends OyunFactory{
    @Override
    public SoyutOyun yeniOyun() {
        return new BuyuluOyun();
    }

    @Override
    public SoyutKapi kapiOlustur() {
        return new BuyuluKapı();
    }

    @Override
    public SoyutOda odaOlustur() {
        return new BuyuluOda();
    }
}
