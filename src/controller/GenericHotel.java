package controller;

import java.util.List;

public interface GenericHotel<T> {
    List<T> getAll();
    void add(T item);
    void delete(String id);
    void update(T item);
    void sort();
    T searchById(String id);
    void displayAll(T item);
}