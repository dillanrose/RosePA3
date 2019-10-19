package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom dice = new SecureRandom();


        double saver1=2000.00;
        double saver2=3000.00;
        double annual1IntrestRate=1.04;
        double annual2IntrestRate=1.05;
        double months = 1;
        double saver1total1= saver1*annual1IntrestRate;
        double saver2total1= saver2*annual1IntrestRate;
        double saver1total2= saver1*annual2IntrestRate;
        double saver2total2= saver2*annual2IntrestRate;

        System.out.println("Saver 1's balance at .4% is " +saver1total1);
        System.out.println("Saver 2's balance at .4% is " +saver2total1);
        System.out.println("Saver 1's balance at .5% is " +saver1total2);
        System.out.println("Saver 2's balance at .5% is " +saver2total2);




    }
    }