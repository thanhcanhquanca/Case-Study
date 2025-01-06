import controller.CustomerManager;
import model.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        // Tạo một số khách hàng mẫu
        Customer customer1 = new Customer("0243852493", "labu", 12, 329258948, "a.nguyen@example.com","balabal");


        // Thêm khách hàng vào hệ thống
        customerManager.add(customer1);
        customerManager.displayAll(customer1);


        // Hiển thị tất cả khách hàng
        System.out.println("Danh sách khách hàng:");
        for (Customer customer : customerManager.getAll()) {
            System.out.println(customer);
        }

        // Tìm kiếm khách hàng theo ID
        System.out.println("\nTìm khách hàng với ID 'C002':");
        customerManager.searchById("C002");

        // Xóa khách hàng theo ID
        System.out.println("\nXóa khách hàng với ID 'C003':");
        customerManager.delete("C003");
    }
}
