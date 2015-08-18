/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC24
 */
public class MiHilo1 extends Thread{
    private int ini=0;
    private String nombre;

    public MiHilo1(String nombre, int ini) {
        this.nombre = nombre;
        this.ini=ini;
    }

    Random rn = new Random();
    
    public void run()
    {
        while (true) {            
            try {
                Thread.sleep(rn.nextInt(1000));
                
//                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MiHilo1.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println( nombre +(ini++));
        }
    }

    /**
     * @return the ini
     */
    public int getIni() {
        return ini;
    }

    /**
     * @param ini the ini to set
     */
    public void setIni(int ini) {
        this.ini = ini;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
