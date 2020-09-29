package Husdjurshotell;

/**
 * Created by Filip Jakobsson
 * Date: 2020-09-28
 * Time: 13:56
 * Project:  Objektorienterad programmering
 * Copyright: MIT
 */
public class Orm extends Husdjur implements Diet{

    //Konstruktor
    public Orm(String name, double weight){
        super(name, weight);
    }

    //metod
    @Override
    public double dietCalc(){
        return 20;
    }
}
