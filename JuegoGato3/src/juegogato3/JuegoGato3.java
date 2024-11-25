/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package juegogato3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class JuegoGato3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Realizar un juego de gato o tres en raya
   Scanner captu = new Scanner(System.in);
        int filaUsu;
    int columnaUsu;
    int filaMaquina;
    int columnaMaquina;
    int partida = 0;
    int rejugar;
    int acum1 = 0;
    
   //Iniciar un arreglo
    char arreglo [][] = new char[3][3];
    
        do {
            limpiarArreglo(arreglo);
            acum1 = 0;
        do {
            acum1  = acum1 + 2;
         imprimirArreglo(arreglo);
         do {
                filaUsu = capturarFila("Introduce tu fila");
                columnaUsu = capturarFila("Introduce tu columna");
                if (arreglo[filaUsu][columnaUsu] != '0' && arreglo[filaUsu][columnaUsu] != 'x') {
                break;   
                }
          } while (true);
         arreglo[filaUsu][columnaUsu] = 'x';
         partida = evaluarGanador(arreglo);
         if (partida == 1) {
                System.out.println("Ganaste");
                imprimirArreglo(arreglo);
                break;
         }else if(acum1 >= 9){
                System.out.println("Empate");
                imprimirArreglo(arreglo);
                break;
         }
          do {
                filaMaquina = movimientoMaquinaFila();
                columnaMaquina = movimientoMaquinaColumna();
                if (arreglo[filaMaquina][columnaMaquina] != '0' && arreglo[filaMaquina][columnaMaquina] != 'x') {
                break;   
                }
            } while (true);
         arreglo[filaMaquina][columnaMaquina] = '0';
            
         partida = evaluarGanador(arreglo);
            if (partida == 1) {
                System.out.println("Ganaste");
                imprimirArreglo(arreglo);
            }else if(partida == 2){
                System.out.println("Gano la maquina");
                imprimirArreglo(arreglo);
            }
          } while (partida != 1 && partida != 2);
         System.out.println("Volver a jugar? (si = 1, no = 2)");
            rejugar = captu.nextInt();
        } while (rejugar == 1);
        
    } 
    
    
    public static void imprimirArreglo(char[][] arreglo){
        
     //Imprimir mi arreglo 
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print("[" + arreglo[i][j] + "]");
            }
            System.out.println("");
        }
    }
    public static void limpiarArreglo(char arreglo[][]){
    for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
              arreglo[i][j] = '-';           
            }
            
        }
    }
    
    public static int capturarFila(String mensaje){
   
        //CAPTURAR FILA
    
    int fila;
    Scanner captu = new Scanner(System.in);
        do {
            System.out.println(mensaje);
        fila = captu.nextInt();
        captu.nextLine();
        } while (fila != 0 && fila !=1 && fila !=2);
         return fila;
         
    }
    
        
    public static int movimientoMaquinaFila(){
    
        int fila;
        fila = (int)(Math.random() * 10);
        if (fila <= 3) {
            fila = 0;
        }else if(fila>3 && fila <= 6){
        fila = 1;
        }else{
        fila = 2;
        }
        return fila;
    }
    
    public static int movimientoMaquinaColumna(){
    
        int columna;
        columna = (int)(Math.random()*10);
        if (columna <= 3) {
            columna = 0;
        }else if(columna>3 && columna <= 6){
        columna = 1;
        }else{
        columna = 2;
        }
        return columna;
    }
    
    public static int evaluarGanador(char arreglo[][]){
    
       
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i][0] == 'x' && arreglo[i][1] == 'x' && arreglo[i][2] == 'x') {
                return 1;  
            }
            if (arreglo[0][1] == 'x' && arreglo[1][i] == 'x' && arreglo[2][i] == 'x') {
                return 1;
            }
            if (arreglo[0][0] == 'x' && arreglo[1][1] == 'x' && arreglo[2][2] == 'x') {
                return 1;
            }
            if (arreglo[0][2] == 'x' && arreglo[1][1] == 'x' && arreglo[2][0] == 'x') {
                return 1;
            }
            
            //Evaluar jugadas de la maquina
            if (arreglo[i][0] == '0' && arreglo[i][1] == '0' && arreglo[i][2] == '0') {
                return 2;
            }
            if (arreglo[0][i] == '0' && arreglo[1][i] == '0' && arreglo[2][i] == '0') {
                return 2;
            }
            if (arreglo[0][0] == '0' && arreglo[1][1] == '0' && arreglo[2][2] == '0') {
                return 2;
            }
            if (arreglo[0][2] == '0' && arreglo[1][1] == '0' && arreglo[2][0] == '0') {
                return 2;
           }
        }
        return 0;
    }
    
}
