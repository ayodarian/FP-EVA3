/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fp_eva3_examen;

import java.util.Scanner;

/**
 *
 * @author alfaw
 */
public class FP_EVA3_EXAMEN {

    static Scanner captu = new Scanner(System.in);
    
    public static void main(String[] args) {
        int alumnos = 0;
        System.out.println("Ingrese el numero de alumnos");
        alumnos = capturar();
        
        double[] calificaciones = new double[alumnos];
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingrese la calificacion del estudiante: " + (i + 1));
            calificaciones[i] = capturar();
        }
        
        double prom = promedio(calificaciones);
        System.out.println("El promedio de todos es: " + prom);
        
        double cali = contarCalificacionesMayores(calificaciones,prom);
        double caliMasAlta = obtenerCalificacionMasAlta(calificaciones);
        double caliMasBaja = obtenerCalificacionMasbaja(calificaciones);
        
    }
    
    
    
    public static int capturar(){
       int capturar;
       capturar = captu.nextInt();
       return capturar;
}
    
    
    
    public static double promedio(double[] arr){
        double acum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            acum += arr[i];
            
        }
        return (acum / arr.length);
        }
    
    
    
    public static int contarCalificacionesMayores(double[] arr, double promedio){
    int calificacion = 0, acum = 0;
           for (int i = 0; i < arr.length; i++) {
               if (promedio<=arr[i]) {
                acum = acum + 1;
             }
               
         }
           System.out.println("El numero de calificaciones mayor al promedio es: " + acum);
            return calificacion;
    }
    
    public static double obtenerCalificacionMasAlta(double[] arr){
     double caliMasAlta = 0;
        for (int i = 0; i < arr.length; i++) {
            if (caliMasAlta <= arr[i]) {
                caliMasAlta = arr[i];
            }
        }
        System.out.println("La calificacion mas alta fue: "+caliMasAlta);
        return caliMasAlta;
    }
    
    
    public static double obtenerCalificacionMasbaja(double[] arr){
     double caliMasBaja = arr[0];
     double lol = 0;
        for (int i = 0; i < arr.length; i++) {
            if (caliMasBaja >= arr[i]) {
                caliMasBaja = arr[i];
            }
            
        }
        System.out.println("La calificacion mas baja fue: "+caliMasBaja);
        return lol;
    }
}
    
    

