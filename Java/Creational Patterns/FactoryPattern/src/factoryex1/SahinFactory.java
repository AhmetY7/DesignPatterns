package factoryex1;

public class SahinFactory extends ArabaFactory{

    @Override
    public Araba ArabaUret() {
        return new Sahin();
    }
}
