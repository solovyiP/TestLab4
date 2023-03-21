package org.example;

public class user {
    static int totalonLine=0;
    String name;
    String surname;
    String email;

    public user(){totalonLine++;}

    public user(String name, String surname,String email){
        this.name=name;
        this.surname=surname;
        this.email=email;
        totalonLine++;
    }
    public String toString(){return name + surname + email;}
}
