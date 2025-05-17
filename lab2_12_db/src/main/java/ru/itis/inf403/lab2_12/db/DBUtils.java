package ru.itis.inf403.lab2_12.db;

import ru.itis.inf403.lab2_12.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    public static List<Student> readAll() {
        List<Student> result = new ArrayList<>();
        File file = new File(TABLE);
        if (!file.exists()) {
            return null;
        }
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream(file))) {
            while (true) {
                int id = dis.readInt();
                byte flag = dis.readByte();
                int size = dis.readInt();
                byte[] data = new byte[size];
                dis.read(data);
                if (flag == 1) {
                    try (ObjectInputStream ois = new ObjectInputStream(
                            new ByteArrayInputStream(data)
                    )) {
                        Student student = (Student) ois.readObject();
                        result.add(student);
                    }
                }
            }
        } catch (EOFException e) {}
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return result;

    }
}
