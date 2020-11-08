import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @RequestMapping(path="/add/{x}/and/{y}",method= RequestMethod.GET)
    @ResponseBody
    public String addNumbers(@PathVariable int x, @PathVariable int y){
        return "Your numbers added up are " +(x+y);
    }
    @RequestMapping(path="/subtract/{x}/from/{y}",method= RequestMethod.GET)
    @ResponseBody
    public String subtractNumbers(@PathVariable int x, @PathVariable int y){
        return "Your numbers subtracted are " +(y-x);
    }
    @RequestMapping(path="/multiply/{x}/and/{y}",method= RequestMethod.GET)
    @ResponseBody
    public String multiplyNumbers(@PathVariable int x, @PathVariable int y){
        return "Your numbers multiplied are " +(x*y);
    }
    @RequestMapping(path="/divide/{x}/by/{y}",method= RequestMethod.GET)
    @ResponseBody
    public String divideNumbers(@PathVariable int x, @PathVariable int y){
        return "Your numbers divided up are " +(x/y);
    }
}
