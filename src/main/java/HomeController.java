import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
 //This class should have one method with a GetMapping for /.
    // It should return a string that says "This is the landing page!".
    @GetMapping("/")
     public String welcome(){
        return "This is the landing page!";
    }
}
