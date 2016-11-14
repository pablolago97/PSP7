package psp7;

import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author Pablo
 */
public class Almacenamiento {

    public Almacenamiento() {
    }
    
    private String mensaje = "";
    public boolean buzonLleno = true;
    public boolean buzonVacio = false;
    private Scanner sc;
    
    
    public synchronized void escribir()throws InterruptedException{
        
        while(buzonLleno == true){
            wait();
        }
        System.out.println("Introduce el mensaje:");
        mensaje = sc.nextLine();
        
        if(!"".equals(mensaje)){
            buzonLleno=true;
            buzonVacio=false;
            notify();
        }
    }
    
    public synchronized void eliminar()throws InterruptedException{
        
        while(buzonVacio == false){
            wait();
        }
        
       mensaje ="";
       System.out.println("Mensaje eliminado con exito");
       
       if("".equals(mensaje)){
           buzonLleno=false;
           buzonVacio=true;
           notify();
           
       }
    }
    
    public synchronized void leer()throws InterruptedException{
        
        while(buzonVacio == true){
            wait();
        }
        
        System.out.println(mensaje);
       
       
    }
}
