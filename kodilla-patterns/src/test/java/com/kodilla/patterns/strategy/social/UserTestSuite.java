package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        // Given
        User mike = new Millenials("Mike Kowalsky");
        User bryan = new YGeneration("Bryan Nowak");
        User jescia = new ZGeneration("Jesica Poziomka");

        // When
        String mikeUse = mike.sharePost();
        System.out.println("Mike use: " + mikeUse);
        String bryanUse = bryan.sharePost();
        System.out.println("Bryan use: " + bryanUse);
        String jesicaUse = jescia.sharePost();
        System.out.println("Jesica use: " + jesicaUse);

        // Then
        assertEquals("Facebook", mikeUse);
        assertEquals("Twitter", bryanUse);
        assertEquals("Snapchat", jesicaUse);
    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User mike = new Millenials("Mike Kowalsky");

        // When
        String mikeUse = mike.sharePost();
        System.out.println("Mike use: " + mikeUse);
        mike.setPublishingStrategy(new SnapchatPublisher());
        mikeUse = mike.sharePost();
        System.out.println("Now Mike use: " + mikeUse);

        // Then
        assertEquals("Snapchat", mikeUse);
    }
}
