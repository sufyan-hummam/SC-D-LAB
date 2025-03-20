package scd.lab09.controller;

import scd.lab09.entity.Course;
import scd.lab09.entity.Professor;
import scd.lab09.repository.CourseRepository;
import scd.lab09.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }

    @GetMapping
    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    @GetMapping("/{id}/courses")
    public List<Course> getCoursesByProfessor(@PathVariable Long id) {
        return courseRepository.findByProfessorId(id);
    }
}
