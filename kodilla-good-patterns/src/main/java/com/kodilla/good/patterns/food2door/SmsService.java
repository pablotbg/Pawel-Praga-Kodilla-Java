package com.kodilla.good.patterns.food2door;

public class SmsService implements InformationService {
    @Override
    public void information(User user) {
        System.out.println("Text Message with information about order has been sent to user " + user.getName());
    }
}
