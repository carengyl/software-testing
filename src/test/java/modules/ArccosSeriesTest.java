package modules;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArccosSeriesTest {

    private static final double EPSILON = 1e-6;

    private double arccosSeries(double x) {
        if (Math.abs(x) > 1) {
            return Double.NaN;
        }

        double result = Math.PI / 2 - x;
        double term = x;
        double xSquared = x * x;
        int n = 1;

        while (Math.abs(term) > EPSILON / 100 && n < 1000) {
            term *= xSquared * (2 * n - 1) * (2 * n - 1) / (4 * n * n * (2 * n + 1));
            result -= term;
            n++;
        }

        return result;
    }

    @Test
    void testArccosAtZero() {
        assertEquals(Math.PI / 2, arccosSeries(0), EPSILON);
    }

    @Test
    void testArccosAtOne() {
        assertEquals(0, arccosSeries(1), EPSILON);
    }

    @Test
    void testArccosAtMinusOne() {
        assertEquals(Math.PI, arccosSeries(-1), EPSILON);
    }

    @Test
    void testArccosAtHalf() {
        assertEquals(Math.acos(0.5), arccosSeries(0.5), EPSILON);
    }

    @Test
    void testArccosAtSqrt2Over2() {
        double expected = Math.PI / 4;
        assertEquals(expected, arccosSeries(Math.sqrt(2)/2), EPSILON);
    }

    @Test
    void testArccosAtRandomPoints() {
        double[] testPoints = {0.1, 0.3, 0.7, -0.2, -0.5, -0.8};
        for (double x : testPoints) {
            assertEquals(Math.acos(x), arccosSeries(x), EPSILON);
        }
    }

    @Test
    void testArccosAtBoundary() {
        assertEquals(Math.acos(0.999), arccosSeries(0.999), EPSILON);
        assertEquals(Math.acos(-0.999), arccosSeries(-0.999), EPSILON);
    }

    @Test
    void testArccosOutsideDomain() {
        assertTrue(Double.isNaN(arccosSeries(1.1)));
        assertTrue(Double.isNaN(arccosSeries(-1.1)));
        assertTrue(Double.isNaN(arccosSeries(2)));
        assertTrue(Double.isNaN(arccosSeries(Double.NaN)));
        assertTrue(Double.isNaN(arccosSeries(Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(arccosSeries(Double.NEGATIVE_INFINITY)));
    }

    @Test
    void testPrecisionAcrossDomain() {
        for (double x = -0.99; x <= 0.99; x += 0.01) {
            assertEquals(Math.acos(x), arccosSeries(x), 10 * EPSILON);
        }
    }
}