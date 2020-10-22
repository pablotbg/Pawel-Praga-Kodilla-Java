package com.kodilla.stream.forumuser;

public final class ForumUser {

    private final int userID;
    private final String userName;
    private final char sex;
    private final int numberOfPosts;
    private final int yearOfBirthDate;

    public ForumUser(int userID, String userName, char sex, int numberOfPosts, int yearOfBirthDate) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.numberOfPosts = numberOfPosts;
        this.yearOfBirthDate = yearOfBirthDate;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getYearOfBirthDate() {
        return yearOfBirthDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", numberOfPosts=" + numberOfPosts +
                ", yearOfBirthDate=" + yearOfBirthDate +
                '}';
    }
}
