package ru.itis.inf403.lab12.transport;

import ru.itis.inf403.lab12.City;
import ru.itis.inf403.lab12.Passenger;
import ru.itis.inf403.lab12.TransportAction;

public class Train implements TransportAction {

    private String category;

    public void move(City cityFrom, City cityTo, Passenger passenger) {
        System.out.println(passenger + " moved by Train from "
                + cityFrom + " to " + cityTo);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
