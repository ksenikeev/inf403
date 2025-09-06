package ru.itis.inf403.lab2_08.httpserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 */
public class HttpServer {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            // Ожидаем подключения клиента
            Socket clientSocket = serverSocket.accept();
            // Дождались клиента
            // Поток для чтения данных от клиента
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            while (true) {
                // Читаем пакет от клиента
                String message = reader.readLine();
                System.out.println(message);

                if (message.isEmpty()) {
                    OutputStream os = clientSocket.getOutputStream();
                    os.write("HTTP/1.1 200 OK\r\n".getBytes());
                    os.write("Content-Type: text/html;charset=UTF-8\r\n".getBytes());
                    os.write("\r\n".getBytes());
                    os.write("<html><body>Hello!</body></html>".getBytes());
                    os.flush();
                    break;
                }
            }
            clientSocket.close();
            serverSocket.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
