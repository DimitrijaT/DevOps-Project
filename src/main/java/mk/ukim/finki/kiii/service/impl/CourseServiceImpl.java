package mk.ukim.finki.kiii.service.impl;

import mk.ukim.finki.kiii.model.Course;
import mk.ukim.finki.kiii.repository.CourseRepository;
import mk.ukim.finki.kiii.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {


    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> listAll() {
        return courseRepository.findAll();
    }
}
