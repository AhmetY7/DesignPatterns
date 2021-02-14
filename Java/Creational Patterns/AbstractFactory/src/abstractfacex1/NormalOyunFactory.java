package abstractfacex1;

public class NormalOyunFactory extends OyunFactory{
    @Override
    public SoyutOyun yeniOyun() {
        return new NormalOyun();
    }

    @Override
    public SoyutKapi kapiOlustur() {
        return new NormalKapi();
    }

    @Override
    public SoyutOda odaOlustur() {
        return new NormalOda();
    }
}
