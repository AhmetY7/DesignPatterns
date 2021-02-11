package commandex1;

public class LambaAcKapa implements Command{
    Lamba lamba;

    public LambaAcKapa(Lamba lamba) {
        this.lamba = lamba;
    }

    @Override
    public void Execute() {
        if (lamba.lambaDegeri() == 1) {
            lamba.lambaKapa();
        } else {
            lamba.lambaAc();
        }
    }

    @Override
    public String toString() {
        if (lamba.lambaDegeri() == 1) {
            return "Lambayı Kapa";
        } else {
            return "Lambayı Aç";
        }
    }
}
