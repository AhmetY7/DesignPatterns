package decorator_ex1.decorators;

/*
The Base Decorator class has a field for referencing a wrapped object. The field’s type should be declared as the
component interface so it can contain both concrete components and decorators. The base decorator delegates all
operations to the wrapped object.
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
