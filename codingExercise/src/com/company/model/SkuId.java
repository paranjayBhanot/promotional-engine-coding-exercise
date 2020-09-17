package com.company.model;

import com.company.utils.Util;

/**
 * This is a model file which consists of
 * various products and promotional information
 *
 */

public class SkuId {

    private int A = Util.PRICE_A;
    private int B = Util.PRICE_B;
    private int C = Util.PRICE_C;
    private int D = Util.PRICE_D;


    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }

    public int getD() {
        return D;
    }

    public int getFirstPromotionalOffer(){
        return Util.FIRST_PROMOTIONAL_OFFER_VALUE;
    }

    public int getSecondApplicablePromotion(){
        return Util.SECOND_APPLICABLE_PROMOTION_VALUE;
    }

    public int getSecondPromotionalOffer(){
        return Util.SECOND_PROMOTIONAL_OFFER_VALUE;
    }

    public int getProductAScheme(){return Util.PRODUCT_SCHEME_A;}

    public int getProductBScheme(){return Util.PRODUCT_SCHEME_B;}
}
