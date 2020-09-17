package com.company.test;

import com.company.service.PromotionEngineService;
import com.company.utils.Util;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This is a test class which is used to test
 * promotional engine service class functionality
 */

public class PromotionEngineServiceTest {

    Util util = new Util();
    private static final String EXPECTED_MESSAGE = "Final Price should match expected price";

    @Test
    public void singleInputTestForProductABC() {
        PromotionEngineService promotionEngineService = new PromotionEngineService();
        long finalPrice = promotionEngineService.getInputFromUser(util.getTokenScenario1());
        assertEquals(EXPECTED_MESSAGE,100, finalPrice);
    }

    @Test
    public void firstPromotionalOfferTest() {
        PromotionEngineService promotionEngineService = new PromotionEngineService();
        long finalPrice = promotionEngineService.getInputFromUser(util.getTokenScenario2());
        assertEquals(EXPECTED_MESSAGE,370, finalPrice);
    }

    @Test
    public void secondPromotionalOfferTest() {
        PromotionEngineService promotionEngineService = new PromotionEngineService();
        long finalPrice = promotionEngineService.getInputFromUser(util.getTokenScenario3());
        assertEquals(EXPECTED_MESSAGE,280, finalPrice);
    }

}
