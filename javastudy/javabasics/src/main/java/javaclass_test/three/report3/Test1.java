package javaclass_test.three.report3;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args){
        int[] num=new int[100000];

        //获取随机数
        for(int i=0;i<100000;i++){
            num[i]=(int)(100000*Math.random());
        }
        int key=(int)(100000*Math.random());
        long startTime1 = System.nanoTime();
        linearSearch(num,key);
        long endTime1 = System.nanoTime();
        long executionTime1 = endTime1-startTime1;
        System.out.println("linearSearch执行时间为"+executionTime1);

        Arrays.sort(num); //直接使用
        //sort(num);

        long startTime2 = System.nanoTime();
        binarySearch(num,key);
        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2-startTime2;
        System.out.println("binarySearch执行时间为"+executionTime2);

    }
    public static int linearSearch(int[] num, int key){
        for (int i=0;i<100000;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }


    //排序
//    public static void sort(int[] num){
//        for(int i=1;i<100000-1;i++){
//            for(int j=i+1;j<100000;j++){
//                if(num[i]>=num[j]){
//                    int t=num[i];
//                    num[i]=num[j];
//                    num[j]=t;
//                }
//            }
//        }
//    }
    public static int binarySearch(int[] num, int key){
        int r=100000-1;
        int l=0;
        int mid;
        while(r>=l){
            mid=(r+l)/2;
            if(num[mid]==key){
                return mid;
            }else if(num[mid]>key){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}
