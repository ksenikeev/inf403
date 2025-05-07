package ru.itis.inf403.lab2_08.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
/**
 * Общение в рамках договоренности о формате сообщейний (протокол)
 * |длина сообщения (4 байта)|сообщение заявленной длины|
 */
public class ServerMessenger {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(50000);
            // Ожидаем подключения клиента
            Socket clientSocket = serverSocket.accept();
            // Дождались клиента
            // Поток для чтения данных от клиента
            DataInputStream is = new DataInputStream(clientSocket.getInputStream());
            // Поток для передачи данных клиенту
            DataOutputStream os = new DataOutputStream(clientSocket.getOutputStream());
            while (true) {


                // Читаем пакет от клиента
                int size = is.readInt(); // размер сообщения
                byte[] buffer = new byte[size]; // готовим буфер нужного размера
                is.read(buffer); // читаем сообщение
                String message = new String(buffer);
                System.out.println(message);

                if(message.equals("exit")) {
                    break;
                }


                Scanner scanner = new Scanner(System.in);

                message = scanner.nextLine();
                // измеряем кол-во байт в сообщении
                size = message.getBytes().length;

                os.writeInt(size); // заголовок пакета
                os.write(message.getBytes()); // тело пакета
                os.flush();
                if(message.equals("exit")) {
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
