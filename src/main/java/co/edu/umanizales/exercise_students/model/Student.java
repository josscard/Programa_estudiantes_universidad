package co.edu.umanizales.exercise_students.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Student {

    private String identificacion;
    private String name;
    private byte gender;
    private byte work;
    private double salary;




}
