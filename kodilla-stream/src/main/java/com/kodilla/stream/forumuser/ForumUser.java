package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userID;
    private final String userName;
    private final char sex;
    private final int numberOfPosts;
    private final LocalDate birthDate;

    public ForumUser(int userID, String userName, char sex, int numberOfPosts, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.numberOfPosts = numberOfPosts;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", numberOfPosts=" + numberOfPosts +
                ", yearOfBirthDate=" + birthDate +
                '}';
    }
}
