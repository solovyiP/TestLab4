package org.example;

public class Author {
    String name;
    int birthday;
    int books;

    public Author(String name, int birthday,int books){
        this.name=name;
        this.birthday=birthday;
        this.books=books;
    }
    public String toString(){
        return name +", дата рождения: "+birthday+", кол-во книг: "+books;
    }
}
