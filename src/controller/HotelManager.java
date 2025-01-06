package controller;

import java.io.IOException;
import java.util.List;

public class HotelManager<T> implements GenericHotel<T> {


    @Override
    public List<T> getAll() {
        return List.of();
    }

    @Override
    public void add(T item) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(T item) {

    }

    @Override
    public void sort() {

    }

    @Override
    public T searchById(String id) {
        return null;
    }

    @Override
    public void displayAll(T item) {

    }

    @Override
    public void readFromFile(String fileName) throws IOException {

    }

    @Override
    public void writeToFile(String fileName) {

    }
}
