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

    public static Boolean ehFloat(String valor) {
        try {            
            Float.parseFloat(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
