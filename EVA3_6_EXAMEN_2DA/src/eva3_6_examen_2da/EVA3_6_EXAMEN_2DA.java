/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_examen_2da;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_6_EXAMEN_2DA {
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
    public static final int EMPATE = 0;
    public static final int GANA = 1;
    public static final int PIERDE = 2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int jugadaUsu;
       int jugadaComp;
       int resuJugada;
        do{
        jugadaUsu = capturarJugada("Introduce tu jugada: "
                + "1 - piedra, 2 - papel, 3 - tijera, 0 - terminar");
        jugadaComp = jugadaComputadora("");
            System.out.println(jugadaComp);
            resuJugada = evaluarJugadas(jugadaUsu, jugadaComp);
            System.out.println(resuJugada);
       } while(jugadaUsu != 0); //Mientras no quiera salir (opcion 0)
        
        
    }
    public static int capturarJugada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int resu = captu.nextInt();
        return resu;
    }//Generar jugada de la computadora
    
    
    public static int jugadaComputadora(String mensaje2){
    int resu;
    double valor = Math.random();
        if ((valor >= 0.3) && (valor < 0.3)) {
            resu = 1;
        }
        else if ((valor >= 0.3) && (valor < 0.6)) {
            resu = 2;
        }
        else{
            resu = 3;
        }
        return resu;
    }
   
    
//EVALUAR JUGADAS: 0-EMPATE 1-GANO 2-PERDIO
    public static int evaluarJugadas(int jugadaU,int jugadaC){
    // posibles combinaciones
        int resu;
        if ((jugadaU == PIEDRA) && jugadaC == PIEDRA){
            resu=EMPATE;
        }else if((jugadaU == PIEDRA) && jugadaC == PAPEL)
            resu=PIERDE;
        else if ((jugadaU == PIEDRA) && jugadaC == TIJERA)
            resu=GANA;
        else if ((jugadaU == PAPEL) && jugadaC == PIEDRA)
            resu=GANA;
        else if ((jugadaU == PAPEL) && jugadaC == PAPEL)
            resu=EMPATE;
        else if ((jugadaU == PAPEL) && jugadaC == TIJERA)
            resu=PIERDE;
        else if ((jugadaU == TIJERA) && jugadaC == PIEDRA)
            resu=PIERDE;
        else if ((jugadaU == TIJERA) && jugadaC == PAPEL)
            resu=GANA;
        else 
            resu=EMPATE;
        return resu;
    }
}

