/**
 * @author DAW120
 */
package daw120.clasescanner;
import java.util.Scanner;  // importar paquete
public class ClaseScanner {  // como Clase que es llevará metodos...
public static void main(String[] args) {
       
// Crear objeto teclado:
Scanner teclado = new Scanner(System.in); // la Clase (Scanner) crea el objeto (teclado).
                                // new, será cada pasada y la habilitación de la Entrada:
                                // Scanner(System.in), el metodo que usará la Clase..                        
// Declarar variables a usar:
int nota1;
int nota2;
   
// ENTRADA:
System.out.println("mete primera nota: ");  
int nota1 = teclado.nextFloat();  // la variable anterior definida usará
System.out.println("mete segunda nota: "); 
nota2=teclado.nextFloat();
float resultado=float;
        
// SALIDA:
System.out.println("El resultado es: "+resultado);
    }
}


