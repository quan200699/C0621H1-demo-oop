package com.company;

public class Student {
    public int id;
    public String name;

    public Student() {
    } // Hàm tạo trong Java - Hàm tạo không có tham số

    public Student(int id) {//Hàm tạo có một tham số
        this.id = id;
    }

    public Student(String name) { //Hàm tạo có một tham số
        this.name = name;
    }

    public Student(int id, String name) {//Hàm tạo có 2 tham số
        this.id = id;
        this.name = name;
    }

    public void study() {
        System.out.println("Học viên đang học bài");
    }

    public int getId() { //getter - lấy ra => cần trả về
        return this.id;
    }

    public void setId(int id) { //setter - cài đặt lại giá trị => không cần trả về
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
