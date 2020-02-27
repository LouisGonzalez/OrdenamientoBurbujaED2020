package metodoburbuja;

import java.util.Scanner;

/**
 *
 * @author luisGonzalez
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad, dato;
        String ascendente = "";
        String descendente = "";
        System.out.println("Ingrese la cantidad de elementos que desea que tenga su arreglo");
        cantidad = scanner.nextInt();
        int[] arreglo = new int[cantidad];
        for(int i = 0; i < cantidad; i++){
            System.out.println("Ingrese dato");
            dato = scanner.nextInt();
            arreglo[i] = dato;
        }
        //METODO DE ORDENAMIENTO DE MENOR A MAYOR
        for(int i = 0; i < arreglo.length - 1; i++){
            for(int j = 0; j < arreglo.length - 1; j++){
                int aux2 = arreglo[j+1];
                if(arreglo[j] > arreglo[j+1]){
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = aux2;
                }
            }
        }
        for(int i = 0; i < arreglo.length; i++){
            ascendente += arreglo[i]+" - ";
        }
        //METODO DE ORDENAMIENTO DE MAYOR A MENOR
        for(int i = 0; i < arreglo.length - 1; i++){
            for(int j = 0; j < arreglo.length - 1; j++){
                int aux2 = arreglo[j+1];
                if(arreglo[j] < arreglo[j+1]){
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = aux2;
                }
            }
        }
        for(int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
            descendente += arreglo[i]+" - ";
        }
        System.out.println("DE MENOR A MAYOR");
        System.out.println(ascendente);
        System.out.println("DE MAYOR A MENOR");
        System.out.println(descendente);
    }
    
}
