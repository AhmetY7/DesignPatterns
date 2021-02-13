package factoryex1;

public class MercedesFactory extends ArabaFactory{
    @Override
    public Araba ArabaUret() {
        return new Mercedes();
    }
}
