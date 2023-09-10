package mk.ukim.finki.kiii.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// Index page
@RequestMapping(value = {"/about"})
public class AboutController {
    @GetMapping()
    public String getAboutPage() {
        return "about";
    }

}
