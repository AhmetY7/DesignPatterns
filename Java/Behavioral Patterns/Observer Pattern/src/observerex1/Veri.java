package observerex1;

import java.util.ArrayList;
import java.util.Random;

public class Veri implements Subject {
    private ArrayList<Integer> liste;
    private ArrayList<Observer> gozlemciler;
    private Random rastgele;

    public Veri() {
        rastgele = new Random(System.currentTimeMillis());
        liste = new ArrayList<>();
        liste.add(rastgele.nextInt(100));
        liste.add(rastgele.nextInt(100));
        liste.add(rastgele.nextInt(100));
        gozlemciler = new ArrayList<>();
    }
    @Override
    public void Attach(Observer observer) {
        gozlemciler.add(observer);
    }

    @Override
    public void Detach(Observer observer) {
        gozlemciler.remove(observer);
    }

    @Override
    public void Notify() {
        for (Observer observer : gozlemciler) {
            observer.Update();
        }
    }

    public void yeniVeri() {
        liste.add(rastgele.nextInt(100));
        Notify();
    }

    public ArrayList<Integer> veriAl() {
        return liste;
    }
}
