import java.util.ArrayList;

public class TwitterAccount{
    private ArrayList<String> hashtags;
    private String id;
    private String email;

    public TwitterAccount(String id, String email) {
        this.id = id;
        this.email = email;
        hashtags = new ArrayList<String>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addHashtag(String tag) {
        hashtags.add(tag);
    }

    public boolean checkHashtag(String tag) {
        if(hashtags.contains(tag)) {
            return true;
        } 
        return false;
    }
}