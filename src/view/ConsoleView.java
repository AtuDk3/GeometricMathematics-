/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
import model.Point;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public int displayMainMenu() {
        System.out.println("*** Basic geometry ***");
        System.out.println("1. Segment");
        System.out.println("2. Triangle");
        System.out.println("3. Quadrilateral");
        System.out.println("4. Circle");
        System.out.println("5. Exit");
        System.out.print("You choose: ");
        return scanner.nextInt();
    }

    public Point inputPoint(String pointName) {
        System.out.println("Enter " + pointName);
        double x = inputDouble(pointName + ".x = ");
        double y = inputDouble(pointName + ".y = ");
        return new Point(x, y);
    }

    // Sửa đổi: Dùng nextDouble để tránh lỗi đọc dữ liệu không mong muốn
    public double inputDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Data input is invalid. Please re-enter.");
                scanner.next(); // Bỏ qua giá trị nhập không hợp lệ
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

