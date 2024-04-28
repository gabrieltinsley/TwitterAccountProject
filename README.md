# TwitterAccountProject
Write the java class declaration and private instance variables needed to represent a TwitterAccount.
Write a constructor to initialize a TwitterAccount with a specified id and email address. The list of hashtags is initialized to be empty.
Write getters and setters for the id and email instance variables
Write a public method named addHashtag(String tag) that adds the specified tag to the hashtags ArrayList.
Write a public method named checkHashtag(String tag) that returns true if the given tag was ever used by the account, false otherwise. Use the contains(Object o) method from the ArrayList class to do the search.
Add a main method to the bottom of your class. Do the following in your main method.
Use the TwitterAccount constructor to instantiate a new TwitterAccount using a ficticious ID and email address.
Use the addHashTag() method to add several hashtags to the TwitterAccount
Use an if statement with the checkHashtag() method to test both a hashtag that exists in the account and a hashtag that does not.
