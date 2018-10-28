/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan41.massajenis;

/**
 *
 * @author Notebook
 */
public class PBO210117061Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus1 = new Kubus();
        kubus1.setSisi(5);
        kubus1.setMassa(250);
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.println("sisi : " + kubus1.getSisi() );
        System.out.println("Masa : " + kubus1.getMassa() );
        System.out.println("\n=====Hasil Perhitungan======");
        System.out.println("Volume : " + kubus1.hitungVolume(kubus1.getSisi()));
        System.out.println("Massa Jenis : " +kubus1.hitungMassaJenis(kubus1.getMassa(),kubus1.hitungVolume(kubus1.getSisi()) ) ); 
        
    }
    
}
