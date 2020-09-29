package Husdjurshotell;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Filip Jakobsson
 * Date: 2020-09-28
 * Time: 13:58
 * Project:  Objektorienterad programmering
 * Copyright: MIT
 */
public class Test {


    //mainmetod
    public static void main(String[] args) {

        //Husdjuren som bor på holtellet
        Hund Sixten = new Hund("Sixten", 5000);
        Hund Dogge = new Hund("Dogge", 10000);
        Katt Venus = new Katt("Venus", 5000);
        Katt Ove = new Katt("Ove", 3000);
        Orm Hypno = new Orm("Hypno", 1000);

        //Alla husdjur läggs till i en lista
        List<Husdjur> husdjur = new ArrayList<>();

        husdjur.add(Sixten);
        husdjur.add(Dogge);
        husdjur.add(Venus);
        husdjur.add(Ove);
        husdjur.add(Hypno);


        //Inmatning av vilket djur som ska få mat
        String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");

        //Felmeddelande pga ingen text skriven
        if (input.length() == 0)
            JOptionPane.showMessageDialog(null, "Ingen text angiven.");


        //Selektioner av olika beräkningar beorende på typ av husdjur
        for (Husdjur h : husdjur) {

            if (h.getName().equals(input)) {

                if (input.equals(Sixten.getName()))
                    JOptionPane.showMessageDialog(
                            null, h.getName() + " ska få " + (int) Sixten.dietCalc() + " gram hundfoder.");
                if (input.equals(Dogge.getName()))
                    JOptionPane.showMessageDialog(
                            null, h.getName() + " ska få " + (int) Dogge.dietCalc() + " gram hundfoder.");
                if (input.equals(Venus.getName()))
                    JOptionPane.showMessageDialog(
                            null, h.getName() + " ska få " + (int) Venus.dietCalc() + " gram kattfoder.");
                if (input.equals(Ove.getName()))
                    JOptionPane.showMessageDialog(
                            null, h.getName() + " ska få " + (int) Ove.dietCalc() + " gram kattfoder.");
                if (input.equals(Hypno.getName()))
                    JOptionPane.showMessageDialog(
                            null, h.getName() + " ska få " + (int) Hypno.dietCalc() + " gram ormpellets.");



            }

        }//Här slutar for-satsen

    }
}
