/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

/**
 *
 * @author ayrtonguttier
 */
public class Auxiliar {

    public static Boolean ehDouble(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static double arred(double valor, int decimais) {

        double m = Math.pow(10, decimais);
        double v = valor * m;
        return Math.round(v) / m;
    }

}
