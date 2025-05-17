package ru.itis.inf403.lab2_12;

import ru.itis.inf403.lab2_12.db.DBUtils;
import ru.itis.inf403.lab2_12.model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Artem");
        student.setLastName("Kuzmin");
        student.setFatherName("Ruslanovich");
        student.setGroup("11-403");
        student.setId(14);

        DBUtils.appendObject(student);
    }
}
