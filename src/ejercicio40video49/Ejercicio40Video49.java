
package ejercicio40video49;

import java.util.*;
import javax.swing.JOptionPane;

public class Ejercicio40Video49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[],nElementos,aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE ELEMENTOS"));
        
        arreglo = new int[nElementos];
        
        for(int i=0; i < nElementos; i++){
            
            System.out.println((i+1)+". DIGITE UN NUMERO: ");
            arreglo[i] = entrada.nextInt();
        }
        
        for(int i=0; i<(nElementos-1); i++){
            
            for(int j=0; j<(nElementos-1); j++){
                if(arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        
        System.out.println("\nARREGLO ORDENADO EN FORMA CRECIENTE: ");
        for(int i=0; i <nElementos; i++){
            System.out.println(arreglo[i]+" .. ");
        }
        
        System.out.println();
    }
    
}
