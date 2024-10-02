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

        Student student2 = new Student("1005707820", "Andis Andres Cardenas", (byte) 1, (byte) 1, 1825000);
        Student student3 = new Student("1005707822", "Andres Perez", (byte) 1, (byte) 1, 1525000);
        Student student1 = new Student("1005707865", "Valentina Loaiza", (byte) 2, (byte) 2, 1897000);
        students.add(student1);
        students.add(student2);
        students.add(student3);




    }

}
