/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TesteArea;

import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ayrtonguttier
 */
public class Teste {

    public Teste() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testeAreaBase() throws Exception {
        ConeReto cone = new ConeReto(1, 1, 1, 6, 8);
        double resultado = arredondar(cone.calcularArea(), 2);
        double esperado = arredondar(36 * Math.PI, 2);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testeVolume() throws Exception {
        ConeReto cone = new ConeReto(1, 1, 1, 6, 8);
        double area = arredondar(cone.calcularVolume(), 2);

        double esperado = arredondar(96 * Math.PI, 2);

        assertEquals(esperado, area);
    }

    private double arredondar(double valor, int decimais) {

        double m = Math.pow(10, decimais);

        return Math.round(valor * m) / m;

    }

}
