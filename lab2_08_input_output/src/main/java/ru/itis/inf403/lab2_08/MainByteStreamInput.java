package ru.itis.inf403.lab2_08;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainByteStreamInput {
    public static void main(String[] args) {

        byte[] bytes = {1,2,3,4,5,6,7,8};
        InputStream is = null;
        try {
            is = new ByteArrayInputStream(bytes);
            int r;
            while ((r = is.read()) > -1) {
                System.out.print(r);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        try (InputStream bis = new ByteArrayInputStream(bytes)) {

            int r;
            while ((r = bis.read()) > -1) {
                System.out.print(r);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
