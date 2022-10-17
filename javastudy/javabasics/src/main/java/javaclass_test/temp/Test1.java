package javaclass_test.temp;

import java.util.Scanner;

public class Test1{
    public static void main(String[] args) throws ScoreException{
        Scanner sc = new Scanner(System.in);
        int m = 0;
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        for(int i = 0;i < n;i++){
            try{
                m = sc.nextInt();
                if(m < 0 || m > 100)
                    throw new ScoreException("invalid!");
                else{
                    if(m>=60)
                        a++;
                    else
                        b++;
                }
            }
            catch(ScoreException e){
                System.out.println(m + e.toString());
                i = i - 1;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
class ScoreException extends Exception{
    String message;
    public ScoreException(String message){
        this.message = message;
    }
    public String toString(){
        return this.message;
    }
}

