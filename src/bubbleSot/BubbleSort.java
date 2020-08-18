package bubbleSot;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[]args){
 int[] arr= {4, 2, 8, 5, 1, 9};

        bubbleSort(arr);

 for(int i=0; i < arr.length-1; i++){
      System.out.print(arr[i]+ ",");
     //System.out.println("");
 }
    }

    public static void bubbleSort(int[] arrah){
      boolean isSorted = false;
        int lastunSorted = arrah.length-1;
      while(!isSorted){
          isSorted = true;

          for(int i = 0; i < lastunSorted; i++){

              if(arrah[i] > arrah[i+1]){
                  swap(arrah, i, i+1);
                  isSorted= false;
              }

          }
 lastunSorted--;
      }

    }

    public static void swap(int[] arr, int i, int j){
 int temp=arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
    }
}
