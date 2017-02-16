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
public class Mahasiswa
{
    private String nim;
    private String nama;
    private MataKuliah[] daftar_matkul = new MataKuliah[5];
    private int jml_matkul=0;

    public Mahasiswa()
    {
    }

    public Mahasiswa(String nim, String nama)
    {
        this.nim = nim;
        this.nama = nama;
        
    }

    public void setNim(String nim)
    {
        this.nim = nim;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNim()
    {
        return nim;
    }

    public String getNama()
    {
        return nama;
    }
    
    public void addMatkul(MataKuliah matkul)
    {
        if (jml_matkul < 5)
        {
            daftar_matkul[jml_matkul] = matkul;
            jml_matkul++;
        }
        else
        {
            System.out.println("Matkul penuh");
        }
    }
    
        
    
    public MataKuliah getMatkul(int n)
    {
        return daftar_matkul[n];
    }
    
    public void displayMatkul()
    {
        for (int i = 0; i < jml_matkul; i++)
        {
            MataKuliah matkul = getMatkul(i);
            System.out.println("Kode Matkul "+matkul.getKode());
            System.out.println("Nama Matkul "+matkul.getNama());
            System.out.println("---------------------------------------");
        }
    }
    
}
