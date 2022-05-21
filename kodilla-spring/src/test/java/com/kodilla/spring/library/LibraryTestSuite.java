package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class LibraryTestSuite {

    // Adnotacji @Autowired możesz także używać w klasie z testami. Jeżeli zamienimy
    // wyciąganie beanów przez metodę getBean(), dodając odpowiednie pole do naszej
    // klasy z adnotacją @Autowired, to znacznie zredukujemy kod w sekcjach Given
    // naszych testów.

    @Autowired
    private Library library;

    @Test
    public void testLoadFromDb() {

        // Given
        // When
        library.loadFromDb();
        // Then
        // do nothing
    }

    @Test
    public void testSaveToDb() {

        //Given
        // When
        library.saveToDb();
        // Then
        // do nothing
    }






    /*


    @Test
    void testLoadFromDb() {

        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);

        // When
        library.loadFromDb();

        // Then
        // do nothing
    }

    @Test
    void testSaveToDb() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);

        //When
        library.saveToDb();

        //Then
        // do nothing
    }
    */

}
