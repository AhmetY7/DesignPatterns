package singletonex1;

public class Singleton {
    private int deger;
    private Singleton() {
        deger = 12;
    }

    public int degerAl() { return deger; }
    public void degerYaz(int a) {
        deger = a;
    }

    // singleton
    private static Singleton uniqueInstance = null;
    public static Singleton Instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
