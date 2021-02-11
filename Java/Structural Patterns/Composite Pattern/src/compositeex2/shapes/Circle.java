package compositeex2.shapes;

import java.awt.*;
/*
* The Leaf is a basic element of a tree that doesn’t have sub-elements.

Usually, leaf components end up doing most of the real work, since
* they don’t have anyone to delegate the work to.
* */
public class Circle extends BaseShape {
    public int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
}
