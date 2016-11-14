package psp7;



/**
 *
 * @author Pablo
 */
public class Eliminar extends Thread {

    private Almacenamiento almacen;
    
    public Eliminar(Almacenamiento a) {
        almacen = a ;
    }
    
    @Override
    public void run(){
      
        try {
            almacen.eliminar();
        } catch (InterruptedException ex) {
            System.out.println("No se pudo eliminar el mensaje #ERROR");
        }
    }
    
}
