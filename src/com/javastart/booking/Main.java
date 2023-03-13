package com.javastart.booking;

import com.javastart.booking.entity.Bill;
import com.javastart.booking.entity.Client;
import com.javastart.booking.entity.Hotel;
import com.javastart.booking.entity.Room;
import com.javastart.booking.service.BookingService;

public class Main {

    public static void main(String[] args) {
        Bill loriBill = new Bill(10000);
        Client loriClient = new Client("Lori", "Cat", "+123456789", "lori@cat.com", loriBill);

        Bill baxBill = new Bill(2000);
        Client baxClient = new Client("Bax", "Cat", "+12345432", "bax@cat.com", baxBill);

        Room[] californiaHotelRooms = new Room[]{new Room(1, 1500, true), new Room(3, 3500, true), new Room(2, 2500, true)};

        Hotel californiaHotel = new Hotel("California", californiaHotelRooms);

        Room[] sanFranciscoHotelRooms = new Room[]{new Room(2, 2800, true), new Room(3, 14000, true), new Room(1, 2000, true)};
        Hotel sanFranciscoHotel = new Hotel("SanFrancisco", sanFranciscoHotelRooms);
        System.out.println("\n");

        BookingService bookingService = new BookingService();

        bookingService.book(californiaHotel, loriClient, 4);
        bookingService.book(sanFranciscoHotel, baxClient, 2);
    }
}