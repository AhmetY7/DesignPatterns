package decorator_ex1.decorators;

import java.util.Base64;
/*
Concrete Decorators define extra behaviors that can be added to components dynamically. Concrete decorators
override methods of the base decorator and execute their behavior either before or after calling the parent method.
 */
public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i=0; i<result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i=0; i<result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
