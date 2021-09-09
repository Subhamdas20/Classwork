package com.bz.classwork;

import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of times you want to flip");
        int flip=sc.nextInt();

        int tails=0,heads=0;
        for(int i=1;i<=flip;i++) {
            Double rand=(double)Math.random();
            if (rand < 0.5) {
                tails = tails + 1;
//                System.out.println(tails);
            } else {
                heads = heads + 1;
//                System.out.println(heads);
            }
        }
        Double tailsP = (double) (tails * 100) / flip;
        Double headsP = (double) (heads * 100) / flip;
        System.out.println("percentage of tails=" + tails);
        System.out.println("percentage of heads=" + headsP);
    }
}
