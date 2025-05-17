package ru.itis.inf403.lab2_12;

import ru.itis.inf403.lab2_12.db.DBUtils;
import ru.itis.inf403.lab2_12.model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Юлиан");
        student.setLastName("Семенов");
        student.setFatherName("Цезаревич");
        student.setGroup("11-403");
        student.setId(45);

        DBUtils.editStudent(student);

        DBUtils.readAll().forEach(s -> {
            System.out.println(s.getId() + " " + s.getName());
        });

        //DBUtils.appendObject(student);
    }
}
