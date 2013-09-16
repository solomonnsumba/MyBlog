import org.junit.Test;
import repositry.PostRepository;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class PostRepositoryTest {

    @Test
    public void  can_fetch_post(){

        PostRepository postRepository = new PostRepository();
        int postId = postRepository.fetchPost(1);

        assertThat(postId,is(1));

    }
    @Test
    public void canCreatePost(){

        PostRepository postContent = new PostRepository();
        String content = postContent.createPost("Solomon");
        assertThat(content,is("Solomon"));



    }
}
