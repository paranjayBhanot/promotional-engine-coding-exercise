package com.company.utils;

import java.util.Arrays;
import java.util.List;

/**
 * This is a utility file which consists
 * of various product and promotional offers values
 * and test data
 *
 */
public class Util {

    public static final int FIRST_PROMOTIONAL_OFFER_VALUE = 130;
    public static final int SECOND_APPLICABLE_PROMOTION_VALUE = 45;
    public static final int SECOND_PROMOTIONAL_OFFER_VALUE = 30;
    public static final int PRODUCT_SCHEME_A = 3;
    public static final int PRODUCT_SCHEME_B = 2;
    public static final int PRICE_A = 50;
    public static final int PRICE_B = 30;
    public static final int PRICE_C = 20;
    public static final int PRICE_D = 15;

    public List<String> getTokenScenario1(){
        return Arrays.asList("A", "B","C");
    }

    public List<String> getTokenScenario2(){
        return Arrays.asList("A", "A", "A", "A", "A","B", "B", "B","B","B","C");
    }

    public List<String> getTokenScenario3(){
        return Arrays.asList("A", "A", "A","B", "B", "B","B","B","C", "D");
    }
}
