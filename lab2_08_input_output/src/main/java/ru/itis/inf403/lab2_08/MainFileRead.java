package ru.itis.inf403.lab2_08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainFileRead {
    public static void main(String[] args) {
        try (InputStream fis = new FileInputStream("bookings.json")) {
            int r;
            long start = System.nanoTime();
            while ((r = fis.read()) > -1) {
                //System.out.print((char)r);
            }
            long end = System.nanoTime();
            System.out.println("Считали за " + (end - start));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream fis = new FileInputStream("bookings.json")) {
            byte[] buffer = new byte[1024];
            int r; // кол-во реально считанных байт
            long start = System.nanoTime();
            while ((r = fis.read(buffer)) > -1) {
                System.out.print(new String(buffer,0, r));
            }
            long end = System.nanoTime();
            System.out.println("Считали за " + (end - start));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
