package mk.ukim.finki.kiii.web;


import mk.ukim.finki.kiii.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// Index page
@RequestMapping(value = {"/", "/courses"})
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public String getCoursesPage(Model model) {
        model.addAttribute("courses", courseService.listAll());
        return "courses";
    }

}
