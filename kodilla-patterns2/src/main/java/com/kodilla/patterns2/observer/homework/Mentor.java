package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(mentorName + ": New homework from " + homeworkQueue.getStudentName() + "\n" +
        "(total numbers of homework: " + homeworkQueue.getHomeworks().size() + ")");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
