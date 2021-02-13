package stateex2;

/**
 * State is a behavioral design pattern that lets an object alter its behavior when its internal state changes.
 * It appears as if the object changed its class.
 */

/**
 * Use the State pattern when you have an object that behaves differently depending on its current state,
 * the number of states is enormous, and the state-specific code changes frequently.
 */

/**
 * Use the pattern when you have a class polluted with massive conditionals that alter how the class
 * behaves according to the current values of the class’s fields.
 */

import stateex2.ui.Player;
import stateex2.ui.UI;

/**
 * Use State when you have a lot of duplicate code across similar states and transitions of a
 * condition-based state machine.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
