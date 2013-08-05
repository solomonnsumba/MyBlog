package controller;

import model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: solomon
 * Date: 6/17/13
 * Time: 10:18 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class PostController {

    private Post post;
    PostController(){

        post = new Post("racheal");
    }
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String renderPost(Map<String, Object> model) {
        model.put("myObjPost", post.toString());
        return "post";
    }



        @RequestMapping(value = "/post", method = RequestMethod.GET,
        headers = {"Accept=application/xml"})
                @ResponseBody
        public String xmlPost(){
            return "<?xml version=\"1.0\" encoding = \"utf-8\"?><post><content>"+post+"</content></post>";
        }

    }

