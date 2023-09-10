package mk.ukim.finki.kiii.web.rest;


import mk.ukim.finki.kiii.model.Course;
import mk.ukim.finki.kiii.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/api/courses"})
public class CourseControllerRest {
    private final CourseService courseService;

    public CourseControllerRest(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<List<Course>> getCoursesPage() {
        List<Course> courses = courseService.listAll();
        return ResponseEntity.ok(courses);
    }
}
