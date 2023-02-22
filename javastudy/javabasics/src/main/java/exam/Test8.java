package exam;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
            String s=input.nextLine();
            System.out.println("The number of letters inside the string is:" + countLetters(s));



    }

    public static int countLetters(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
