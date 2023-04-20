package Inicio;

import Entidad.ParDeNumeros;
import ServicioNum.Num_Servicio;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        Num_Servicio serv = new Num_Servicio();
        ParDeNumeros n = new ParDeNumeros();
        Scanner leer = new Scanner(System.in);
        boolean val = true;
        do {
            System.out.println("ingrese la opcion");
            System.out.println("1.Mostrar Valores");
            System.out.println("2.Devolver Mayor ");
            System.out.println("3.Calcular Potencia");
            System.out.println("4.Calcular Raiz");
            System.out.println("5.Salir");

            int ope = leer.nextInt();
            String op2;
            switch (ope) {
                case 1:
                    serv.mostrarNum(n.getNum1(), n.getNum2());
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equals("N") || op2.equals("n")) {
                        val = false;
                    } else {
                        val = true;
                    }
                    break;
                case 2:
                    float mayor = serv.mayor(n.getNum1(), n.getNum2());
                    System.out.println(" El mayor es: " + mayor);
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equals("N") || op2.equals("n")) {
                        val = false;
                    } else {
                        val = true;
                    }
                    break;
                case 3:
                    int potencia = serv.potencia(n.getNum1(), n.getNum2());
                    System.out.println(potencia);
                    System.out.println("desea continuar? S/N");
                    op2 = leer.next();
                    if (op2.equals("N") || op2.equals("n")) {
                        val = false;
                    } else {
                        val = true;
                    }

                    break;
                case 4:
                    System.out.println("la raiz del menor de los valores es: " + serv.raiz(n.getNum1(), n.getNum2()));
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
