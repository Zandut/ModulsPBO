/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author ZANDUT
 */
public class Main
{
    public static void main(String[] args)
    {
        //assosiasi
        //jarang digunakan
        Dosen dosenA = new Dosen("111", "Kahfi Sandoro");
        MataKuliah2 matkul = new MataKuliah2("D3HG", "PBO", dosenA.getNama());
        
        System.out.println("Matkul "+matkul.getNama());
        System.out.println("Dosennya "+matkul.getNamaDosen());
        
        //agregasi
        MataKuliah matkul2 = new MataKuliah("S1HG", "PBO S1", dosenA);
        System.out.println("Matkul "+matkul2.getNama());
        System.out.println("Dosennya dengan NIP "+matkul2.getDosen().getNip());
        System.out.println("Dosennya dengan Nama "+matkul2.getDosen().getNama());
        
        //komposisi
        Motor motor = new Motor("Honda", "250 cc", "60 Hz");
        
        System.out.println("Merk motor "+motor.getMerk());
        System.out.println("Kecepatan "+motor.getMesin().getCc());
        System.out.println("Tegangan Aki "+motor.getAki().getTegangan());
        
    }
}
