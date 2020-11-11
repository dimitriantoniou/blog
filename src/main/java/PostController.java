import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String postsIndex(){
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsId(@PathVariable String id){
        return "posts/show";
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
