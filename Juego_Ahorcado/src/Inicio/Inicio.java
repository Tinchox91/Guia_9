
package Inicio;

import Servicios.Juego;


public class Inicio {


    public static void main(String[] args) {
        Juego se = new Juego();
        System.out.println("/////*******BIENVENID@ AL JUEGO AHORCADO*******////");
        se.crearJuego();
        se.juego();
       
    }
    
}
