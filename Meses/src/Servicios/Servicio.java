
package Servicios;

import Entidades.Meses;
import java.util.Scanner;

public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Meses mess  = new Meses();
  public void adivina(){
      
      
      String secret= mess.getMesSecreto();
      String [] ra = new String [mess.getMes().length];
      ra = mess.getMes();
      boolean val=true;
      do {
      System.out.println("Ingrese el mes a adivinar!:\n ");
      String adivina=leer.next().toLowerCase();
    for (int i = 0; i < 11; i++) {
        if (adivina.equals(secret)) {
            System.out.println("Adivinaste!!");
            val=false;
            break;
            
        } else {
            System.out.println("No adivinaste ! intente de nuevo");
           
            break;
            
        }
    }
} while (val);
  }  
    
}
