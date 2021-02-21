package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderProcessingWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(com.kodilla.patterns2.facade.api.OrderProcessingWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))"
            + "&& args(order, userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object)  {
        LOGGER.info("Class: " + object.getClass().getName() + ", Args: items " + order.getItems()
        + " userId" + userId);
    }
}
