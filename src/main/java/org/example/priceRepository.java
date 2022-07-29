package org.example;


import java.util.ArrayList;
import java.util.List;


public interface priceRepository {
    // I will need to store these prices in a list which contains all prices as there is not currently anywhere to store them

    static List<SantanderPrice> allPrices = new ArrayList<>();

    public List<SantanderPrice> findAll();  //return all prices

    public SantanderPrice getLatest(); //return the latest price

    public List<SantanderPrice> findAllPricesByNameValue(String name); //return all prices of a currency


}