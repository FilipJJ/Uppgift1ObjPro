package Husdjurshotell;

/**
 * Created by Filip Jakobsson
 * Date: 2020-09-28
 * Time: 13:49
 * Project:  Objektorienterad programmering
 * Copyright: MIT
 */
public class Husdjur {

    //Instansvariabler
    String name;
    double weight;
    Hund hund;

    //Konstruktor
    public Husdjur(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    //Instansmetoder
    public String getName(){
        return name;
    }

    public Hund getHund(){
        return hund;
    }


}
