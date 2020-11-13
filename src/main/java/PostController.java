import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @PostMapping("/posts/{id}/delete")
    public String delete(Model model, @PathVariable long id){
        postsDao.deleteById(id);
        return "redirect:/posts";
    }

    private final UserRepository userDao;
        public PostController(UserRepository userDao) {
            this.userDao = userDao;
        }
}
