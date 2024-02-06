package rvt;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import rvt.temp.A;
import rvt.temp.B;
import rvt.temp.C;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")     // lapas adrese (URL)
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }

    // @GetMapping(value = "/about")
    // String aboutMe(Model model) {
    //     String name = "Danila";
    //     String surname = "Vasiljevs";
    //     int age = 17;
    //     String group = "DP2-1";
    //     model.addAttribute("name", name);
    //     model.addAttribute("surname", surname);
    //     model.addAttribute("age", age);
    //     model.addAttribute("group", group);

    //     return "about";
    // }

    // @GetMapping(value = "/about")
    // ModelAndView about(){
    //     ModelAndView modelAndView = new ModelAndView("about");

    //     String name = "Danila";
    //     String surname = "Vasiljevs";
    //     int age = 17;
    //     String group = "DP2-1";
    //     modelAndView.addObject("name", name);
    //     modelAndView.addObject("surname", surname);
    //     modelAndView.addObject("age", age);
    //     modelAndView.addObject("group", group);

    //     return modelAndView;
    // }

    @GetMapping(value = "/about")
    ModelAndView about(

        @RequestParam HashMap<String, String> querStringParams

    ) {
        // HashMap<String, String> car1 = new HashMap<>(); // dictionary

        // car1.put("brand", "Ford");                   // insert key-value pair
        // car1.put("model", "Mustang");

        // car1.get("brand");                            // get value


        // String name = querStringParams.get("name");
        // String age = querStringParams.get("age");

        ModelAndView modelAndView = new ModelAndView("about");
        // modelAndView.addObject("name", name);
        // modelAndView.addObject("age", age);

        // String name = querStringParams.get("name");
        // name = String.format("$@ %s @$", name);      // formatting
        // modelAndView.addObject("name", name);

        String id = querStringParams.get("name");
        String title = querStringParams.get("title");
        String description = querStringParams.get("description");

        // CsvManager manager = new CsvManager(CsvManager.HOBBIES_CSV);
        // manager.addHobbyToCSV(id, title, description);
        // turpināt veidot html formu

        C c = new C();

        c.a();
        c.b();
        c.c();
        System.out.println();

        return modelAndView;
    }

    @GetMapping(value = "/test")
    @ResponseBody()
    public String testAction(){
        String name = "John";
        String name1 = "John1";
        String name2 = "John2";

        return name + "<hr>" + name1 + "<hr>" + name2 + "<hr>";
    }
}

// https://www.baeldung.com/spring-request-param
