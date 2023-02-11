package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "aman";
//        System.out.println(obj.name);

        obj.setName("aman");
        System.out.println(obj.getName());
    }
}