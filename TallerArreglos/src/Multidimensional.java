import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaración de variables
        int floricola [][][] = new int [6][12][4];

        // Escritura de datos
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print("\u001B[32mIngrese el total producido de la flor [" + (i+1) + "] del mes [" + (j+1) + "] del año [" + (k+1) + "]: \u001B[0m");
                    // floricola[i][j][k] = 1;
                    floricola[i][j][k] = sc.nextInt();
                }
            }
        }

        // a) El total mensual de cada tipo de flor durante el primer año
        for (int i = 0 ; i < 6; i++){
            for (int j = 0; j < 12; j++){
                System.out.println("Total del tipo de flor [" + (i+1) + "] del mes [" + (j+1) + "] del año [1]: " + floricola[i][j][0]);
            }
        }

        // b) Total produccion durante el primer anio
        int suma = 0 ;
        for (int i = 0 ; i < 6; i++){
            for (int j = 0; j < 12; j++){
                suma += floricola[i][j][0];
            }
        }
        System.out.println("\u001B[32m\nEl total de produccion durante el primer anio fue: " + suma + " \u001B[0m");
  
        // c) El total de la produccion del tercer tipo de flor a lo largo del ultimo anio
        suma = 0 ;
        for (int i = 0 ; i < 12; i++){
            suma += floricola[2][i][3];
        }
        System.out.println("\u001B[32m \nEl total de la produccion del tercer tipo de flor a lo largo del ultimo anio es: " + suma + "\u001B[0m");
    }
}
