package model;

import java.awt.*;
import java.io.Serializable;

public class Room implements Serializable {
    private String roomId;
    private String type;
    private int capacity;
    private double pricePerDay;
    private boolean isStatus;

    private static Room instance;

    public static Room getInstance(String roomId, String type, int capacity, double pricePerDay, boolean isStatus) {
        if (instance == null) {
            instance = new Room(roomId, type, capacity, pricePerDay, isStatus);
        }
        return instance;
    }

    public Room() {
    }

    public Room(String roomId, String type, int capacity, double pricePerDay, boolean isStatus) {
        this.roomId = roomId;
        this.type = type;
        this.capacity = capacity;
        this.pricePerDay = pricePerDay;
        this.isStatus = isStatus;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isStatus() {
        return isStatus;
    }

    public void setStatus(boolean status) {
        isStatus = status;
    }
}
