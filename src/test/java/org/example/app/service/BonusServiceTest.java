package org.example.app.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    public BonusService service;

    @BeforeEach
    void setUp() {
        service = new BonusService();
    }

    @Test
    @DisplayName("Test sells volume is expected result.")
    void getRes_WithCorrectValue() {
        String res = service.getRes(0.1);
        assertEquals("0,01", res);
    }

    @Test
    @DisplayName("Test sells volume is unexpected result.")
    void getRes_WithInvalidValue() {
        String res = service.getRes(0.0);
        assertEquals("Incorrect value!", res);
    }

    @Test
    @DisplayName("Test calculating of bonus is expected result.")
    void calcBonus_TenProcents() {
       double result = service.calcBonus(100);
       assertEquals(10.0, result);

    }
}
