package com.dam.calculatorMVS;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorMvsApplicationTests {

    @Autowired
    private Calculator calculator;

    @Test
    void contextLoads() {
    }
/* 
    @Test
    public void testSumIncorrecto() {
        assertEquals(7, calculator.sum(2, 3));
    }
*/

}
