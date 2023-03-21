package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class userTest {
    @Test
    public void usersTrue(){
        user firstUser=new user("Иванов","Иван","ivanov@mail.ru");
        user secondUser=new user("Петров","Петр","petrov@mail.ru");
        user thirdUser=new user("Семенов","Семен","semenov@mail.ru");
        assertEquals(3, user.totalonLine);
    }
    @Test
    public void usersFalse(){
        user firstUser=new user("Иванов","Иван","ivanov@mail.ru");
        user secondUser=new user("Петров","Петр","petrov@mail.ru");
        user thirdUser=new user("Семенов","Семен","semenov@mail.ru");
        assertEquals(7, user.totalonLine);
    }
}