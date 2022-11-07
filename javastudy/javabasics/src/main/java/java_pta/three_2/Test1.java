package java_pta.three_2;

//6-1 定义一个股票类Stock
//        分数 10
//        作者 张德慧
//        单位 西安邮电大学
//        定义一个名为Stock的股票类，这个类包括：一个名为symbol的字符串数据域表示股票代码。一个名为name的字符串数据域表示股票名称。一个名为previousClosingPrice的double数据域，它存储前一日的股票交易价格。一个名为currentPrice数据域，它存储当前的股票交易价格。创建一个有特定代码和名称的股票的构造方法。一个名为changePercent()方法返回从previousClosingPrice变化到currentPrice的百分比。
//        ###类名为：
//
//        Stock

import java.util.Scanner;
/* 你提交的代码将被嵌入到这里 */
//class Stock{
//    String symbol;
//    String name;
//    double previousClosingPrice;
//    double currentPrice;
//
//    public Stock(String symbol1, String name1) {
//        this.symbol=symbol1;
//        this.name=name1;
//    }
//    double changePercent(){
//        return (currentPrice-previousClosingPrice)/previousClosingPrice;
//    }
//}
class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol1,String name1){
        this.symbol=symbol1;
        this.name=name1;
    }

    double changePercent(){
        return (currentPrice-previousClosingPrice)/previousClosingPrice;
    }
}

public class Test1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol1=input.next();
        String name1=input.next();
        Stock stock = new Stock(symbol1, name1);

        stock.previousClosingPrice = input.nextDouble();

        // Input current price
        stock.currentPrice = input.nextDouble();

        // Display stock info
        System.out.println(stock.name+"price changed: " + stock.changePercent() * 100 + "%");
        input.close();
    }
}
