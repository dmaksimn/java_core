package com.raman.lis.task01.mushynski;

public class Task_2 {

    public static void main(String[] args) {
        int sum=0;
        int fib[]= {0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21};
        for(int i = 0; i < fib.length; i++){
            if(fib[i] > 0 && fib[i]%2 ==0){
                sum += fib[i];

            } if (fib[i] == 8){
                sum -= fib[i];
            }
        }
        System.out.println( sum);
    }
}
