package org.example;

public class Main {
    public static void main(String[] args) {
            Author firstAuthor = new Author("Харуки Мураками", 1949,32 );
            Author secondAuthor = new Author("Джоан К. Роулинг", 1965,9 );
            Books firstBook = new Books("Хроники Заводной птицы", "роман японского писателя Харуки Мураками",1994,500, firstAuthor, "глава 1, глава 2, глава 3" );
            Books secondBook=new Books("Гарри Поттер","о мальчике, который выжил",1998,1000, secondAuthor, "глава 1, глава 2, глава 3" );
            user firstUser=new user("Иванов","Иван","ivanov@mail.ru");
            user secondUser=new user("Петров","Петр","petrov@mail.ru");
            user thirdUser=new user("Семенов","Семен","semenov@mail.ru");
            System.out.println("Кол-во онлайн: " +user.totalonLine);
            System.out.println(firstBook);
            System.out.println(firstAuthor);
            System.out.println(secondBook);
            System.out.println(secondAuthor);

    }
}