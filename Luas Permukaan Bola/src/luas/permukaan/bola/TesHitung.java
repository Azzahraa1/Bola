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
public class TesHitung {
    public static void main(String[] args) {
        Hitung h = new Hitung();
        h.setJariJari(7);
          
        System.out.println("Dengan jari jari" + h.getJariJari()+ "Maka akan diperoleh");
        System.out.println("diameter bola" + h.showDiameter());
        }
    }

