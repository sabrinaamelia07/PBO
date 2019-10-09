/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class TUGASPRAKTIKUMBOLA {
    public static void main(String[] args) {
        Scanner brn = new Scanner(System.in);
        double phi = 3.14;
        int r;
        System.out.println("=====LUAS PERMUKAAN BOLA=====");
        System.out.println("Masukkan Nilai r : ");
        r = brn.nextInt();
        System.out.println("Nilai phi yang digunakan :" + phi);
        System.out.println("==========");
        System.out.println("Luas Permukaan Bola : " + 4*phi*r*r);
    }
    
}
