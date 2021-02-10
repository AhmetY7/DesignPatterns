package iteratorex2.social_networks;

import iteratorex2.iterators.FaceIterator;
import iteratorex2.iterators.ProfileIterator;
import iteratorex2.profile.Profile;

import java.util.ArrayList;
import java.util.List;

/*
Concrete Collections return new instances of a particular concrete iterator class each time the client requests one.
You might be wondering, where’s the rest of the collection’s code? Don’t worry, it should be in the same class.
It’s just that these details aren’t crucial to the actual pattern, so we’re omitting them.
 */
public class Face implements SocialNetwork{
    private List<Profile> profiles;

    public Face(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public Profile requestProfileFromFace(String profileEmail) {
        simulateNetworkLatency();
        System.out.println("Face: Loading profile'" + profileEmail + "' over the network...");
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromFace(String profileEmail, String contactType) {
        simulateNetworkLatency();
        System.out.println("Face: Loading '" + contactType + "' list of '" + profileEmail + "' over the network..");

        Profile profile = findProfile(profileEmail);
        if(profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findProfile(String profileEmail) {
        for(Profile profile: profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FaceIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FaceIterator(this, "coworkers", profileEmail);
    }
}
