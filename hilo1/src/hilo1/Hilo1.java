/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo1;

import concurrency.MiHilo1;

/**
 *
 * @author PC24
 */
public class Hilo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejemplo1();
    }

    private static void ejemplo1() {
         MiHilo1 hilo1 = new MiHilo1("Hilo 1 ",1);
         MiHilo1 hilo2 = new MiHilo1("Hilo 2 ",1);
         hilo1.start();
         hilo2.start();
         
    }
    
}
