
package Inicio;

import Entidades.Persona;
import Persona_Servicie.Servicio;
import java.util.Scanner;

public class Inicio {

   
    public static void main(String[] args) {
        Servicio serv = new Servicio();
        Scanner leer = new Scanner (System.in);
        Persona pers = serv.crear();
        serv.edad();
        
        
        System.out.println(" ingrese la edad a comparar con la edad de "+ pers.getNombre());
        boolean menor= serv.menor(pers, leer.nextInt());
        if (menor == true){
            System.out.println(pers.getNombre()+" es menor  ");
        }else System.out.println(pers.getNombre()+" es mayor");
        
      
        
        
     serv.mostrarPersona(pers);
    }
    
}
