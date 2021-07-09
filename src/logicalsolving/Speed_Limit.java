/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicalsolving;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Speed_Limit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int point = 0;
        float speed;
//        do {
        while (point < 12) {
            System.out.println("\n=======Speed Limit=======");
            System.out.print("Speed :");
            speed = sc.nextFloat();

            if (speed < 70) {
                System.out.println("OK.");
            } else {

                do {
                    ++point;
                    speed -= 5;
                } while (speed > 70);
                System.out.print("Point : " + point);
            }
        }
//        } while (12 > point);
        System.out.println("\nLicensed Suspended");
    }

}
