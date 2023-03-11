package com.javastart.booking.service;

import com.javastart.booking.entity.Bill;
import com.javastart.booking.entity.Client;
import com.javastart.booking.entity.Hotel;
import com.javastart.booking.entity.Room;

public class BookingService {
    public void book(Hotel hotel, Client client, int numberOfPerson) {

        Room[] rooms = hotel.getRooms();
        boolean isFreeRooms = false;
        for (Room r : rooms) {
            if (r.isFree()) {
                isFreeRooms = true;
            }
        }

        if (!isFreeRooms) {
            System.out.println("Свободных номеров в отеле: " + hotel.getName() + " нет");
        }

        bookRoom(client, numberOfPerson, rooms);
    }
        private void bookRoom(Client client, int numberOfPerson, Room[] rooms) {
        boolean success = false;
            String clientName = client.getName();
            for (Room room : rooms) {
                if (room.getNumberOfPerson() == numberOfPerson) {
                    success = true;
                    System.out.println("Нашёлся номер для пользователя: " + clientName);
                    if(client.getBill().getAmount() >= room.getCost()) {
                        Bill clientBill = client.getBill();
                        clientBill.setAmount(clientBill.getAmount() - room.getCost());
                        room.setFree(false);
                        System.out.println("Номер был успешно забронирован клиентом: " + clientName);
                    } else {
                        System.out.println("Не достаточно средств для бронирования номера климентом: " + clientName);
                    }
                }
            }
            if (!success) {
                System.out.println("Не нашлось подходящего номера для клиента: " + clientName);
            }
        }
    }

