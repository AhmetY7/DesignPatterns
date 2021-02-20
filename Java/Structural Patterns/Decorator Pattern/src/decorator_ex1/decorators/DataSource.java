package decorator_ex1.decorators;

/*
The Component declares the common interface for both wrappers and wrapped objects.
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
