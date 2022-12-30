package com.sltc.soa.client;

import com.sltc.soa.client.stub.CurrencyConversionWs;
import com.sltc.soa.client.stub.CurrencyConversionWsService;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: Thilanka<br/>
 * Date: 12/20/2022<br/>
 * Time: 10:31 PM<br/>
 * To change this template use File | Settings | File Templates.
 */
public class CurrencyConversion {
    public static void main(String[] args) {
        CurrencyConversionWsService currencyConversionWsService = new CurrencyConversionWsService();
        CurrencyConversionWs currencyConversionWs = currencyConversionWsService.getCurrencyConversionWsPort();

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a sourec Currency: ");
        String sourceCurrency= sc.next();

        System.out.print("\nEnter a amount: ");
        int sourceAmount= sc.nextInt();

        System.out.print("\nEnter a target Currency: ");
        String targetCurrency= sc.next();


        double ans = currencyConversionWs.convert(sourceAmount, sourceCurrency, targetCurrency);
        System.out.println(ans);
    }
}