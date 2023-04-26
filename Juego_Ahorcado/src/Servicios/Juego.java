
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;


public class Juego {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Ahorcado play = new Ahorcado();

    public void crearJuego() {

        System.out.println("Indica la palabra");
        String palabra = leer.next();
        System.out.println("ahora indique la cantidad de jugadas maximas");
        int max = leer.nextInt();
        char[] vecpalabra = new char[palabra.length()];
        for (int i = 0; i < vecpalabra.length; i++) {
            vecpalabra[i] = palabra.charAt(i);
        }
        play.setJugadasMaximas(max);
        play.setPalabra(vecpalabra);

    }

public int longitud(){
    
    int lonngi = play.getPalabra().length;
 return lonngi;  
}

public boolean buscar(char letra) {
        boolean val = false;
        int enc = play.getLetrasEncontradas();
        char[] palabra = play.getPalabra();
        for (int i = 0; i < palabra.length; i++) {
            if (letra == palabra[i]) {
                val = true;
            }
        }
        if (val == true) {
            play.setLetrasEncontradas(enc + 1);
        }
        return val;
    }


public void intenetos(int cont){
    System.out.println("Le quedan: "+cont+" intentos");
    
}
public void juego() {
       
        int intentos = play.getJugadasMaximas();
        int enc = play.getLetrasEncontradas();
        int faltantes = longitud() - enc;
        do {
            System.out.println("Ingrese letra ");
            char letra = leer.next().charAt(0);
            boolean esta = buscar(letra);
            System.out.println("Longitud de palabra: " + longitud());
            if (esta == true) {
                System.out.println("La letra pertenece a la palabra");
            } else {
                System.out.println("La letra NO pertenece a la palabra!");
                intentos--;
            }
            enc = play.getLetrasEncontradas();
            faltantes = longitud() - enc;
            System.out.println("Número de letras (encontradas, faltantes): (" + enc + "," + faltantes + ")");
            System.out.println("Numero de oportunidades restantes: " + intentos);
        } while (intentos > 0 && enc < longitud());
    }


    
    
}
