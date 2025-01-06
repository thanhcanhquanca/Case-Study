package model;

public enum RoomType {
    VIP(2000000),LUXURY(12000000), STANDARD(600000),ECONOMY(200000);

    private final int pricePerDay;

    RoomType(int pricePerDay) {

        this.pricePerDay = pricePerDay;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }
}
