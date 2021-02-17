package adapterex2.adapters;

import adapterex2.round.RoundPeg;
import adapterex2.square.SquarePeg;

/*
The Adapter is a class that’s able to work with both the client and the service: it implements the client interface,
while wrapping the service object. The adapter receives calls from the client via the adapter interface and translates
them into calls to the wrapped service object in a format it can understand.
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
