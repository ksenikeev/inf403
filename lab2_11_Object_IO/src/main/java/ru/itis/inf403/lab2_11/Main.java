package ru.itis.inf403.lab2_11;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        animal1.setName("Лиса Алиса");
        animal1.setAge(12);
        animal1.setCategory(AnimalClass.Млекопитающие);
        animal1.setType(AnimalType.Лиса);

        byte[] savedData = null;

        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos)) {

            oos.writeObject(animal1);
            savedData = bos.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }

/*
        for (byte b : savedData) {
            System.out.print(b);
        }
*/
        try (ByteArrayInputStream bis = new ByteArrayInputStream(savedData);
                ObjectInputStream ois = new ObjectInputStream(bis)) {
            Animal animal2 = (Animal) ois.readObject();

            System.out.println(animal2);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }


    }
}
