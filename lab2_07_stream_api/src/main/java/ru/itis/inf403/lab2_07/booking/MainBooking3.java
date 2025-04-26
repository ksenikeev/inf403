package ru.itis.inf403.lab2_07.booking;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MainBooking3 {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Bookings bookings =
                mapper.readValue(new File("bookings.json"), Bookings.class);

        uniquePeoples(bookings);

        Collection collection;


        Function<String, Integer> funcLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        funcLength = s -> s.length();
    }

    public static void uniquePeoples(Bookings bookings) {

        long totalCount = bookings.getBookings().stream().count();

        long peopleCount = bookings.getBookings().stream().map(booking -> booking.getPerson()).distinct().count();

        System.out.println(((double)peopleCount)/totalCount);
    }

}
