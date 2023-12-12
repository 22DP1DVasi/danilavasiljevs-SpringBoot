package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")     // lapas adrese (URL)
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }

    @GetMapping(value = "/about")
    String aboutMe(Model model) {
        String name = "Danila";
        String surname = "Vasiljevs";
        int age = 17;
        String group = "DP2-1";
        model.addAttribute("name", name);
        model.addAttribute("surname", surname);
        model.addAttribute("age", age);
        model.addAttribute("group", group);

        return "about";
    }

    
}
