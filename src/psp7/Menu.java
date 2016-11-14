
package psp7;

import java.util.Scanner;

/**
 *
 * @author plago-bergonpazos
 */
public class Menu extends Thread {
    
    private final Almacenamiento a = new Almacenamiento();
    private final  Escritura es = new Escritura(a);
    private final  Eliminar el = new Eliminar(a);
    private final Leer le = new Leer(a);
    
    public void menu(){
        
        String respuesta="";
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué desea hacer?\n\n"+"1)Escribir mensaje\n2)Eliminar mensaje\n3)Leer mensaje");
        respuesta=sc.next();
        
        if("1".equals(respuesta)){
            es.start();
        }else if("2".equals(respuesta)){
            el.start();
        }else if("3".equals(respuesta)){
            le.start();
        }else{
            System.out.println("Elige una respuesta válida");
            menu();
        }
    }
    
    @Override
    public void run(){
        
        menu();
        
    }
    
}
