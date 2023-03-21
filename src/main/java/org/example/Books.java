package org.example;

public class Books {
    String name;
    Author author;
    String description;
    int pages;
    int year;
    String content;
    public Books(String name,String description,int year,int pages, Author author, String content){
        this.name=name;
        this.description=description;
        this.pages=pages;
        this.year=year;
        this.content=content;
        this.author=author;
    }
    public String toString(){
        return "Название книги: "+name+", автор: "+author+", год: "+year+", количество старниц: "+pages+ ", содержание: "+content+", описание: "+ description;
    }

}
