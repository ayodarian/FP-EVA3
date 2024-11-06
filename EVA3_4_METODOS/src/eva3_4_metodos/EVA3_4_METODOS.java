/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_metodos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_4_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(numeroMayor(7,8));
        System.out.println(diasSemana(5));
    }
    
    //VALOR MAS GRANDE ENTRE DOS NUMEROS ENTEROS
    
    public static int numeroMayor(int num1, int num2){
        /*int resu;
        if (num1>num2) {
            resu = num1;
        }else{
            resu = num2;
        }
        return resu;
       */
        if (num1>num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    //Metodo que regrese el dia de la semana en texto
    //(1 al 7) y regresa Lunes, Martes...
    
    public static String diasSemana(int sema){
      /* Scanner captu = new Scanner(System.in);
        System.out.print("Introduce un dia de la semana: ");
        sema = captu.nextInt();
        captu.nextLine();*/
        String lol = "";
        if (sema == 1) {
            lol = "Lunes";
            return lol;
        } else if(sema ==2) {
            lol = "Martes";
            return lol;        }
        else if(sema ==3) {
            lol = "Miercoles";
            return lol;
        }
        else if(sema ==4) {
            lol = "Jueves";
            return lol;
        }
        else if(sema ==5) {
            lol = "Viernes";
            return lol;
        }
        else if(sema ==6) {
            lol = "Sabado";
            return lol;
        }
        else if(sema ==7) {
            lol = "Domingo";
            return lol;
        }
        else if(sema >= 8) {
            lol = "Dia no valido";
            return lol;
           }
        return lol;
    }
    }
