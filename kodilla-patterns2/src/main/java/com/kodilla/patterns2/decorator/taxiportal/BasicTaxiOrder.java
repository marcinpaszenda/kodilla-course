package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class BasicTaxiOrder implements TaxiOrder {

    //klasa podstawowa (dekorowana) - nazywana jest delegatem

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(5.00);
    }

    @Override
    public String getDescription() {
        return "Drive a course";
    }
}
