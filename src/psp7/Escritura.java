package psp7;


/**
 *
 * @author Pablo
 */
public class Escritura extends Thread {
    
    Almacenamiento almacen;
    

    public Escritura(Almacenamiento a) {
        almacen = a;
    }
    
    
    @Override
   public void run(){
      
        try {
            almacen.escribir();            
        } catch (InterruptedException ex) {
             System.out.println("No se pudo ejecutar la escritora #ERROR");
        
       }
    }
    
}
