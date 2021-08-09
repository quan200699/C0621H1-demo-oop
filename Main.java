package com.company;

public class Main {
    private String name;

    public String getStudentName(){
        return this.name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        System.out.println(student.getId());
        student.setName("Chính");
        System.out.println(student.getName());
        System.out.println(student); // in ra địa chỉ ô nhớ
        System.out.println(student.getId() + "," + student.getName());
    }
}
