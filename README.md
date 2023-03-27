# Spring Boot MongoDB CRUD example - Restful CRUD API

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
    @Test
    void testGetAllTutorials() {
        //write code that tests if you can get all tutorials
        TutorialController tutorialController = new TutorialController();
        ResponseEntity<List<Tutorial>> tutorials = tutorialController.getAllTutorials(null);
        assertEquals(200, tutorials.getStatusCodeValue());
    }
    @Test
    void testGetTutorialById() {
        //write code that tests if you can get a tutorial by id
        TutorialController tutorialController = new TutorialController();
        ResponseEntity<Tutorial> tutorial = tutorialController.getTutorialById("1");
        assertEquals(200, tutorial.getStatusCodeValue());
    }
    @Test
    void testCreateTutorial() {
        //write code that tests if you can create a tutorial
        TutorialController tutorialController = new TutorialController();
        Tutorial tutorial = new Tutorial();
        ResponseEntity<Tutorial> tutorialResponse = tutorialController.createTutorial(tutorial);
        assertEquals(201, tutorialResponse.getStatusCodeValue());
    }
    @Test
    void testUpdateTutorial() {
        //write code that tests if you can update a tutorial
        TutorialController tutorialController = new TutorialController();
        Tutorial tutorial = new Tutorial();
        ResponseEntity<Tutorial> tutorialResponse = tutorialController.updateTutorial("1", tutorial);
        assertEquals(200, tutorialResponse.getStatusCodeValue());
    }

}


## Run Spring Boot application
```
mvn spring-boot:run
```
