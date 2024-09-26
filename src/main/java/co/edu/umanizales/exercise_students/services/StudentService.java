package co.edu.umanizales.exercise_students.services;

import co.edu.umanizales.exercise_students.model.Student;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class StudentService {
    private Student[] students;

    @PostConstruct
    public void init(){
        students = new Student[50];

    }

}
