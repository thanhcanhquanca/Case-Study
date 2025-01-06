package model;

import java.io.Serializable;

public class Room extends Hotel implements Serializable {
    private String roomId;
    private String type;
    private int capacity;
    private int pricePerDay;
    private boolean isStatus;

    public Room(String roomId, String type, int capacity, int pricePerDay, boolean isStatus) {
        this.roomId = roomId;
        this.type = type;
        this.capacity = capacity;
        this.pricePerDay = pricePerDay;
        this.isStatus = isStatus;
    }

    public Room(String description, String color, String roomId, String type, int capacity, int pricePerDay, boolean isStatus) {
        super(description, color);
        this.roomId = roomId;
        this.type = type;
        this.capacity = capacity;
        this.pricePerDay = pricePerDay;
        this.isStatus = isStatus;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", pricePerDay=" + pricePerDay +
                ", isStatus=" + isStatus +
                '}';
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

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isStatus() {
        return isStatus;
    }

    public void setStatus(boolean status) {
        isStatus = status;
    }
}
