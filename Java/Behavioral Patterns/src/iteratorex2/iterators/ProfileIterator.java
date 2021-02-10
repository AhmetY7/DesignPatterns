package iteratorex2.iterators;

import iteratorex2.profile.Profile;

/*
The Iterator interface declares the operations required for traversing a collection:
fetching the next element, retrieving the current position, restarting iteration, etc.
 */
public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
