/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan61.bangunruang;

/**
 *
 * @author FairuzDay
 */
public class Bola extends BangunRuang{
    private double jariJari;
    private double volume;

    Bola() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public double hitungVolume() {
        this.volume = 1.3333 * Math.PI * Math.pow(jariJari, 3);
        return this.volume;
    }   


    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
}
