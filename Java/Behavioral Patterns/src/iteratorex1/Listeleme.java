package iteratorex1;

public class Listeleme {
    public static void Listele(Aggregate aggregate) {
        Iterator i = aggregate.createIterator();
        for(i.First();!i.IsDone(); i.Next()) {
            System.out.println(i.CurrentItem());
        }
    }
}
