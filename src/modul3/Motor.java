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
public class Motor
{
    private String merk;
    private Mesin mesin;
    private Aki aki;

    public Motor()
    {
    }

    public Motor(String merk, String cc, String tegangan)
    {
        this.merk = merk;
        
        this.mesin = new Mesin(cc);
        this.aki = new Aki(tegangan);
    }

    public void setAki(String tegangan)
    {
        this.aki = new Aki(tegangan);
    }

    public void setMesin(String cc)
    {
        this.mesin = new Mesin(cc);
    }

    public void setMerk(String merk)
    {
        this.merk = merk;
    }

    public Aki getAki()
    {
        return aki;
    }

    public Mesin getMesin()
    {
        return mesin;
    }

    public String getMerk()
    {
        return merk;
    }
    
    
    
    
    
    
    
    
}
