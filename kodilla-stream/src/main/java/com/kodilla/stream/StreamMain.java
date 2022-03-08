package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::devideAByB);


    // 7.1

        System.out.println("\nPoem Beautifier");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("That which does not kill us makes us stronger. Friedrich Nietzsche", text -> "ABC. " + text + " .ABC");
        poemBeautifier.beautify("That which does not kill us makes us stronger. Friedrich Nietzsche", text -> text.toUpperCase());
        poemBeautifier.beautify("That which does not kill us makes us stronger. Friedrich Nietzsche", text -> text.toLowerCase());
        poemBeautifier.beautify("That which does not kill us makes us stronger. Friedrich Nietzsche", text -> "*** " + text + " ***");


    // Stream iterate

        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
