package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.FacebookPublisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User johny = new Millenials("Johny Hash");
        User mike = new YGeneration("Mikey Mo");
        User ginger = new ZGeneration("GingerXXX");

        //When
        String johnyPublish = johny.sharePost();
        System.out.println(johny.getName() + " publish " + johnyPublish);
        String mikePublish = mike.sharePost();
        System.out.println(mike.getName() + " publish " + mikePublish);
        String gingerPublish = ginger.sharePost();
        System.out.println(ginger.getName() + " publish " + gingerPublish);

        //Then
        Assertions.assertEquals("[FacebookPublisher] use Facebook at socialmedia.", johnyPublish);
        Assertions.assertEquals("[SnapchatPublisher] use Snapchat at socialmedia.", mikePublish);
        Assertions.assertEquals("[TwitterPublisher] use Twitter at socialmedia.", gingerPublish);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User mike = new YGeneration("Mikey Mo");

        //When
        String mikePublish = mike.sharePost();
        System.out.println(mike.getName() + " publish " + mikePublish);
        mike.setUseSocialPublisher(new FacebookPublisher());
        mikePublish = mike.sharePost();
        System.out.println(mike.getName() + " now publish " + mikePublish);

        //Then
        Assertions.assertEquals("[FacebookPublisher] use Facebook at socialmedia.", mikePublish);
    }
}
