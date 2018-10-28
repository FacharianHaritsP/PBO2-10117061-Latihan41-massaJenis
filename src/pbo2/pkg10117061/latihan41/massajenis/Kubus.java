/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan41.massajenis;

/**
 * Nama : Fachrian Harits P
 * NIM : 10117061
 * Kelas : IF-2
 * Deklarisi : Program ini untuk mengitung massa jenis
 */
public class Kubus {
    
private int  sisi;
private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }


public int hitungVolume( int parSisi){
return sisi*sisi*sisi;
}
    
public int hitungMassaJenis(int parMassa , int volume){
return massa/volume;
}
}
