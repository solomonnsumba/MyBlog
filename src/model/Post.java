package model;

/**
 * Created with IntelliJ IDEA.
 * User: solomon
 * Date: 6/17/13
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Post {
    private final String content;
    public Post(String content) {
        //To change body of created methods use File | Settings | File Templates.
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}


