package model;

import java.io.Serializable;

public abstract class Hotel implements Serializable {
    private String description;
    private String color;

    public Hotel() {
        this.color = "blue";
        this.description = "khách sạn 5 sao";
    }


    public Hotel(String description, String color) {
        this.description = description;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "description='" + description + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
