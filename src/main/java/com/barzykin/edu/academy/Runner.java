package com.barzykin.edu.academy;

public class Runner {
    public static void main(String[] args) {
        String prefix = "->";
        User user = new User("Alex", 44);
        System.out.println(user.getInfo(prefix));
    }
}
