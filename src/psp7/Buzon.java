package psp7;



/**
 *
 * @author Pablo
 */
public class Buzon {

    public static void main(String[] args) {
      Almacenamiento a = new Almacenamiento();
      Escritura es = new Escritura (a);
      Eliminar el = new Eliminar(a);
      es.start();
    
    }

}
