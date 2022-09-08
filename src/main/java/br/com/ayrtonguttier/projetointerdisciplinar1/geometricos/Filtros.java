/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos2d.Objeto2D;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos2d.Quadrado;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos2d.TrianguloRetangulo;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos3d.Cilindro;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos3d.ConeReto;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos3d.Objeto3D;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos3d.Paralelepipedo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ayrtonguttier
 */
public class Filtros {

    public static List<Quadrado> getQuadrados(List<Objeto2D> objetos) {
        List<Quadrado> quadrados = new ArrayList<>(objetos.size());

        for (Objeto2D obj : objetos) {
            if (obj instanceof Quadrado) {
                quadrados.add((Quadrado) obj);
            }
        }

        return quadrados;
    }

    public static List<TrianguloRetangulo> getTriangulos(List<Objeto2D> objetos) {

        List<TrianguloRetangulo> dados = new ArrayList<>(objetos.size());

        for (Objeto2D obj : objetos) {
            if (obj instanceof TrianguloRetangulo) {
                dados.add((TrianguloRetangulo) obj);
            }
        }

        return dados;
    }

    public static List<Cilindro> getCilindros(List<Objeto3D> objetos) {
        List<Cilindro> dados = new ArrayList<>(objetos.size());

        for (Objeto3D obj : objetos) {
            if (obj instanceof Cilindro) {
                dados.add((Cilindro) obj);
            }
        }

        return dados;
    }

    public static List<ConeReto> getCones(List<Objeto3D> objetos) {
        List<ConeReto> dados = new ArrayList<>(objetos.size());

        for (Objeto3D obj : objetos) {
            if (obj instanceof ConeReto) {
                dados.add((ConeReto) obj);
            }
        }

        return dados;
    }

    public static List<Paralelepipedo> getParalelepipedos(List<Objeto3D> objetos) {
        List<Paralelepipedo> dados = new ArrayList<>(objetos.size());

        for (Objeto3D obj : objetos) {
            if (obj instanceof Paralelepipedo) {
                dados.add((Paralelepipedo) obj);
            }
        }

        return dados;
    }

}
