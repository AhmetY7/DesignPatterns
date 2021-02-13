package stateex1;


public class Tanimsiz implements State {
    private Program program;

    public Tanimsiz(Program program) {
        this.program = program;
    }
    @Override
    public void Handle() {
        System.out.println("1) Kayıt Olun");
        System.out.println("2) Kullanıcı Giriniz");
        System.out.println("Yönetici Girisi");

        program.GirisYap();
    }
}
