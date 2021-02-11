package compositeex2;

import compositeex2.editor.ImageEditor;
import compositeex2.shapes.Circle;
import compositeex2.shapes.CompoundShape;
import compositeex2.shapes.Dot;
import compositeex2.shapes.Rectangle;

import java.awt.*;

/*
Composite is a structural design pattern that lets you compose objects into tree
structures and then work with these structures as if they were individual objects.
Using the Composite pattern makes sense only when the core model of your app can
be represented as a tree.
 */
/*
The Client works with all elements through the component interface. As a result, the client can work
in the same way with both simple or complex elements of the tree.
 */
public class Main {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),
                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
