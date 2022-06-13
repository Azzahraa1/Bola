
package luas.permukaan.bola;

public class TesBola {
    static double jari;
    
    public static void main(String[] args) {
        Bola h = new Bola();
        h.setJariJari(14);
        
        System.out.println(" Dengan jari jari" + h.getjariJari() + " maka akan diperoleh:");
        System.out.println("diameter bola: " + h.showDiameter());
        System.out.println("Luas permukaan bola :" + h.showLuasPermukaan());
        System.out.println("Volume bola :" + h.showVolume());
        
        System.out.println();
        
        h.setJariJari(20);
        System.out.println("Dengan jari jari" + h.getjariJari() + " maka akan diperoleh:");
        System.out.println("diameter bola: " + h.showDiameter());
        System.out.println("Luas permukaan bola :" + h.showLuasPermukaan());
        System.out.println("Volume bola :" + h.showVolume());
    }
    
}



