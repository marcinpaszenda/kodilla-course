package com.kodilla.good.patterns.challenges.Food2Door;

public class OutOfStockException extends IndexOutOfBoundsException {

    public OutOfStockException (final String message) {
        super(message);
    }
}
