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
        var char1 = new Character();
        assertEquals(1000L, char1.getHealth());
        assertEquals(1, char1.getLevel());
        assertEquals(true, char1.isAlive());
    }
}