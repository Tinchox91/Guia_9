
package Principal;

import Servicio.ArrayServicio;
import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
        float [] arreglo1 = new float [50];
        float [] arreglo2 = new float [20];
        Scanner leer = new Scanner(System.in);
        ArrayServicio serv = new ArrayServicio();
         boolean val = true;
        do {
            System.out.println("ingrese la opcion");
            System.out.println("1.Inicializar Arreglo 1");
            System.out.println("2.mostrar arreglo ");
            System.out.println("3.ordenar de mayor a menor");
            System.out.println("4.inicializar arreglo 2");
            System.out.println("5.Salir");

            int ope = leer.nextInt();
            String op2 = null;
            switch (ope) {
                case 1:
                    serv.iniciar(arreglo1);
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equals("N") || op2.equals("n")) {
                        val = false;
                    } else {
                        val = true;
                    }
                    break;
                    
                case 2:
                    serv.mostrar(arreglo1);
                    serv.mostrar(arreglo2);
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equals("N") || op2.equals("n")) {
                        val = false;
                    } else {
                        val = true;
                    }
                    break;

                case 3:
                    float [] ordenar = new float[50];
                     
                  ordenar = serv.ordenar(arreglo1);
                   serv.mostrar(ordenar);
                   
                    
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equals("N") || op2.equals("n")) {
                        val = false;
                    } else {
                        val = true;
                    }

                    break;

                case 4:
                    
                  arreglo2= serv.iniciarB(arreglo1, arreglo2);
                   // System.out.println(serv.mostrar(arreglo2));
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equals("N") || op2.equals("n")) {
                        val = false;
                    } else {
                        val = true;
                    }
                    break;

                case 5:
                    val = false;
                    break;
                default:
                    System.out.println("numero invalido!");

            }
        } while (val);
    }

        
    }
    
