package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void lastLogTest() {
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("Nowy wpis do log.");

        //When
        String lastLog = logger.getLastLog();

        //Then
        Assertions.assertEquals("Nowy wpis do log.", lastLog);
    }

}
