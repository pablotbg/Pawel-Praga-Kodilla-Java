package com.kodilla.testing.forum.statistics;

public class CalculatingStatistic {

    int numberUsers;
    int numberPosts;
    int numberComments;
    double averagePostsUser;
    double averageCommentsUser;
    double averageCommentsPost;

    Statistics statistics;

    public CalculatingStatistic(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberUsers = statistics.usersNames().size();
        numberPosts = statistics.postsCount();
        numberComments = statistics.commentsCount();
        if(numberPosts != 0 && numberUsers != 0) {
            averagePostsUser = (numberPosts * 1.0) / numberUsers;
        }

        if(numberUsers != 0) {
            averageCommentsUser = (numberComments * 1.0) / numberUsers;
        }

        if(numberComments != 0) {
            averageCommentsPost = (numberComments * 1.0) / numberPosts;
        }
    }

    public void showStatistics() {
        System.out.println("Statistics of Forum.\n" +
                "Number of users: " + numberUsers + "\n" +
                "Number of posts: " + numberPosts + "\n" +
                "Number od comments: " + numberComments + "\n" +
                "Average posts per user: " + averagePostsUser + "\n" +
                "Average comments per user: " + averageCommentsUser + "\n" +
                "Average comments per post: " + averageCommentsPost);
    }

    public int getNumberUsers() {
        return numberUsers;
    }

    public int getNumberPosts() {
        return numberPosts;
    }

    public int getNumberComments() {
        return numberComments;
    }

    public double getAveragePostsUser() {
        return averagePostsUser;
    }

    public double getAverageCommentsUser() {
        return averageCommentsUser;
    }

    public double getAverageCommentsPost() {
        return averageCommentsPost;
    }
}
