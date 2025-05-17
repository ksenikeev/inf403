package ru.itis.inf403.lab2_12.db;

import ru.itis.inf403.lab2_12.model.Student;

import java.io.*;

public class DBUtils {
    public static final String TABLE = "db/student.tbl";

    public static void appendObject(Student student) {
        // сериализация student
        byte[] studentData = null;

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(student);
            studentData = bos.toByteArray();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file = new File(TABLE);

        try (DataOutputStream dos =
                new DataOutputStream(new FileOutputStream(file, true))) {
            dos.writeInt(student.getId());
            dos.writeByte(1);
            dos.writeInt(studentData.length);
            dos.write(studentData);
            dos.flush();
        } catch (IOException e) {
            throw new RuntimeException("Не удалось записать данные");
        }
    }
}
