package co.edu.umanizales.exercise_students.services;

import co.edu.umanizales.exercise_students.model.Student;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Data
@Service
public class StudentService {
    // private Student[] students;
    private ArrayList<Student> students;

    @PostConstruct
    public void init() {
        students = new ArrayList<>();

        Student ValentinaV = new Student("1005707865", "Valentina Loaiza", (byte) 1, (byte) 2, 1897000);
        students.add(ValentinaV);


    }

}
