package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {


    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("To do list");
        board.getInProgressList().getTasks().add("In progress list");
        board.getDoneList().getTasks().add("Done list");

        String toDoListResult = board.getToDoList().getTasks().get(0);
        String inProgressListResult = board.getInProgressList().getTasks().get(0);
        String doneListResult = board.getDoneList().getTasks().get(0);

        //Then
        assertEquals(toDoListResult, "To do list");
        assertEquals(inProgressListResult, "In progress list");
        assertEquals(doneListResult, "Done list");

    }

    @Test
    void testContext() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When & Then
        System.out.println("===== Beans list: ====>>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");

    }

}
