/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan61.bangunruang;

/*
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description : bangun ruang
 */
public class PBO610116568Latihan61Bangunruang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         BangunRuang bangunRuang;

        bangunRuang = new Bola();
        ((Bola) bangunRuang).setJariJari(7);
        System.out.println("Hasil : V Bola\t\t= " + ((Bola) bangunRuang).hitungVolume());
        
        
        bangunRuang = new Tabung();
        ((Tabung) bangunRuang).setTinggi(21);
        ((Tabung) bangunRuang).setJariJari(10);        
        System.out.println("Hasil : V Tabung\t= " + ((Tabung) bangunRuang).hitungVolume());
        
        bangunRuang = new Kerucut();
        ((Kerucut) bangunRuang).setJariJari(14);
        ((Kerucut) bangunRuang).setTinggi(9);
        System.out.println("Hasil : V Kerucut\t= " +((Kerucut) bangunRuang).hitungVolume() );
    }
    
}
