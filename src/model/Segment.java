/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Segment {
    private Point d1, d2;

    public Segment() {
        this.d1 = new Point();
        this.d2 = new Point();
    }

    public Segment(Point d1, Point d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(d2.getX() - d1.getX(), 2) + Math.pow(d2.getY() - d1.getY(), 2));
    }

    public void printSegment() {
        d1.printXY();
        System.out.print(" - ");
        d2.printXY();
    }
}

