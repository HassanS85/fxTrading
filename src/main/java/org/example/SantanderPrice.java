package org.example;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

import java.util.Date;


public class SantanderPrice {

        @CsvBindByPosition(position = 0)
        private String id;

        @CsvBindByPosition(position = 1)
        private String Name;

        @CsvBindByPosition(position = 2)
        private double bid;

        @CsvBindByPosition(position = 3)
        private double ask;

        @CsvBindByPosition(position = 4)
        @CsvDate("dd-MM-yyyy HH:mm:ss:SSS") // format of the date in the csv file
        private Date timestamp;


        //Getters and Setters

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getName() {
                return Name;
        }

        public void setName(String name) {
                Name = name;
        }

        public double getBid() {
                return bid;
        }

        public void setBid(double bid) {
                this.bid = bid;
        }

        public double getAsk() {
                return ask;
        }

        public void setAsk(double ask) {
                this.ask = ask;
        }

        public Date getTimestamp() {
                return timestamp;
        }

        public void setTimestamp(Date timestamp) {
                this.timestamp = timestamp;
        }


}
