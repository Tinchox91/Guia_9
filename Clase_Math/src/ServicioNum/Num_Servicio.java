
package ServicioNum;

import Entidad.ParDeNumeros;

public class Num_Servicio {
    ParDeNumeros nums = new ParDeNumeros();
    public void mostrarNum(float n1,float n2){
        System.out.println("los numeros son: ");
        System.out.println(" el numero 1 es: "+n1);
        System.out.println(" el numero 2 es: "+n2);
    }
    
    public float mayor(float n1,float n2){
        float mayor = Math.max(n1,n2);
        
        return mayor;
    }
    
    public int potencia(float n1,float n2){
       float n11= Math.round(n1);
        float n22 =Math.round(n2);
        int total= (int) Math.pow(n11, n22);
        return total;
    }
     
    
    public double raiz(float n1,float n2){
        float menor = Math.min(n1, n2);
        double total= Math.sqrt(menor);
        return total;
    }
    
    
}
