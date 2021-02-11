package compositeex2.shapes;

import java.awt.*;
/*
* The Leaf is a basic element of a tree that doesn’t have sub-elements.

Usually, leaf components end up doing most of the real work, since
* they don’t have anyone to delegate the work to.
* */
public class Rectangle extends BaseShape{
    public int height;
    public int width;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
    }
}
