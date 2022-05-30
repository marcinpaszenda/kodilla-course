package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigmacTestSuite {

    @Test
    void testBigmacNew() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("standardBun")
                .sauce("mayoSauce")
                .burgers(3)
                .ingredient("lettuce")
                .ingredient("tomato")
                .ingredient("onion")
                .ingredient("cucumber")
                .build();
        System.out.println(bigmac);
        //When
        String whichBun = bigmac.getBun();
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        String whichSauce = bigmac.getSauce();
        //Then
        assertEquals("standardBun", whichBun);
        assertEquals(3, howManyBurgers);
        assertEquals(4, howManyIngredients);
        assertEquals("mayoSauce", whichSauce);

    }

}
