package compositeex2.shapes;

import java.awt.*;

/*
* The Leaf is a basic element of a tree that doesn’t have sub-elements.

Usually, leaf components end up doing most of the real work, since
* they don’t have anyone to delegate the work to.
* */
public class Dot extends BaseShape{
    private final int DOT_SIZE = 3;

    public Dot(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x - 1, y -1, getWidth(), getHeight());
    }
}
