
package Principal;

import Service.FechaService;
import java.util.Date;


public class Inicio {
  
    public static void main(String[] args) {
          FechaService fechaa = new FechaService();
      Date fecha =  fechaa.fechaNaciento();
         fechaa.actual();
         fechaa.edad(fecha);
       
    }
    
}
