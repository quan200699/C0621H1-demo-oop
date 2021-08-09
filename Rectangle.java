package com.company;

//Đổi tên lớp thì dùng tổ hợp phím Shift + F6
public class Rectangle {
    private double width;

    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double chuVi() {
        double chuVi = (width + height) * 2;
        return chuVi;
    }

    public double dienTich() {
        return width * height;
    }
}
