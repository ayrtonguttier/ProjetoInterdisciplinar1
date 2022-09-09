/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ayrtonguttier.projetointerdisciplinar1.equacoes;

import br.com.ayrtonguttier.projetointerdisciplinar1.Descritivo;
import br.com.ayrtonguttier.projetointerdisciplinar1.Registro;

/**
 *
 * @author ayrtonguttier
 */
public interface Equacao extends Registro, Descritivo {

    double[] calcular();

}
