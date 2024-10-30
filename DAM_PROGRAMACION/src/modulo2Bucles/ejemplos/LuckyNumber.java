package modulo2Bucles.ejemplos;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        esNumeroDeLaSuerte(numero);
    
    }
    
    public static void esNumeroDeLaSuerte(int numero) {
        int suerte = 0;
        int malaSuerte = 0;

        while (numero > 0) {
            int digito = numero % 10; 
            numero /= 10; 
            
            switch (digito) {
            case 3:
            case 7:
            case 8:
            case 9:
                suerte++;
                System.out.println("contador de suerte " + suerte + " este es el dijito " + digito);
                break;
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                malaSuerte++;
                System.out.println("contador de malaSuerte " + malaSuerte + " este es el dijito " + digito);
                break;
                
            }
        }
if (suerte > malaSuerte) {

System.out.println("El número es un número de la suerte.");
}
else {
System.out.println("El número no es un número de la suerte." );
}
                       
    
}
}
	
