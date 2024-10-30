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

        NonDomestic nd2 = new NonDomestic(false,false,false,"Jungle", 4, "Apples", 10, true);
        Domestic d2 = new Domestic(true, true, "George", "Joe", 4, "Popcorn", 22, false);

        System.out.println(nd2);
        System.out.println(nd2.move());
        System.out.println(nd2.eatFood());
        System.out.println(d2);
        System.out.println(d2.move());
        System.out.println(d2.eatFood());
    }
}