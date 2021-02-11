package commandex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Command>  komutlar;
    public Menu() {
        komutlar = new ArrayList<>();
    }

    public void komutEkle(Command c) {
        komutlar.add(c);
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        while (s != -1) {
            for (int i=0; i<komutlar.size(); i++) {
                System.out.println(i + ": " + komutlar.get(i));
            }
            System.out.println("Çıkmak için -1");
            try {
                s = scanner.nextInt();
                komutlar.get(s).Execute();
            } catch (Exception ignored) { }
        }
        scanner.close();
    }
}
