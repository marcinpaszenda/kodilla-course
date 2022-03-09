package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int idNumber;
    private final String realName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(final int idNumber, final String realName, final char sex, final int yearOfBirth,
                     final int monthOfBirth,final int dayOfBirth, final int numberOfPosts) {
        this.idNumber = idNumber;
        this.realName = realName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getRealName() {
        return realName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", realName='" + realName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
