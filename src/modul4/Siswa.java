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
public class Siswa extends Manusia
{
    private String nis;
    
    public Siswa(String nama)
    {
        super(nama);
    }

    @Override
    public String getNama()
    {
        return super.getNama()+", Sis"; 
    }
    
    

    public void setNis(String nis)
    {
        this.nis = nis;
    }

    public String getNis()
    {
        return nis;
    }
    
    
}
