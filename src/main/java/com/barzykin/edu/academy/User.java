package com.barzykin.edu.academy;

public class User {
    private String fio;
    private int age;

    public User(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public String getInfo(String prefix) {
        return prefix + " " + fio + " " + age;
    }
}
