package org.lbg;

import animals.NonDomestic;

public class Main {
    public static void main(String[] args) {

        NonDomestic nd1 = new NonDomestic(false,false,false,"rainforest", 4, "meat", 15, true);
        System.out.println(nd1.getAge());


    }
}