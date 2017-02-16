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
public class MataKuliah
{
    private String kode;
    private String nama;

    public void setKode(String kode)
    {
        this.kode = kode;
    }

    public String getKode()
    {
        return kode;
    }
    
    

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public MataKuliah()
    {
    }


    public MataKuliah(String kode, String nama)
    {
        this.kode = kode;
        this.nama = nama;
    }
    
    
    
    
}
