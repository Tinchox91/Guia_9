
package Service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class FechaService {
    
    
   private Date fecha = new Date()  ;
   private Calendar calendario = new GregorianCalendar();//contructor clase calendar
private Scanner leer = new Scanner (System.in);
    public FechaService() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Calendar getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendar calendario) {
        this.calendario = calendario;
    }
  
   
   public Date  fechaNaciento(){
        
     
         System.out.println("ingrese su fecha de nacimiento");
       System.out.println("ingrese el dia ");
       int dia= leer.nextInt();
       
       System.out.println(" ingrese el mes");
       int mes= leer.nextInt()-1;
       System.out.println("ingrese el año");
       int anio= leer.nextInt()-1900;
       
return new Date (anio,mes,dia);
       
   }
public void actual(){
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
    meses[9]= "octubre";
    meses[10]= "noviembre";
    meses[11]= "diciembre";
    System.out.println("La fecha actual es: " + fecha.getDate() + " de " + meses[fecha.getMonth()] + " del " + calendario.get(Calendar.YEAR));
}
public void edad(Date edadd){
    int edad1 = edadd.getYear();
    int anio=fecha.getYear();
    int total = anio - edad1;
    if (fecha.getMonth()> edadd.getMonth()){
        System.out.println(" su edad es : "+total);
    }else System.out.println("su edad es : " +(total-1));
    
 
    
    
}

   
    
}
