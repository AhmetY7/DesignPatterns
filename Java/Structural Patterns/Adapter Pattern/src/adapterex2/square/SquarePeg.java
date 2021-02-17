package adapterex2.square;

/*
The Service is some useful class (usually 3rd-party or legacy). The client can’t use this class directly because
it has an incompatible interface.
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
