package iteratorex1;

public class Agac extends Aggregate {

    private int deger;
    Agac sol;
    Agac sag;

    public Agac(int deger) {
        this.deger = deger;
        sol = null;
        sag = null;
    }

    public int degeriAl() {
        return deger;
    }
    public void setSol(Agac a) {
        sol = a;
    }
    public void setSag(Agac a) {
        sag = a;
    }

    @Override
    public Iterator createIterator() {
        return new AgacIterator(this);
    }
}
