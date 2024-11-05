/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_valor_retorno;

/**
 *
 * @author invitado
 */
public class EVA3_2_VALOR_RETORNO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int resu;
      resu = sumarDosNumeros(5,10);
        System.out.println("RESULATADO = " + resu);
        
        
        sumarDosNumeros(5,10); //EL RESULTADO NO INTERESA
    }
        public static int sumarDosNumeros (int num1, int num2){
        int suma = num1 + num2;
        return suma;
        }
    
}
