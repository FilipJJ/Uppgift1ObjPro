package Husdjurshotell;

/**
 * Created by Filip Jakobsson
 * Date: 2020-09-28
 * Time: 13:51
 * Project:  Objektorienterad programmering
 * Copyright: MIT
 */
public class Hund extends Husdjur implements Diet{

    //Konstruktor
    public Hund(String name, double weight){
        super(name, weight);
    }

    //metod
    @Override
    public double dietCalc(){
        return weight/100;
    }


}
