package com.kodilla.patterns2.decorator.taxiportal;

import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class ChildSeatDecorator extends  AbstractTaxiOrderDecorator {

    // dekorator usługi dodatkowej

    public ChildSeatDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + child seat";
    }

}
