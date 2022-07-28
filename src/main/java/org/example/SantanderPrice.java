package org.example;

import com.opencsv.bean.CsvBindByPosition;

import java.util.Date;

public class SantanderPrice {

        @CsvBindByPosition(position = 0)
        private String uniqueId;

        @CsvBindByPosition(position = 1)
        private String instrumentName;

        @CsvBindByPosition(position = 2)
        private Double currentBid;

        @CsvBindByPosition(position = 3)
        private Double currentAsk;

        @CsvBindByPosition(position = 4)
        private Date timestamp;


        //  getters, setters, toString
    }

