
package Persona_Servicie;

import Entidades.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Servicio {
    
    Persona person = new Persona();
    Scanner leer = new Scanner(System.in);
    public Persona  crear(){
        
        System.out.println(" ingrese nombre");
        String nomb= leer.next();
        person.setNombre(nomb);
        System.out.println("ingrese fecha de nacimiento");
        System.out.println("ingrese el dia ");
       int dia= leer.nextInt();
       
       System.out.println(" ingrese el mes");
       int mes= leer.nextInt()-1;
       System.out.println("ingrese el año");
       int anio= leer.nextInt()-1900;
      
     Date naci =new Date(anio,mes,dia);
         person.setNacimiento(naci);
       
     
     return  person;   
    }
    
    public void  edad (){
       
        Calendar fecha = new GregorianCalendar();
        Date pers= person.getNacimiento();
        int edadd= pers.getYear() ;
                
        int anio= fecha.get(Calendar.YEAR);
        int total= anio  - edadd;
       
         if (fecha.get(Calendar.MONTH)> pers.getMonth()){
         System.out.println("la edad de "+ person.getNombre()+ " es "+(total -1900) );
    }else  System.out.println("la edad de "+ person.getNombre()+ " es "+(total -1901) );
       
        
    }

    public boolean menor(Persona per, int menor) {
        Calendar fecha = new GregorianCalendar();
        Date pers = per.getNacimiento();
        int anio = pers.getYear() + 1900;

        int edad1 = fecha.get(Calendar.YEAR);
        int edad = edad1 - anio;

        menor = 0;
        if (edad > menor) {

            return true;
        } else {
            return false;
        }

    }
    
    public void mostrarPersona(Persona p1){
        String [] meses = new String [12];
        meses[0]= "Enero";
         meses[1]= "febrero";
          meses[2]= "marzo";
           meses[3]= "abril";
            meses[4]= "mayo";
             meses[5]= "junio";
              meses[6]= "julio";
               meses[7]= "agosto";
                meses[8]= "septiembre";
                 meses[9]= "soctubre";
                  meses[10]= "noviembre";
                   meses[11]= "diciembre";
                  Calendar fecha = new GregorianCalendar();
    fecha.setTime(p1.getNacimiento());
    System.out.println("Nombre: " + p1.getNombre() + " Fecha de nacimiento: " + fecha.get(Calendar.DATE) + " de " + meses[fecha.get(Calendar.MONTH)] + " del " + fecha.get(Calendar.YEAR));
}
    
}
