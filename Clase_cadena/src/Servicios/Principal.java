
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;


public class Principal {
public static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        CadenaServ  serv= new CadenaServ();
        Cadena frase = new Cadena();
        System.out.println("ingrese cadena de String");
        frase.setFrase(leer.next());
     String fras = frase.getFrase();
     int num= frase.getLongitud();
        System.out.println("ingrese opcion:");
        System.out.println("1.VOCALES");
        System.out.println("2.INVERTIR FRASE");
        System.out.println("3.VECES REPETIDO");
        System.out.println("4.COMPARAR LONGITUD");
        System.out.println("5.UNIR FRASES");
        System.out.println("6.REEMPLAZAR LETRA (A)");
        System.out.println("7.BUSCAR LETRA");
        int op = leer.nextInt();
        switch (op){
            case 1:int cant=serv.vocales(fras, num);
                System.out.println(" contiene "+cant+ " de vocales");
                break;
            case 2:String f=serv.invertirFrase(fras, num);
                System.out.println("la frase invertida es: -"+f+"-");
                break;
            case 3:System.out.println("ingrese la letra a buscar las veces que se repite: ");
                char letra = leer.next().charAt(0);
                int canti =serv.vecesRepetido(fras, letra);
                System.out.println("se repite "+canti+" veces");
                break;
            case 4:System.out.println("ingrese otra cadena para comparar con la cadena "+fras);
            String fras2= leer.next();
            boolean val = serv.compararLongitud(fras, fras2);
            if (val==true){
                System.out.println("SON IGUALES");
                
            }else System.out.println("NO SON IGUALES");
           break;
            case 5:System.out.println("ingrese frase a unir a "+fras);
            fras2=leer.next();
            fras2=serv.unirFrases(fras, fras2);
                System.out.println("la frase quedaria "+fras2);
                break;
            case 6:
                System.out.println("este reemplazara las letras 'a' de la frase "+fras);
                System.out.println("INGRESE LA LETRA POR CUAL REEMPLAZAR");
                char reemp = leer.next().charAt(0);
                  fras2= serv.reemplazar(fras, reemp);
                
                System.out.println(" la frase quedaria \n" + fras2);
                break;
            case 7 : System.out.println(" ingrese la letra a buscar:");
            String let =leer.next();
            boolean vale= serv.contiene(fras, let);
            if (vale) {
            System.out.println("La letra '" + let + "' se encontró  " );
        } else {
            System.out.println("La letra '" + let + "' no se encontró en la frase.");
        }
            

        }
     
     
       
    }
    
}
