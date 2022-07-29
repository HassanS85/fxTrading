

A price handler that reads prices from a CSV file and attempts to change each price by applying a marin adjustment to it.


Presented in Java and Maven.

In this task - Price, consists of unique id, instrument name, bid, ask and timestamp. From the brief for the exercise, I have assumed that 'bid' means the sell price and that 'ask' is the buy price (which is higher than the bid). The market price feed is provided in CSV format line by line for EUR/USD, GBP/USD and EUR/JPY. For example:

106, EUR/USD, 1.1000,1.2000,01-06-2020 12:01:01:001
107, EUR/JPY, 119.60,119.90,01-06-2020 12:01:02:002
108, GBP/USD, 1.2500,1.2560,01-06-2020 12:01:02:002
109, GBP/USD, 1.2499,1.2561,01-06-2020 12:01:02:100
110, EUR/JPY, 119.61,119.91,01-06-2020 12:01:02:110

Each message is a CSV string and the prices are being read from a CSV file
Bid means sell price and ask is the buy price


