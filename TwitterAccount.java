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

    public static void main(String[] args) {
        TwitterAccount myAccount = new TwitterAccount("2134", "gabet@gmail.com");
        myAccount.addHashtag("#yup");
        myAccount.addHashtag("#cool");
        myAccount.addHashtag("#sweet");
        myAccount.addHashtag("#nice");
        myAccount.addHashtag("#good");

        if(myAccount.checkHashtag("#cool") == true) {
            System.out.println("#cool is on the hastags ArrayList");
        } else {
            System.out.println("This hashtag is not on the ArrayList");
        }

        System.out.println();

        if(myAccount.checkHashtag("#where") == true) {
            System.out.println("#cool is on the hastags ArrayList");
        } else {
            System.out.println("#where is not on the ArrayList");
        }
    }
}