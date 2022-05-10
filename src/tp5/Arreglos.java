
package tp5;

public class Arreglos {
    
    
    public static void sumarLista(int [] lista){
        int suma = 0;
        for(int i=0;i<lista.length;i++){
            suma +=lista[i];
        }
        System.out.println(suma);
    }
        
    public static void buscarMayor(int [][] bidimensional){
        int mayor = 0;
        for (int i=0;i<bidimensional.length;i++){
            for(int j=0;j<bidimensional.length;j++){
            
                if(bidimensional [i][j]> mayor){
                    mayor = bidimensional [i][j]; 
                }              
            }
        }
        System.out.println(mayor);
    }
    
    public static void cuentaVocales(String variable){
        int n_vocal = 0;
        char vocales [] = {'a','e','i','o','u'};
        
        for(int i=0;i<variable.length();i++){
            for(int j=0;j<vocales.length;j++){
                if(variable.charAt(i)== vocales[j]){
                    n_vocal++;
                }
            }
        }
        System.out.println(n_vocal);
    }
    
    public static void cuentaCaracter(String palabra, char caracter){
        int n_caracter = 0;
        
        for (int i=0;i<palabra.length();i++){
            if (palabra.charAt(i) == caracter){
                n_caracter ++;
            }
        }
        System.out.println(n_caracter);
    }
    
    
}
