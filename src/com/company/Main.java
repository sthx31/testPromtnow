package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        template1();
        template2();
        template3();
    }

    public static void template1() {
        for (int index=0;index<10;index++) {
            for (int i = index; i>0; i--) {
                System.out.print("X");
            }
            System.out.println();
        }

    }

    public static void template2(){
        int total=10;
        int index = 1;
        for(int x=0;x<10;x++){
            for(int i=0;i <total-index;i++){
                System.out.print("0");
            }
            for(int j=index;j > 0;j--){
            System.out.print("X");

        }
        index++;
        System.out.println();
        }
    }

    public static void template3() {
        int total = 9;
        double mid = Math.ceil(total / 2);
        int index = 1;
        for (int i =1;i<total-mid;i++) {
            for (int x = 0; x < 9; x++) {
                if (x < mid-index|| x > mid +index) {
                    System.out.print("0");
                } else {
                    System.out.print("X");
                }

            }
            index++;
    System.out.println();
        }
    }
}
