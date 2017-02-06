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
public class Dosen
{
    private String nip;
    private String nama;

    public Dosen()
    {
    }

    public Dosen(String nip, String nama)
    {
        this.nip = nip;
        this.nama = nama;
    }

    public void setNip(String nip)
    {
        this.nip = nip;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNip()
    {
        return nip;
    }

    
    public String getNama()
    {
        return nama;
    }
    
    
}
