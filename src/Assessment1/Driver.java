/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessment1;

/**
 *
 * @author ZANDUT
 */
public class Driver
{
    public static void main(String[] args)
    {
        MataKuliah matkul1 = new MataKuliah("111", "Kalkulus 1");
        MataKuliah matkul2 = new MataKuliah("112", "Kalkulus 2");
        MataKuliah matkul3 = new MataKuliah("113", "Kalkulus 3");
        
        Mahasiswa mhs = new Mahasiswa("13011", "Fauzan");
        mhs.addMatkul(matkul1);
        mhs.addMatkul(matkul2);
        mhs.addMatkul(matkul3);
        
        mhs.displayMatkul();
        
        
    }
}
