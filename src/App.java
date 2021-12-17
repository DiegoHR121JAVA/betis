package src;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
 
        int dni= 18448531;
        letra(dni);

    }
    
    /**
     * 
     * Funcion de tipo void, que nos devuelve por pantalla la letra perteneciente del dni
     * 
     * @param dni variable que se requiere del usuario, para calcular la letra
     * @author Jeremy
     */
   	public static void letra(int dni) {
	
            char letra [] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
            // dni %23 = x  -> x = letra
            int pos=dni%23;
            for (int i = 0; i < letra.length; i++) {
                if( i==pos){
                    System.out.println("La letra del "+ dni + " es " +letra[i]);
                }
            }

        }

    public void añade0 (int dni) {
       int cifras= 0;    
        while(dni!=0){             
                dni = dni/10;         
               cifras++;         
        }

        int [] ceros= new int [8-cifras];
        
        if(dni<cifras){
            Arrays.copyOf(ceros, 0);
        }
    }    
}
