import java.util.Scanner;
/*
 * @author: Fernando Huilca, Alison Betancourt y Mateo Simbaña
 */
public class Bidimensional {
    public static void main(String[] args) throws Exception {

        int suma = 0, incremento = 1;
        int arreglo [][] = new int[3][5];

        // Escritura del arreglo
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arreglo[i][j] = incremento;
                incremento++;
                System.out.print(arreglo[i][j] + " "); // Leemos el elemento del arreglo en esa posicion
            }
            System.out.println(); //Realizamos un salto de linea para que se formen las filas
        }

        // Suma de elementos en especifico 
        suma = arreglo[0][2] + arreglo[1][0] + arreglo[1][4];
        System.out.println("La suma de " + arreglo[0][2] + "+" 
                        + arreglo[1][0] + "+" + arreglo[1][4] + " es: " + suma);

        
        // Suma de matrices
        
        /* *
         *  Si se desea sumar matrices, hay que tomar en cuenta que:
         *  1) las matrices tengan la misma dimension (mismo número de filas y de columnas)
         *  Para la suma de matrices se tiene que ir sumando componente por componente en la misma posición
         */

        //Ejemplo de aplicación:

        // Dado las matrices:
        int[][] matrizA= {{3, 3, 3}, {4, 4, 4}, {5, 5, 5}};
        int[][] matrizB = {{6, 6, 6}, {7, 7, 7}, {8, 8, 8}};

        System.out.println("La matriz A es: ");
        imprimirMatriz(matrizA);
        System.out.println("La matriz B es: ");
        imprimirMatriz(matrizB);
        sumaDosMatrices(matrizA,matrizB);



        	//MULTIPLICACION_______________________________________
            /* *
         *  1) El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.
         *  2) El resultado será una nueva matriz con un número de filas igual al número de filas de la primera
         * matriz y un número de columnas igual al número de columnas de la segunda matriz.
         */

        // Matrices de ejemplo
        int[][] matrizA2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrizB2 = {{7, 8}, {9, 10}, {11, 12}};
        System.out.println("Matriz C: ");
        imprimirMatriz(matrizA2);
        System.out.println("Matriz D: ");
        imprimirMatriz(matrizB2);
        // Multiplicar las matrices
        int[][] resultado = multiplicarMatrices(matrizA2, matrizB2);

        // Imprimir el resultado
        System.out.println("Matriz resultante:");
        imprimirMatriz(resultado);


    }

    private static void sumaDosMatrices(int[][] matrizA, int[][] matrizB) {
        if (matrizA.length == matrizB.length && matrizA[0].length == matrizB[0].length){
            int[][] suma = new int[matrizA.length][matrizA[0].length];
            for (int i = 0 ; i < matrizA.length; i++){
                for (int j = 0 ; j < matrizA[0].length; j++){
                    suma[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
            System.out.println("La suma de las matrices: \n" ); imprimirMatriz(suma);
        }
        else {
            System.out.println("ERROR: las matrices no tienen igual dimension por lo que no se pueden sumar");
        }

    }

    private static void imprimirMatriz(int[][] suma) {
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    private static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }
    
}

