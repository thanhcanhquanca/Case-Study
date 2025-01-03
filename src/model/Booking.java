package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Booking implements Serializable {
    private String bookingID;
    private String customerID;
    private String roomId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private double totalPrice;

    public Booking() {
    }

    public Booking(String bookingID, String customerID, String roomId, LocalDate checkInDate, LocalDate checkOutDate, double totalPrice) {
        this.bookingID = bookingID;
        this.customerID = customerID;
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalPrice = totalPrice;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
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
