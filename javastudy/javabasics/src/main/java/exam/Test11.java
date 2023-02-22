package exam;

//定义一个股票类

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String symbol1=input.next();
        String name1=input.next();
        Stock stock = new Stock(symbol1,name1);

        stock.previousClosingPrice = input.nextDouble();

        stock.currentPrice=input.nextDouble();

        System.out.println(stock.name + "price changed: " + stock.changePercent() *100 + "%");
        input.close();
    }
}

//补全代码

class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    Stock(String symbol,String name){
        this.symbol=symbol;
        this.name=name;
    }
    double changePercent(){
        return (this.currentPrice -this.previousClosingPrice)/this.previousClosingPrice;
    }
}
