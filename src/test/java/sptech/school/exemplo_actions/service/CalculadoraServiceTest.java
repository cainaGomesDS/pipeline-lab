package sptech.school.exemplo_actions.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    @Test
    void testDividir() {
        CalculadoraService calculadoraService = new CalculadoraService();
        double a = 10;
        double b = 2;
        double expected = 5;

        double resultado = calculadoraService.dividir(a, b);

        assertEquals(expected,resultado);
    }

    @Test
    @DisplayName("Quando acionado com 10 e 0, então deve lançar uma exceção")
    public void testDividirPorZero() {

        CalculadoraService calculadoraService = new CalculadoraService();
        double a = 10;
        double b = 0;
        var expectedMessage = "400 BAD_REQUEST \"Divisão por zero não é permitida\"";

        ResponseStatusException exception = assertThrows(
                ResponseStatusException.class, () -> {

                    // Act
                    calculadoraService.dividir(a, b);
                });

        assertEquals(expectedMessage, exception.getMessage());
    }
}