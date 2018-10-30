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
public class Kerucut extends BangunRuang{
    private double volume;
    private double tinggi;
    private double jariJari;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    
    public double hitungVolume() {
        this.volume = 0.3333 * Math.PI * Math.pow(this.jariJari, 2) * this.tinggi;
        return this.volume;
    }
}
