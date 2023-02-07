package com.sparta;

import java.lang.reflect.Array;

public class SortingAlgorithm {
    public static Integer[] bubbleSortAscending(Integer[] numbersList){
        int numofNumbers=numbersList.length;
        int dummy;
        int n1;
        int n2;
        boolean sorted=false;
        boolean swapped;
        while(sorted==false){
            swapped=false;
            for(int movingIndex=1;movingIndex<numofNumbers;movingIndex++){
                n1=numbersList[movingIndex-1];
                n2=numbersList[movingIndex];
                if (n2<n1){
                    dummy=n2;
                    numbersList[movingIndex-1]=dummy;
                    numbersList[movingIndex]=n1;
                    swapped=true;
                }
        }
            if(swapped==false){
                sorted=true;
            }


        }
return numbersList;
    }

    public static Integer[] bubbleSortDescending(Integer[] numbersList){
        int numofNumbers=numbersList.length;
        int dummy;
        int n1;
        int n2;
        boolean sorted=false;
        boolean swapped;
        while(sorted==false){
            swapped=false;
            for(int movingIndex=1;movingIndex<numofNumbers;movingIndex++){
                n1=numbersList[movingIndex-1];
                n2=numbersList[movingIndex];
                if (n2>n1){
                    dummy=n2;
                    numbersList[movingIndex-1]=dummy;
                    numbersList[movingIndex]=n1;
                    swapped=true;
                }
            }
            if(swapped==false){
                sorted=true;
            }


        }
        return numbersList;
    }
}
