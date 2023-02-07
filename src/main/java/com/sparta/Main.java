package com.sparta;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("This is bubble sort algorithm");
        Integer[] input={2,1,1,7,6};
        Integer[] resultAscending=SortingAlgorithm.bubbleSortAscending(input);
        for(int i:resultAscending){
            System.out.println(i);
        }


        Integer[] resultDescending=SortingAlgorithm.bubbleSortDescending(input);
        System.out.println("");
        for(int i:resultDescending){
            System.out.println(i);
        }
    }
//        SortingAlgorithm sort=new SortingAlgorithm();
//        System.out.println("Please input a integer")
//        Scanner scanner=new Scanner(System.in);
//        String numbers=scanner.nextLine();
//        Integer[] listNumbers={};
//        char c;
//        for(int i=0;i<numbers.length();i++){
//            c=numbers
//        }
//        sort.bubbleSortAscending(numbers)
//    }


}
