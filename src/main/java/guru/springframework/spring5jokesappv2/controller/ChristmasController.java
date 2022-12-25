package guru.springframework.spring5jokesappv2.controller;

import guru.springframework.spring5jokesappv2.services.ChirstmassService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChristmasController {
    private final ChirstmassService chirstmassService;

    public ChristmasController(ChirstmassService chirstmassService) {
        this.chirstmassService = chirstmassService;
    }

    @RequestMapping("/Handhika/Christmas")
    String sayChristmas(Model model){
        model.addAttribute("christmas", chirstmassService.getMessage());
        return "christmas";
    }
}
