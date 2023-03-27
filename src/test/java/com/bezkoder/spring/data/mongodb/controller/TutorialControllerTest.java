package com.bezkoder.spring.data.mongodb.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import com.bezkoder.spring.data.mongodb.model.Tutorial;

public class TutorialControllerTest {
    @Test
    void testOnePlusOne() {
        
        //write code that tests if 1 plus 1 is equal to 2
        int result = 1 + 1;
        assertEquals(2, result);
    
    }
    @Test
    void testCreateObject() {
        //write code that tests if you can create an object of type Tutorial
        Tutorial tutorial = new Tutorial();
        assertEquals(Tutorial.class, tutorial.getClass());
    }


}
