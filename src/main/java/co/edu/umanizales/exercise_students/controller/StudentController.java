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

    @GetMapping("/get_percentage_male")
    public String getPercentageOfStudentsMale(){
        ArrayList<Student> students = studentService.getStudents();
        float percentage = 0;
        float cantMale= 0;

        for(int i = 0; i< students.size(); i++){
            if(students.get(i).getGender()== 2){
                cantMale+=1;

                percentage= ((cantMale / students.size()) *100);
            }

        }

        return  "El porcentaje de Hombres en la universidad es de: "+percentage+ " %";
    }

    @GetMapping("/get_percentage_female")
    public String getPercentageOfStudentsFemale(){
        ArrayList<Student> students = studentService.getStudents();
        float percentage = 0;
        float cantMale= 0;

        for(int i = 0; i< students.size(); i++){
            if(students.get(i).getGender()== 1){
                cantMale+=1;

                percentage= ((cantMale / students.size()) *100);
            }

        }

        return  "El porcentaje de mujeres en la universidad es de: "+percentage+ " %";
    }

    @GetMapping("/get_percentage_male_work")
    public String getPercentageMaleWorking(){
        ArrayList<Student> students = studentService.getStudents();
        float percentageMaleWork = 0;
        double SalaryMale = 0;
        float cantMaleWork= 0;
        double cantSalaryWork = 0;

        for(int i = 0; i< students.size(); i++){
            if(students.get(i).getWork()== 1 && students.get(i).getGender()== 1){
                cantMaleWork+=1;
                cantSalaryWork+= students.get(i).getSalary();

                percentageMaleWork= ((cantMaleWork / students.size()) *100);
                SalaryMale=((cantSalaryWork/cantMaleWork));
            }

        }

        return  "El porcentaje de hombres que trabajan es de: "+percentageMaleWork+ " %" +

                " y su salario promedio es de "+SalaryMale+ " $";
    }

    @GetMapping("/get_percentage_female_work")
    public String getPercentageFemaleWorking(){
        ArrayList<Student> students = studentService.getStudents();
        float percentageFemaleWork = 0;
        double SalaryFemale = 0;
        float cantFemaleWork= 0;
        double cantSalaryWork = 0;

        for(int i = 0; i< students.size(); i++){
            if(students.get(i).getWork()== 1 && students.get(i).getGender()== 2){
                cantFemaleWork+=1;
                cantSalaryWork+= students.get(i).getSalary();

                percentageFemaleWork= ((cantFemaleWork / students.size()) *100);
                SalaryFemale=((cantSalaryWork/cantFemaleWork));
            }

        }

        return  "El porcentaje de hombres que trabajan es de: "+percentageFemaleWork+ " %" +

                " y su salario promedio es de "+SalaryFemale+ " $";
    }
}
