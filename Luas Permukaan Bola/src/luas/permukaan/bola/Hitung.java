/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas.permukaan.bola;

/**
 *
 * @author HP-MC
 */
public class Hitung {
    private double jariJari;

    public void setJariJari(double newJari){
        this.jariJari = newJari;
    }

    private double getJariJari(){
        return this.jariJari;
    }

    private double showDiamater() {
        double d;
        d = 2 * jariJari;
        return d;
    }
    public double showLuasPermukaan() {
        double l = 4 * Math.PI * Math.pow(this.jariJari,2);
        return l;
    }
    public double showVolume() {
        double v = 4/3 * Math.PI * Math.pow(this.jariJari,3);
        return v;
}
}
