      

package tecnicasdeprogramacion;

import java.util.Random;

public class Principal extends MetodosSteve{

    public static void main(String[] args) {
        
        int numIngresado=0;
            do{
        imprimir("ingrese un numero");
        numIngresado=tomarInt();
        if(numIngresado>1){
            numerosRandom(numIngresado);
        }
        }while(numIngresado!=0);

    }

    private static void numerosRandom(int numIngresado) {
        int[]arrayRandom = new int[numIngresado];
        int numGenerados=0;
        
        Random rand = new Random();
        int numRandom = rand.nextInt(numIngresado)+1;
        boolean esIgual=true;
        while(numGenerados<numIngresado)
        {
            while(esIgual==true){
               esIgual=false;
               numRandom = rand.nextInt(numIngresado)+1;
                for (int i = 0; i < numGenerados; i++) {
                    if(arrayRandom[i]==numRandom)
                    {
                     esIgual=true;   
                    }
                }
           } 
          arrayRandom[numGenerados]=numRandom; 
          numGenerados++;
          esIgual=true;
        }
        if(numIngresado%2==0){
            for (int i = 1; i < numIngresado; i=i+2) {
            imprimir("("+arrayRandom[i-1]+","+arrayRandom[i]+")");                    
            }
        }
        else{
            int i=0;
            for ( i = 0; i < numIngresado-3; i=i+2) {
                imprimir("("+arrayRandom[i]+","+arrayRandom[i+1]+")");                    
                }
            imprimir("("+arrayRandom[i]+","+arrayRandom[i+1]+","+arrayRandom[i+2]+")");                    
                
            }
    }
}
