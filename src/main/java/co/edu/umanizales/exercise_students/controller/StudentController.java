package co.edu.umanizales.exercise_students.controller;

import co.edu.umanizales.exercise_students.model.Student;
import co.edu.umanizales.exercise_students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public ArrayList<Student> getStudents(){
        return studentService.getStudents();

    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.getStudents().add(student);
        return "Estudiante adicionado exitosamente";
    }
}
