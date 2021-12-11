package simpletest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPythagoras {

    @Test
    @DisplayName("simple execution with valid numbers")
    void valid_numbers(){
        // ARRANGE
        Pythagoras p = new Pythagoras();
        int a = 3;
        int b = 5;

        // ACT
        var result = p.triangle(a, b);

        // ASSERT
        assertEquals(5, result);
    }

    @Test
    @DisplayName("simple execution with valid numbers (2)")
    void valid_numbers_2(){
        // ARRANGE
        Pythagoras p = new Pythagoras();
        int a = 8;
        int b = 100;

        // ACT
        var result = p.triangle(a, b);

        // ASSERT
        assertEquals(100, result);
    }

    @Test
    @DisplayName("simple execution with invalid a")
    void invalid_a(){
        // ARRANGE
        Pythagoras p = new Pythagoras();
        int a = -3;
        int b = 5;

        // ACT
        var result = p.triangle(a, b);

        // ASSERT
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("simple execution with invalid b")
    void invalid_b(){
        // ARRANGE
        Pythagoras p = new Pythagoras();
        int a = 3;
        int b = -5;

        // ACT
        var result = p.triangle(a, b);

        // ASSERT
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("simple execution with invalid a and b")
    void invalid_a_and_b(){
        // ARRANGE
        Pythagoras p = new Pythagoras();
        int a = -3;
        int b = -5;

        // ACT
        var result = p.triangle(a, b);

        // ASSERT
        assertEquals(-1, result);
    }
}
