package com.company.controller;

import com.company.service.PromotionEngineService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromotionEngineController {

    public static void main(String[] args) {

        List<String> tokens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            tokens.add(scanner.next());
        }
        scanner.close();
        PromotionEngineService promotionEngineService = new PromotionEngineService();
        long response = promotionEngineService.getInputFromUser(tokens);
        System.out.println("Final Price is: "+response);
    }
}
