package iteratorex2.social_networks;

import iteratorex2.iterators.ProfileIterator;

/*
The Collection interface declares one or multiple methods for getting iterators compatible with the collection.
Note that the return type of the methods must be declared as the iterator interface so that the concrete collections
can return various kinds of iterators.
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkersIterator(String profileEmail);
}
