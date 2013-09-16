package model;


public class Post {
    private final String content;
    int id;
    public Post(String content) {

        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}


