/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_5_metodos_arreglados;

/**
 *
 * @author invitado
 */
public class EVA3_5_METODOS_ARREGLADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String diasSemana[] = {"Lunes","Martes","Miercoles","Jueves","Viernes"
        ,"Sabado","Domingo"};
        imprimirArreglo(diasSemana);
        
        
        String meses[] = { "Enero","Febrero","Marzo","Abril","Mayo","Junio"
        ,"Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        imprimirArreglo(meses);
        
        
        int billetes[] = {20,50,100,200,500,1000};
        imprimirArreglo(billetes);
        
        
    }
     //Imprimir arreglo de cadenas
    public static void imprimirArreglo(String[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    public static void imprimirArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
}
}
