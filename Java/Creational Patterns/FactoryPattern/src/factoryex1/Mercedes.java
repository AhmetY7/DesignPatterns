package factoryex1;

public class Mercedes extends Araba{
    public Mercedes() {
        anlikHiz = 260;
        anlikHiz = 0;
    }

    @Override
    public int maksHizAl() {
        return maksHiz;
    }

    @Override
    public String marka() {
        return "Mercedes";
    }

    @Override
    public void hiziBelirle(int s) {
        anlikHiz = s;
    }
}
