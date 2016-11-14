/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp7;

/**
 *
 * @author plago-bergonpazos
 */
public class Leer extends Thread {
    
    private Almacenamiento almacen;
      
    public Leer(Almacenamiento a) {
        almacen = a ;
    }
    
    @Override
    public void run(){
     
        try {
            almacen.leer();
        } catch (InterruptedException ex) {
            System.out.println("No se pudo leer el mensaje #ERROR");
        }
    }
    
}

