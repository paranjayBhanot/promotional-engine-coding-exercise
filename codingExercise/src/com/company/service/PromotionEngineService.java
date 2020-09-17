package com.company.service;

import com.company.model.SkuId;

import java.util.List;

/**
 * This is a service class which is used to calculate
 * the final price of the items purchased by the customers
 */
public class PromotionEngineService {

    /**
     * This method takes the user input and provides the final
     * response on the basis of the selected items
     *
     * @param tokens user input
     * @return final response
     */
    public long getInputFromUser(List<String> tokens) {
        SkuId skuId = new SkuId();
        long productA = sizeCalculator("A", tokens);
        long productB = sizeCalculator("B", tokens);
        long productC = sizeCalculator("C", tokens);
        long productD = sizeCalculator("D", tokens);

        long productAPrice = calculateProductA(productA, skuId, skuId.getProductAScheme());
        long productBPrice = calculateProductB(productB, skuId, skuId.getProductBScheme());
        long productCPrice = 0;
        long productDPrice;
        if (productC == productD)
            productDPrice = getSecondPromotionalOffer(productD, skuId);
        else {
            productCPrice = productC * skuId.getC();
            productDPrice = productD * skuId.getD();
        }
        return finalCalculator(productAPrice, productBPrice, productCPrice, productDPrice);
    }

    /**
     * This method calculates the count of the products
     * selected by customer
     *
     * @param product type of product
     * @param tokens user input
     * @return count of product
     */
    private long sizeCalculator(String product, List<String> tokens) {
        return tokens.stream()
                .filter(s -> s.contains(product))
                .count();
    }

    /**
     * This method calculates the price of product 'A'
     *
     * @param productA product purchased by customer
     * @param skuId this contains all the price and promotion information
     * @param productScheme current scheme applicable on product
     * @return final price of product 'A'
     */
    private long calculateProductA(long productA, SkuId skuId, int productScheme) {

        if (productA % productScheme == 0) {
            return (productA / productScheme) * skuId.getFirstPromotionalOffer();
        } else {
            long newProductA;
            if (productA > productScheme) {
                newProductA = productA - productA % productScheme;
                return ((newProductA / productScheme) * skuId.getFirstPromotionalOffer()) + (productA % productScheme * skuId.getA());
            } else {
                return productA % productScheme * skuId.getA();
            }
        }
    }

    /**
     * This method calculates the price of product 'B'
     *
     * @param productB product purchased by customer
     * @param skuId this contains all the price and promotion information
     * @param productScheme current scheme applicable on product
     * @return final price of product 'B'
     */
    private long calculateProductB(long productB, SkuId skuId, int productScheme) {

        if (productB % productScheme == 0) {
            return (productB / productScheme) * skuId.getSecondApplicablePromotion();
        } else {
            long newProductB;
            if (productB > productScheme) {
                newProductB = productB - productB % productScheme;
                return ((newProductB / productScheme) * skuId.getSecondApplicablePromotion()) + (productB % productScheme * skuId.getB());
            } else {
                return productB % productScheme * skuId.getB();
            }
        }
    }

    /**
     * This method calculates the price of promotional offer
     * applied on product 'C' and product 'D'
     *
     * @param productD product purchased by the customer
     * @param skuId this contains all the price and promotion informatio
     * @return final price of second promotional offer
     */
    private long getSecondPromotionalOffer(long productD, SkuId skuId) {
        return productD * skuId.getSecondPromotionalOffer();
    }

    /** This method is used to calculate the final price
     *
     * @param productAPrice total price of product 'A'
     * @param productBPrice total price of product 'B'
     * @param productCPrice total price of product 'C'
     * @param productDPrice total price of product 'D'
     * @return final price of all products
     */
    private long finalCalculator(long productAPrice, long productBPrice, long productCPrice, long productDPrice) {
        return (productAPrice + productBPrice + productCPrice + productDPrice);
    }
}
