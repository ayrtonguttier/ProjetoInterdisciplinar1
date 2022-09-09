/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteArea;

import br.com.ayrtonguttier.projetointerdisciplinar1.equacoes.EquacaoSegundoGrau;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ayrtonguttier
 */
public class TesteEquacaoSegundoGrau {

    private static Stream<Arguments> testeDiscriminanteArguments() {
        return Stream.of(
                Arguments.of(1, 12, -13, 196),
                Arguments.of(2, -16, -18, 400)
        );
    }

    private static Stream<Arguments> testeResultadoArguments() {
        return Stream.of(
                Arguments.of(1, 12, -13, 1, -13),
                Arguments.of(2, -16, -18, 9, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testeDiscriminanteArguments")
    public void testeDiscriminante(double a, double b, double c, double expected) throws Exception {
        EquacaoSegundoGrau eq = new EquacaoSegundoGrau(a, b, c);
        double valorCalculado = eq.calcularDiscriminante();
        assertEquals(expected, valorCalculado);
    }

    @ParameterizedTest
    @MethodSource("testeResultadoArguments")
    public void testeResultado(double a, double b, double c, double expectedA, double expectedB) throws Exception {
        EquacaoSegundoGrau eq = new EquacaoSegundoGrau(a, b, c);

        double[] valorCalculado = eq.calcular();
        assertEquals(expectedA, valorCalculado[0]);
        assertEquals(expectedB, valorCalculado[1]);

    }
}
