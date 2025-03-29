package ru.itis.inf403.lab2_03;

public class Main {
    public static void main(String[] args) throws Exception {

        TransportService transportService = new TransportService("transport.csv");
        List403<Transport> transports = transportService.readAll();
        System.out.println(transports);

        List403<Bus> busList = transportService.readAllBus();

        TransportPrintService transportPrintService =
                new TransportPrintService();
        transportPrintService.printParkNumber(busList);


    }
}
