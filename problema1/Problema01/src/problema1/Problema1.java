/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author josef
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int edad;
        double costo_kilovatio_hora;
        double kilovatios;
        double planilla;
        double descuento;
        double planilla_descuento;
        
        System.out.println("Ingresar edad del usuario");
        edad = entrada.nextInt();
        System.out.println("Ingresar el costo del kilovatio/hora");
        costo_kilovatio_hora = entrada.nextDouble();
        System.out.println("Ingresar el número de kilovatios consumidos "
                + "en el mes");
        kilovatios = entrada.nextDouble();
        
        planilla = costo_kilovatio_hora * kilovatios;
        descuento = planilla * 0.1;  //10%
        planilla_descuento = planilla - descuento;
        
        if (edad > 65) {
            System.out.printf("El valor de su planilla con el 10%% "
                    + "de descuento es: $%.2f\n",
                    planilla_descuento);
        } else {
            System.out.printf("El valor de su planilla es: $%.2f\n",
                    planilla);
        }
        
        
        
    }
    
}
