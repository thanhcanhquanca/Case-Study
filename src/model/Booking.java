package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Booking extends Hotel implements Serializable {
    private String bookingDate;
    private String customerID;
    private String roomId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private double totalPrice;

    public Booking(String bookingDate, String customerID, String roomId, LocalDate checkInDate, LocalDate checkOutDate, double totalPrice) {
        this.bookingDate = bookingDate;
        this.customerID = customerID;
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalPrice = totalPrice;
    }

    public Booking(String description, String color, String bookingDate, String customerID, String roomId, LocalDate checkInDate, LocalDate checkOutDate, double totalPrice) {
        super(description, color);
        this.bookingDate = bookingDate;
        this.customerID = customerID;
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingDate='" + bookingDate + '\'' +
                ", customerID='" + customerID + '\'' +
                ", roomId='" + roomId + '\'' +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}