package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Петров";
        post.patronymic = "Иванович";
        post.phone = "+7(999)-999-99-55";
        post.passport = "1234 №456789";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 11;
        post.birthday.year = 1998;


        System.out.println(post.name);
    }
}