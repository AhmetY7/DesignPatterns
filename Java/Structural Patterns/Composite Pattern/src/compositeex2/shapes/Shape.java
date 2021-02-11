package compositeex2.shapes;

import java.awt.*;
/*
The Component interface describes operations that are
common to both simple and complex elements of the tree.

 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
