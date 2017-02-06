/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author ZANDUT
 */
public class Main
{
    public static void main(String[] args)
    {
        Mahasiswa mhs = new Mahasiswa("Muhamamd Fauzan");
        mhs.setNim("13011", "Fuazan");
        
        
        Siswa sis = new Siswa("Jr. Muhammad Fauzan");
        sis.setNis("111111");
        
        
        System.out.println("Mahasiswa ");
        System.out.println("NIM "+mhs.getNim());
        System.out.println("Nama "+mhs.getNama());
        
        System.out.println("Siswa ");
        System.out.println("NIS "+sis.getNis());
        System.out.println("Nama "+sis.getNama());
        
    }
}
