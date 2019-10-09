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
public class DATADIRI {
    public static void main(String[] args) {
        DATADIRI biodata = new DATADIRI();
        biodata.setNama("");
        biodata.setNIS("");
        biodata.setTempatLahir("");
        biodata.setTanggalLahir("");
        biodata.setJenisKelamin("");
        biodata.setAlamatdiMalang("");
        biodata.setMottohidup("");
    }
    private void setNama(String nama) {
        nama = "SABRINA AMELIA R.P.";
        System.out.println("Nama : " + nama);
    }
    private void setNIS(String nis) {
        nis = "6328/2591.065";
        System.out.println("NIS : " + nis);
    }
    private void setTempatLahir(String tempatlahir) {
        tempatlahir = "TULUNGAGUNG";
        System.out.println("Tempat lahir : " + tempatlahir);
    }
    private void setTanggalLahir(String tanggallahir) {
        tanggallahir = "10 JULI 2003";
        System.out.println("Tanggal Lahir : " + tanggallahir);
    }
    private void setJenisKelamin(String jeniskelamin) {
        jeniskelamin = "PEREMPUAN";
        System.out.println("Jenis Kelamin : " + jeniskelamin);
    }
    private void setAlamatdiMalang(String alamat) {
        alamat = "jl.Danau Ranau G5/E32,SAWOJAJAR";
        System.out.println("Alamat : " + alamat);
    }
    private void setMottohidup(String mottohidup) {
        mottohidup = "AKU TIDAK ANEH TAPI AKU EDISI TERBATAS";
        System.out.println("Motto : " + mottohidup);
    }
    
}
