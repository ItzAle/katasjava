package com.katasinjava.katas.rpgcombat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    void characterStartsWithCorrectProps(){
        var car1 = new Character();
        Long sut = car1.getHealth();
        assertEquals(1000L, sut);
    }
}