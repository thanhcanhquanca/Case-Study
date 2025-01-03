package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Invoice implements Serializable {
    private String invoiceID;
    private int bookingId;
    private LocalDate issueDate;
    private double totalPrice;

    private static Invoice instance;
    public static Invoice getInstance(String invoiceID, int bookingId, LocalDate issueDate, double totalPrice) {
        if (instance == null) {
            instance = new Invoice(invoiceID, bookingId, issueDate, totalPrice);
        }
        return instance;
    }

    public Invoice() {
    }

    public Invoice(String invoiceID, int bookingId, LocalDate issueDate, double totalPrice) {
        this.invoiceID = invoiceID;
        this.bookingId = bookingId;
        this.issueDate = issueDate;
        this.totalPrice = totalPrice;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
