/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_matrices;

/**
 *
 * @author Administrator
 */
public class EVA3_7_MATRICES {

    public static void main(String[] args) {
        int[] arreglo = new int[5]; //arreglo unidimensional
        int[] [] matriz = new int [3] [3]; //hoja de exel
        
        matriz [0] [0] = 100;//primer posicion
        matriz [0] [1] = 200;
        matriz [0] [2] = 300;
        matriz [1] [0] = 400;
        matriz [1] [1] = 500;
        matriz [1] [2] = 600;
        matriz [2] [0] = 700;
        matriz [2] [1] = 800;
        matriz [2] [2] = 900;//ultima posicion
        
        for (int i = 0; i < 3; i++) { //filas --> 1er dimension
            for (int j = 0; j < 3; j++) { //columnas --> 2da dimension
                System.out.println("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
