
package Inicio;

import Servicio_Curso.Service;
import java.util.Scanner;



public class Inicio {
    Scanner leer = new Scanner (System.in);

    public static void main(String[] args) {
       Service servicio = new Service();
       String[]  alumnos = new String [5];
       alumnos= servicio.cargarAlumnos();
       servicio.crearCurso(alumnos);
      servicio.mostrar(alumnos);
        System.out.println(" La ganancia semanal es $"+ servicio.calcularGananciaSemanal());
    }
    
    
    
}
