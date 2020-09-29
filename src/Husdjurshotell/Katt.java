package Husdjurshotell;

/**
 * Created by Filip Jakobsson
 * Date: 2020-09-28
 * Time: 13:54
 * Project:  Objektorienterad programmering
 * Copyright: MIT
 */
public class Katt extends Husdjur implements Diet{

    //Konstruktor
    public Katt(String name, double weight){
        super(name, weight);
    }

    //metod
    @Override
    public double dietCalc(){
        return weight/150;
    }
}
