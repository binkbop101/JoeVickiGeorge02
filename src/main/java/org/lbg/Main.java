package org.lbg;

import animals.Animal;
import animals.Domestic;
import animals.NonDomestic;

public class Main {
    public static void main(String[] args) {

        Animal nd1 = new NonDomestic(false,false,false,"rainforest", 4, "meat", 15, true);
        // System.out.println(nd1);

        Animal d1 = new Domestic(true, true, "Vicki", "Fletcher", 4, "Wild Boar", 7, false);
        // System.out.println(d1);


        Animal[] animalsArr = {nd1, d1};
        for (Animal a : animalsArr){
            System.out.println(a);
            System.out.println(a.makeNoise());
        }



    }
}