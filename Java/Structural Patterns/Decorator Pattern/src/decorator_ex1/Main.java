package decorator_ex1;

/*
Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects
inside special wrapper objects that contain the behaviors.
 */

/*
Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without breaking
the code that uses these objects.
 */

/*
Use the pattern when it’s awkward or not possible to extend an object’s behavior using inheritance.
 */

import decorator_ex1.decorators.*;

public class Main {

    /*
    The Client can wrap components in multiple layers of decorators, as long as it works with all objects via the
    component interface.
     */
    public static void main(String[] args) {
        String salaryRecords = "Name, Salary\nJohn Smith, 100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");
        System.out.println("- Input ------------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded -----------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded ------------------");
        System.out.println(encoded.readData());
    }
}
