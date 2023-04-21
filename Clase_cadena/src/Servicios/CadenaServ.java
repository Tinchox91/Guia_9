
package Servicios;

import Entidades.Cadena;


public class CadenaServ {

  // Cadena f = new Cadena();

    public int vocales(String fra, int longi) {
        int vocal = 0;
        char letra;
        for (int i = 0; i < longi; i++) {
            letra = Character.toLowerCase(fra.charAt(i));//se convierte en minuscula antes de comparar
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocal++;
            }

        }

        return vocal;
    }
public String invertirFrase(String fra, int longi) {
        String fras = "";

        for (int i = longi - 1; i >= 0; i--) {
            fras += String.valueOf(fra.charAt(i));
        }

        return fras;
    }

public int vecesRepetido(String letra,char c){
    int cantidad =0;
    char l ;
    for (int i=0;i<letra.length();i++){
        l=letra.charAt(i);
        if (c==l){
            cantidad ++;
            
        }
    }
        
    return cantidad;
}

public boolean compararLongitud(String letra,String letra2){
    if (letra.length()==letra2.length()){
        return true;
    }else return false;
    
    
}


public String unirFrases(String frase,String frase2){
    String ffinal = frase.concat(frase2);
    
    return ffinal;
}

public String reemplazar(String frase,char letra){
   char l1='a';
  String result= frase.replace(l1,letra);
    
    
    return result;
    
}

    public boolean contiene(String frase, String letra) {
        boolean val = true;
      int bus= frase.indexOf(letra);
      if (bus != -1) {
           val=true;
        } else {
            val=false;
        }
        return val;
    }
    

}

