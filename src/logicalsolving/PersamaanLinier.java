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
public class PersamaanLinier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String a = "", b = "", c = "";
        System.out.print("Persamaan\t: ");
        String input = in.nextLine();
        System.out.println("");

        String array[] = input.split("x");
        if (array[0].equals(null) || array[0].equals("")) {
            a = "1";
        } else {
            a = array[0];
        }
        String toSplit = array[1];
        String array2[] = toSplit.split("=");
        b = array2[0];
        c = array2[1];

        int iA = Integer.valueOf(a);
        if (b.equals("")) {
            b = "0";
        }
        int iB = Integer.valueOf(b);
        int iC = Integer.valueOf(c);

        System.out.println("a = " + iA);
        System.out.println("b = " + iB);
        System.out.println("c = " + iC);

        if (iB != 0) {
            System.out.println("x = " + (iC + (iB * (-1))) / iA);
        } else {
            System.out.println("x = " + iC + "/" + iA);
        }
    }

}
