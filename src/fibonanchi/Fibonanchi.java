/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonanchi;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibonanchi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        deret(x);
    }
    private static int fibbonaci(int x){
        if(x>1){
            return fibbonaci(x-1)+fibbonaci(x-2);
        }
        return x;
    }

    private static void deret(int x){
        for (int i = 1; i <= x; i++) {
            System.out.print(fibbonaci(i)+" ");
        }
    }
}
