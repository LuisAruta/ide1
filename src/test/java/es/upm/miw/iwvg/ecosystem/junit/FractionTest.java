package es.upm.miw.iwvg.ecosystem.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(4,2);
    }

    @Test
    void testDecimal() {
        assertEquals(2, this.fraction.decimal());
    }
}
