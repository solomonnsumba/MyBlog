import model.Post;
import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: solomon
 * Date: 6/17/13
 * Time: 10:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestPost {

    @Test

    public void should_post_its_contents(){

        Post post = new Post("racheal");
        String content = post.toString();
        assertThat(content, is("racheal"));

    }
}
