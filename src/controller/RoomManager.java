package controller;

import model.Room;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoomManager extends HotelManager<Room> {
    private List<Room> rooms = new ArrayList<>();

    @Override
    public List<Room> getAll() {
        return rooms;
    }

    @Override
    public void add(Room item) {
        rooms.add(item);
        System.out.println("Thêm phòng thành công: " + item);
    }


    @Override
    public Room searchById(String id) {
       for (Room room : rooms) {
           if (room.getRoomId().equals(id)) {
               return room;
           }
       }
        System.out.println("Không tìm thấy phòng với ID: " + id);
        return null;
    }

    @Override
    public void displayAll(Room item) {
        if (rooms.isEmpty()) {
            System.out.println("Không có phòng nào.");
            return;
        }
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

}
