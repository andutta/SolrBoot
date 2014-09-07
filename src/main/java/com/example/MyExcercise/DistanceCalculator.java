package com.example.MyExcercise;

import java.util.Scanner;

/**
 * Created by adutta on 9/6/2014.
 */
public class DistanceCalculator {

    public static void main(String[] args){
        Scanner console=new Scanner(System.in);

        System.out.println("Enter X1");
        int x = console.nextInt();
        System.out.println("Enter Y1");
        int y = console.nextInt();

        DistanceCalculator.XY xy1 = new DistanceCalculator.XY(x,y);

        System.out.println("Enter X2");
        x = console.nextInt();
        System.out.println("Enter Y2");
        y = console.nextInt();

        DistanceCalculator.XY xy2 = new DistanceCalculator.XY(x,y);

        double distance = Math.sqrt(((xy2.getX() - xy1.getX()) * (xy2.getX() - xy1.getX())) + ((xy2.getY() - xy1.getY()) * ((xy2.getY() - xy1.getY())) ) );
        System.out.println(distance);

    }

    public static class XY{
        private int x;
        private int y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
