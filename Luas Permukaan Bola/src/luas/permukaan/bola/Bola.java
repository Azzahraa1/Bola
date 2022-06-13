
package luas.permukaan.bola;

 class Bola {
    private double jariJari;
    
    public void setJariJari(double newJari) {
        this.jariJari = newJari;
        
    }
    
    public double getjariJari(){
        return this.jariJari;
    }
    public double showDiameter(){
        double d = 2 * this.jariJari;
        return d;
    }
    public double showLuasPermukaan(){
        double l = 4* Math.PI *Math.pow(this.jariJari,2);
        return l;
    }
    public double showVolume(){
        double v = 4/3*Math.PI*Math.pow(this.jariJari,3);
        return v;
    }
}
