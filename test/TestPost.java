import model.Post;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TestPost {

    @Test

    public void should_post_its_contents(){

        Post post = new Post("racheal");
        String content = post.toString();
        assertThat(content, is("racheal"));

    }
}
