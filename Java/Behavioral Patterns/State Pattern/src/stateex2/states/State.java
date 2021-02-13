package stateex2.states;

import stateex2.ui.Player;

/**
 * The State interface declares the state-specific methods. These methods should make sense for all concrete
 * states because you don’t want some of your states to have useless methods that will never be called.
 */
public abstract class State {
    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
