/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = CapturarTexto("Introduce tu nombre");
        String apellido = CapturarTexto("Introduce tu apellido");
        System.out.println("Tu nombre: " + nombre);
        System.out.println("Tu apellido: " + apellido);
        
        
        int edad = CapturarNumeros("Introduce tu edad:");        
        double salario = CapturarDoble("Introduce tu salario:");
        System.out.println("Tu edad: " + edad);
        System.out.println("Tu salario: " + salario);
        
    }
    
    
    public static String CapturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = captu.nextLine();
        return texto;
    }
    public static int CapturarNumeros(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int edad = captu.nextInt();
        captu.nextLine();
        return edad;
    }
    public static double CapturarDoble(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        double Salario = captu.nextDouble();
        captu.nextLine();
        return Salario;
    }
}
