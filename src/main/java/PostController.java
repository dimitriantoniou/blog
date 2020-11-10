import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String postsIndex(){
        return "This takes you to the posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsId(@PathVariable String id){
        return"this is an individual post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewCreatePosts(){
        return "this is the form where you create a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPosts(){
        return "this is how you create a new post";
    }
}
