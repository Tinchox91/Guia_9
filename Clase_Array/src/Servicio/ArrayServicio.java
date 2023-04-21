
package Servicio;

import java.util.Arrays;

public class ArrayServicio {
    
    public float[] iniciar(float[] arreglo) {
     
    float valorAleatorio = (float) (Math.random() *10);
    
         for (int i =0;i< arreglo.length;i++){
             valorAleatorio = (float) (Math.random() *10);
             arreglo[i]=valorAleatorio;
         }
            return arreglo;

        }

        public void  mostrar(float [] arreglo){
            System.out.println(Arrays.toString(arreglo));
        } 
       public float[] ordenar(float[] arreglo) {
    Arrays.sort(arreglo);
    float[] arreglo2 = new float[arreglo.length];
    int n = arreglo.length;
    for (int i = 0; i < arreglo.length; i++) {
        arreglo2[i] = arreglo[n - 1];
        n--;
    }
   

    return arreglo2;
}

        public float[]iniciarB (float[] arreglo,float[] arreglo2){        
            Arrays.fill(arreglo2,(float) 0.5 );
           for (int i = 0; i < 10; i++) {
               arreglo2[i]= arreglo[i];
            }
           return arreglo2;
        }
}
