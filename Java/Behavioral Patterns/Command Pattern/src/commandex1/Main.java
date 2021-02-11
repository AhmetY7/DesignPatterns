package commandex1;

public class Main {

    public static void main(String[] args) {
	    Menu menu = new Menu();
	    LambaAcKapa lambaAcKapa = new LambaAcKapa(new Lamba());
	    Televizyon tv = new Televizyon();
	    OncekiKanal oncekiKanal = new OncekiKanal(tv);
	    SonrakiKanal sonrakiKanal = new SonrakiKanal(tv);

	    menu.komutEkle(lambaAcKapa);
	    menu.komutEkle(oncekiKanal);
	    menu.komutEkle(sonrakiKanal);

	    menu.menu();
    }
}
