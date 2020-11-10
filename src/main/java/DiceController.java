import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceController {
    @GetMapping("/roll-dice")
    public String showDice(Model model){
        return "rolled dice";
    }

    @GetMapping("roll-dice/{n}")
    public String diceCheck(@PathVariable int n, Model model){
        int userRoll=n;
        int computerRoll=(int)(Math.random()*6)+1;
        String diceResult="";

        boolean diceMatch=computerRoll==userRoll;
        if(diceMatch){
            diceResult="Nice! You matched the computer's roll.";
        }else{
            diceResult="Sorry, you picked the wrong number.";
        }
        model.addAttribute("diceResult",diceResult);
        return "dice check";
    }
}
