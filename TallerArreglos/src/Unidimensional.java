import java.util.Scanner;
/*
 * @author: Fernando Huilca, Alison Betancourt y Mateo Simbaña
 */
public class Unidimensional {
    public static void main(String[] args) throws Exception {
        // Vamos a ocupar la clase Scanner para la entrada de información a travez del teclado
        Scanner sc = new Scanner(System.in);

        // Pedir el tamaño del arreglo
        System.out.print("Digite el tamanio del arreglo: ");
        int tamanioArreglo = sc.nextInt(); 
        
        int[] arregloUni;   // Aquí estamos definiendo el arreglo
        arregloUni = new int[tamanioArreglo]; // Aquí estamos creando el arreglo unidimensional 
        
        // Pedir los datos del arreglo (Escritura)
        for (int i = 0; i < tamanioArreglo; i++) {
            System.out.print("Ingrese el valor en la posición " + "[" + i + "]: ");
            int valor = sc.nextInt();
            arregloUni[i] = valor;
        }
        
        System.out.println();
        
        // Visualizar los datos del arreglo (Lectura)
        System.out.println("Datos del arreglo unidimensional");
        for(int i = 0 ; i < tamanioArreglo ; i++){
            System.out.print(arregloUni[i] + " ");
        }
        
        System.out.println();
        
        //Buscar datos del arreglo (Busqueda)
        System.out.print("Digite el dato a buscar: ");
        int dato = sc.nextInt();
        boolean encontrado = false; 

        for (int i = 0; i < arregloUni.length; i++) {
            if (dato == arregloUni[i]){
            System.out.println("El dato fue encontrado: " + dato + " en la posición: " + i + ". ");
            i = arregloUni.length; // Lo igualo al tamanio del arreglo para que el bucle se acabe y no seguir buscando
            encontrado = true; 
            }
        }
        if (!encontrado) {
            System.out.println("El dato NO fue encontrado, no se encuentra dentro del arreglo");
        }

        //Modificar datos del arreglo (Modificacion)
        System.out.print("Ingresar dato a modificar: ");
        dato = sc.nextInt();
        encontrado = false;

        for (int i = 0; i < arregloUni.length; i++) {
            if (dato == arregloUni[i]){
                System.out.println("Ingrese el nuevo numero: ");
                arregloUni[i] = sc.nextInt();
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El numero se modifico exitosamente");
            imprimirArreglo(tamanioArreglo, arregloUni);
        }
        else
            System.out.println("No se encontro el dato a modificar");

        System.out.println();

         //Eliminar datos del arreglo (Eliminacion)
        encontrado = false; 
        System.out.println("Ingresar dato a eliminar: ");
        dato = sc.nextInt();
         for (int i = 0; i < arregloUni.length; i++) {
            if (dato == arregloUni[i]){
            System.out.println("El dato fue encontrado en la posición: " + i + ". ");
            arregloUni[i] = 0; //El cero representa que el dato es nulo  
            System.out.println("El dato fue eliminado exitosamente");
            encontrado = true;
            imprimirArreglo(tamanioArreglo, arregloUni);
            }
    
        }
        if (!encontrado) {
         System.out.println("El dato NO fue encontrado, no se encuentra dentro del arreglo");
        }

    }

    // Metodo que imprime el arreglo
    private static void imprimirArreglo(int tamanioArreglo, int[] arregloUni) {
        System.out.println("Datos del arreglo unidimensional");
        for(int i = 0; i < tamanioArreglo; i++){
            System.out.print(arregloUni[i] + " ");
        }
    }
}
