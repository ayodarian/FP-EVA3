/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_metodos;

/**
 *
 * @author invitado
 */
public class EVA3_1_METODOS {
    public static void main(String[] args) {
        //Uso de metodos:
        //Invocacion o llamada
        
        imprimirMensaje ("Hola mundo");
    }
   
    //DECLARACION

    //HEADER (ENCABEZADO)
    //IMPRIMIR UN MENSAJE
    //JAVA: iniciar en minusculas, verbo, siguientes palabras Inician en mayuscula 
    public static void imprimirMensaje(String mensaje){
        System.out.println("Tu mensaje: " + mensaje);
    }
}
