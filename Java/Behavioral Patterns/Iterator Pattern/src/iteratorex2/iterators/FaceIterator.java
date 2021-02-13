package iteratorex2.iterators;

import iteratorex2.profile.Profile;
import iteratorex2.social_networks.Face;

import java.util.ArrayList;
import java.util.List;

/*
Concrete Iterators implement specific algorithms for traversing a collection.
The iterator object should track the traversal progress on its own. This allows several iterators to traverse the same collection independently of each other.
 */
public class FaceIterator implements ProfileIterator {
    private Face face;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FaceIterator(Face face, String type, String email) {
        this.face = face;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = face.requestProfileFriendsFromFace(this.email, this.type);
            for(String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
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
        Profile friendProfile = profiles.get(currentPosition);
        if(friendProfile == null) {
            friendProfile = face.requestProfileFromFace(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
