package iteratorex2.iterators;

import iteratorex2.profile.Profile;
import iteratorex2.social_networks.LinkedIn;

import java.util.ArrayList;
import java.util.List;
/*
Concrete Iterators implement specific algorithms for traversing a collection.
The iterator object should track the traversal progress on its own. This allows several iterators to traverse the same collection independently of each other.
 */
public class LinkedInIterator implements ProfileIterator{
    private LinkedIn linkedIn;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> contacts = new ArrayList<>();

    public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = linkedIn.requestRelatedContactsFromLinkedInAPI(this.email, this.type);
            for(String profile : profiles) {
                this.emails.add(profile);
                this.contacts.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendContect = contacts.get(currentPosition);
        if(friendContect == null) {
            friendContect = linkedIn.requestContactInfoFromLinkedInAPI(friendEmail);
            contacts.set(currentPosition, friendContect);
        }
        currentPosition++;
        return friendContect;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
