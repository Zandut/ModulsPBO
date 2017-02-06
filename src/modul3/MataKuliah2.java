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
public class MataKuliah2
{
    private String kode;
    private String nama;
    private String namaDosen;

    public MataKuliah2()
    {
    }

    public MataKuliah2(String kode, String nama, String namaDosen)
    {
        this.kode = kode;
        this.nama = nama;
        this.namaDosen = namaDosen;
    }

    public void setKode(String kode)
    {
        this.kode = kode;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void setNamaDosen(String namaDosen)
    {
        this.namaDosen = namaDosen;
    }

    public String getKode()
    {
        return kode;
    }

    public String getNama()
    {
        return nama;
    }

    public String getNamaDosen()
    {
        return namaDosen;
    }
    
    
}
