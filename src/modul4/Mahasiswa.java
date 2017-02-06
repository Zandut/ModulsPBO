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
public class Mahasiswa extends Manusia
{
    private String nim;

    //hanya memenuhi constructor super class
    public Mahasiswa(String nama)
    {
        super(nama);
       
    }

    @Override
    public String getNama()
    {
        return super.getNama()+", S.T";
    }

    //overloading
    public void setNim(String nim, String nama)
    {
        this.nim = nim;
        super.setNama(nama);
    }
   
    
    public void setNim(String nim1)
    {
        this.nim = nim;
    }

    public String getNim()
    {
        return nim;
    }
    
    
    
}
