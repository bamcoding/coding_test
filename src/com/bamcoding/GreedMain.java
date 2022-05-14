package com.bamcoding;

import java.util.Scanner;

//문제 설명
//        어떤 가게의 욕심쟁이 점원은 거스름돈을 나눠줄때 거스름돈의 개수를 적게해서 주고자 한다.
//        거스름돈을 입력 받아 점원이 줄 수 있는 최소 거스름돈의 개수를 출력하시오.
//        예를 들어 54520원인 경우,
//        거스름돈으로 50000원권 1장, 1000원권 4장, 500원 1개, 10원 2개 해서 총 8개이다.
//        현재 우리나라가 사용하고 있는 1원, 10원 50원 100원 500원 1,000원 5,000원 10,000원 50,000원 권 화폐를 사용한다.
//
//        입력
//        거스름돈 n이 입력된다. ( n은10이상의  int 범위 )
//
//        출력
//        최소 거스름돈의 개수를 출력한다.
//
//        입출력 예
//        [입력 예]
//        1260
//
//        [출력 예]
//        5
public class GreedMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        //greed1(1000-money);

        greed2(money);
    }

    static void greed2(int money){

    }

    static void greed1(int money){
        int count = 0;
//        if(50000<=money){
//            count = count + (money / 50000);
//            money = money % 50000;
//        }
//
//        if(10000<=money){
//            count = count + (money / 10000);
//            money = money % 10000;
//        }
//
//        if(5000<=money){
//            count = count + (money / 5000);
//            money = money % 5000;
//        }

//        if(1000<=money){
//            count = count + (money / 1000);
//            money = money % 1000;
//        }

        if(500<=money){
            count = count + (money / 500);
            money = money % 500;
        }

        if(100<=money){
            count = count + (money / 100);
            money = money % 100;
        }

        if(50<=money){
            count = count + (money / 50);
            money = money % 50;
        }

        if(10<=money){
            count = count + (money / 10);
            money = money % 10;
        }

        if(5<=money){
            count = count + (money / 5);
            money = money % 5;
        }

        if(1<=money){
            count = count + (money / 1);
            money = money % 1;
        }

        System.out.println(count);
    }
}
