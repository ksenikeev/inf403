package ru.itis.inf403.lab2_15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Текст перевести в ByteArrayInputStream,
 * скопировать побайтно в ByteArrayOutputStream,
 * записать в файл. Написать тест
 * процедуры копирования.
 */
public class Main3 {
    public static  ByteArrayOutputStream copy(ByteArrayInputStream bais) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int r;
        while((r = bais.read()) != -1) {
            baos.write(r);
        }
        return baos;
    }

}
