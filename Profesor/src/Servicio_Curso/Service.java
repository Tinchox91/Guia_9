
package Servicio_Curso;

import Curso_Entidades.Curso;
import java.util.Scanner;

public class Service {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso curso = new Curso();
    public String[] cargarAlumnos(){
        String [] alumnos = new String [6];
        for (int i=0 ; i< 5 ;i++){
            System.out.println("ingrese el nombre del alumno "+ (i+1));
            alumnos[i]=leer.next();
        }
       return alumnos; 
    }
    
    
    public Curso crearCurso(String[]alumnos){
        System.out.println("ingrese nombre del curso");
        curso.setNombreCurso(leer.next());
        System.out.println("ingrese horas al dia");
        curso.setHorasDia(leer.nextInt());
        System.out.println("ingrese dias a la semana");
        curso.setDiasSemana(leer.nextInt());
        System.out.println(" ingrese que turno mañana / tarde");
        String turno= leer.next();
        while (!(turno.equals("mañana") || turno.equals("tarde"))){
            System.out.println(" turno invalido! ingrese de nuevo");
              turno= leer.next();
        }
        curso.setTurno(turno);
        System.out.println("ingrese precio por hora");
        curso.setPrecioHora(leer.nextFloat());
        curso.setAlumnos(alumnos);
        return  curso;
        
    }
    
    public void mostrar (String[]alumnos){
        System.out.println("Nombre deL curso: "+ curso.getNombreCurso());
        System.out.println("Horas al dia: "+curso.getHorasDia());
        System.out.println("Dias a la semana "+curso.getDiasSemana());
        System.out.println("Turno: "+curso.getTurno());
        System.out.println("Precio por hora: $"+curso.getPrecioHora());
        System.out.println(" Los alumnos son los siguientes: ");
        for (int i =0; i<5 ;i++){
            System.out.println((i+1)+ ". "+ alumnos[i]);
        }
    }
   public float calcularGananciaSemanal(){
       int hs= curso.getHorasDia();
       float pr= curso.getPrecioHora();
       int dia= curso.getDiasSemana();
       float total= hs*pr*dia*5;
       
    return total;   
       
   } 
    
}
