/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author PC
 */
public class LAT4 {
    public static void main (String[] args) {
        LAT4 motor = new LAT4();
        motor.setMerk("");
        motor.setNama("");
    }
    private void setMerk(String merk) {
        merk = "KAWASAKI";
        System.out.println("Merk motor adalah :" + merk);
        
    }
    private void setNama(String nama) {
        nama = "NINJA";
        System.out.println("Nama motor adalah :" + nama);
    }
    
}
