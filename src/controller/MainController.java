/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Circle;
import model.Point;
import model.Quadrilateral;
import model.Segment;
import model.Triangle;
import view.ConsoleView;

/**
 *
 * @author Lenovo
 */
public class MainController {
    private ConsoleView view = new ConsoleView();

    public void run() {
        int choice;
        do {
            choice = view.displayMainMenu();
            switch (choice) {
                case 1:
                    manageSegment();
                    break;
                case 2:
                    manageTriangle();
                    break;
                case 3:
                    manageQuadrilateral();
                    break;
                case 4:
                    manageCircle();
                    break;
                case 5:
                    view.displayMessage("BYE AND SEE YOU NEXT TIME");
                    break;
                default:
                    view.displayMessage("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private void manageSegment() {
        Point d1 = view.inputPoint("starting point d1");
        Point d2 = view.inputPoint("ending point d2");
        if (d1.isSame(d2)) {
            view.displayMessage("Coordinates of 2 points are the same, please re-enter.");
            return;
        }
        Segment segment = new Segment(d1, d2);
        segment.printSegment();
        System.out.printf(" - Length: %.2f\n", segment.getLength());
    }

    private void manageTriangle() {
        Point d1 = view.inputPoint("d1");
        Point d2 = view.inputPoint("d2");
        Point d3 = view.inputPoint("d3");
        if (d1.isSame(d2) || d2.isSame(d3) || d3.isSame(d1)) {
            view.displayMessage("Coordinates of 2 points are the same, please re-enter.");
            return;
        }
        Triangle triangle = new Triangle(d1, d2, d3);
        triangle.printTriangle();
        System.out.printf(" - Perimeter: %.2f\n", triangle.getPerimeter());
    }

    private void manageQuadrilateral() {
        Point d1 = view.inputPoint("d1");
        Point d2 = view.inputPoint("d2");
        Point d3 = view.inputPoint("d3");
        Point d4 = view.inputPoint("d4");
        Quadrilateral quadrilateral = new Quadrilateral(d1, d2, d3, d4);
        quadrilateral.printQuadrilateral();
        System.out.printf(" - Perimeter: %.2f\n", quadrilateral.getPerimeter());
    }

    private void manageCircle() {
        Point center = view.inputPoint("O center");
        double radius = view.inputDouble("Enter radius: ");
        if (radius <= 0) {
            view.displayMessage("To have a circle, the radius must be >0, please re-enter.");
            return;
        }
        Circle circle = new Circle(center, radius);
        circle.printCircle();
        System.out.printf(" - Perimeter: %.2f\n", circle.getPerimeter());
    }
}

