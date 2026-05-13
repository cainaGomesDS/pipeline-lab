package sptech.school.exemplo_actions.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}