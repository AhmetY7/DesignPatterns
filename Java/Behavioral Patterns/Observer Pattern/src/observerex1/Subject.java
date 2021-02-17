package observerex1;

public interface Subject {
    void Attach(Observer observer);
    void Detach(Observer observer);
    void Notify();
}
