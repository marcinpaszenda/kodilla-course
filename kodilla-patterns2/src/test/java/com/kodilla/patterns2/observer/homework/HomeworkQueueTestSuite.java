package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeworkQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        HomeworkQueue studentMartin = new HomeworkQueue("Martin");
        HomeworkQueue studentAndrew = new HomeworkQueue("Andrew");
        HomeworkQueue studentAnthony = new HomeworkQueue("Anthony");
        Mentor mentorTomHardy = new Mentor("Tom Hardy");
        Mentor mentorMikeSpirit = new Mentor("Mike Spirit");
        studentMartin.registerObserver(mentorTomHardy);
        studentAndrew.registerObserver(mentorTomHardy);
        studentAnthony.registerObserver(mentorMikeSpirit);
        //When
        studentMartin.addHomework("Homework no. 24.4");
        studentMartin.addHomework("Homework no. 22.2");
        studentMartin.addHomework("Homework no. 17.1");
        studentAndrew.addHomework("Homework no. 5.6");
        studentAnthony.addHomework("Homework no. 33.1");
        studentAnthony.addHomework("Homework no. 37.4");
        //Then
        assertEquals(4, mentorTomHardy.getUpdateCount());
        assertEquals(2, mentorMikeSpirit.getUpdateCount());
    }
}
