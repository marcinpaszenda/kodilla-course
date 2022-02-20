package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCounter {

    private Statistics statistics;

    public void calculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public String showStatistics() {
        return "Number of users: " + getUsersQuantity() +
                "\n Number of posts:" + getPostsQuantity() +
                "\n Number of comments:" + getCommentsQuantity() +
                "\n Average posts per user:" + getAveragePostsPerUser() +
                "\n Average comments per user:" + getAverageCommentsPerUser() +
                "\n Average comments per post:" + getAverageCommentsPerPost();

    }



    public List<String> getUsers() {
        return statistics.usersNames();
    }

    public int getUsersQuantity() {
        return statistics.usersNames().size();
    }

    public int getPostsQuantity() {
        return statistics.postsCount();
    }

    public int getCommentsQuantity() {
        return statistics.commentsCount();
    }

    public double getAveragePostsPerUser() {
        return (double) statistics.postsCount() / statistics.usersNames().size();
    }

    public double getAverageCommentsPerUser() {
        return (double) statistics.commentsCount() / statistics.usersNames().size();
    }

    public double getAverageCommentsPerPost() {
        return (double) statistics.commentsCount() / statistics.postsCount();
    }
}
