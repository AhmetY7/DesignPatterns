package adapterex2;

import adapterex2.adapters.SquarePegAdapter;
import adapterex2.round.RoundHole;
import adapterex2.round.RoundPeg;
import adapterex2.square.SquarePeg;

/*
Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 */
/*
Use the Adapter class when you want to use some existing class, but its interface isn’t compatible with the rest
of your code.
 */
/*
Use the pattern when you want to reuse several existing subclasses that lack some common functionality
that can’t be added to the superclass.
 */
public class Main {
    /*
    The Client is a class that contains the existing business logic of the program.
     */
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
