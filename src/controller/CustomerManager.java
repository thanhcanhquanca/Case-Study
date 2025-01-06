package controller;

import model.Customer;

import java.util.*;
import java.util.regex.Pattern;

public class CustomerManager extends HotelManager<Customer> {
    private final List<Customer> customers = new ArrayList<>();

    private static final String ID_REGEX = "^[A-Za-z0-9]{5,10}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    private boolean validateId(String id) {
        return Pattern.matches(ID_REGEX, id);
    }

    private boolean validateEmail(String email){
        return Pattern.matches(EMAIL_REGEX, email);
    }


    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public void add(Customer item) {
        if (!validateId(item.getId())){
            System.out.println("ID không hợp lệ , ID phải từ 5 - 10 ký tự chỉ chứa chữ và số");
            return;
        }
        if (!validateEmail(item.getEmail())){
            System.out.println("email không hợp lệ , vui lòng nhập email đúng định dạng");
            return;
        }

        for (Customer customer : getAll()) {
            if (customer.getId().equals(item.getId())) {
                System.out.println(" khách hàng đã tồn tại " + item.getId() + "đã tồn tại") ;
                return;
            }
        }

        customers.add(item);
        System.out.println("Thêm khách hàng thành công");
    }

    @Override
    public void delete(String id) {
        boolean found = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(id)) {
                customers.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("xóa khách hàng thành công với ID :" + id);
        }else {
            System.out.println("không tìm khách hàng với ID " + id);
        }
    }

    @Override
    public void sort() {
        customers.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        System.out.println("sắp xếp thành công theo id");
    }

    @Override
    public Customer searchById(String id) {
       for (Customer customer : getAll()) {
           if (customer.getId().equals(id)) {
               return customer;
           }
       }
        System.out.println("không tìm thấy khách hàng với id " + id);
       return null;
    }

    @Override
    public void update(Customer item) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(item.getId())) {
                customers.set(i, item);
                System.out.println("Cập nhật khách hàng thành công: " + item.getId());
                return;
            }
        }
        System.out.println("Không tìm thấy khách hàng với ID: " + item.getId());
    }

    @Override
    public void displayAll(Customer item) {
        if (customers.isEmpty()){
            System.out.println(" không có khách hàng");
           return;
        }

        for (Customer customer : getAll()) {
            System.out.println(customer);
        }
    }


}