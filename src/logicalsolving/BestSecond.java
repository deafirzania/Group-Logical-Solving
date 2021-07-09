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
public class BestSecond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int number;
        int panjang;
        int besar = 0;
        int besar2 = 0;
        System.out.print("Total data\t: ");
        panjang= input.nextInt();
        int[] angka = new int[panjang+1];
        System.out.println("");
        
        for (int i = 0; i < angka.length; ++i) {
            if(i == 0){
                System.out.print("Angka ke-"+ ++i + "\t: ");
                number= input.nextInt();
                angka[i]= number;
            } else {
                System.out.print("Angka ke-"+ i + "\t: ");
                number= input.nextInt();
                angka[i]= number;
            }
        }
        
        int size = angka.length;
        
        while(size > 0){
            int i = --size;
            
            if(angka[i] > besar){
                besar2 = besar;
                besar = angka[i];
            } else if (angka[i] > besar2){
                besar2 = angka[i];
            }
        } System.out.println("\nBest Second\t: " + besar2);
    }
    
}
