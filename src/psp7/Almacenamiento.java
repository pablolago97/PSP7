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
    public boolean buzonLleno = false;
    public boolean buzonVacio = true;
    private Scanner sc = new Scanner(System.in);

    public synchronized void escribir() throws InterruptedException {
        
        if(!"".equals(Buzon.mensaje)){
            wait();
        }
        
        System.out.println("Introduce el mensaje:");

        Buzon.mensaje = sc.nextLine();
        System.out.println("El mensaje ' " + mensaje + " ' ha sido introducido.");
        
        notify();   
        new Menu().start();

    }

    public synchronized void eliminar() throws InterruptedException {
        
        if("".equals(Buzon.mensaje)){
            wait();
        }
        
        Buzon.mensaje = "";
        System.out.println("Mensaje eliminado con exito");
        notify();
        new Menu().start();
    }

    public synchronized void leer() throws InterruptedException {

        if ("".equals(Buzon.mensaje)) {
            wait();
        }
        
        System.out.println(Buzon.mensaje);
        notify();
        new Menu().start();
    }
}
