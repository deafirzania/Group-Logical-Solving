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
public class Faktor_Persekutuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Faktor Persekuttuan 2 Bilangan");
        System.out.print("Angka Pertama : ");
        int angka = sc.nextInt();
        System.out.print("Angka Kedua   : ");
        int angka2 = sc.nextInt();
        System.out.print("Faktor dari "+angka+" : ");
        
        for (int i = 1; i <= angka; i++) {
            if(angka%i==0){
                System.out.print(i+" ");   
            }
        }
        
        System.out.println(" ");
        
        System.out.print("Faktor dari "+angka2+" : ");
        for(int j = 1; j <= angka2; j++){
            if(angka2%j== 0){
                System.out.print(j+" ");
            }
        }
        System.out.println(" ");
        System.out.print("Faktor Persekutuan bilangan "+angka+" dan "+angka2+" : ");
        for (int a = 1 ;a <= angka && a <= angka2; a++) {
            if(angka%a == 0 && angka2%a == 0){
                System.out.print(a+" ");
            }
        }    
    }    
}
