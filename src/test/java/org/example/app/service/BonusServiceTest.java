package org.example.app.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    public BonusService service;

    @BeforeEach
    void setUp() {
        service = new BonusService();
    }

    @Test
    void getRes() {
        String res = service.getRes(0.1);
        assertEquals("0,01", res);
    }

    @Test
    void getRes_WithInvalidValue() {
        String res = service.getRes(0.0);
        assertEquals("Incorrect value!", res);
    }

    @Test
    void calcBonus() {
       double result = service.calcBonus(100);
       assertEquals(10.0, result);

    }
}