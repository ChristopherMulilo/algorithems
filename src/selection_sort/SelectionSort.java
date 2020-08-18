package selection_sort;

import java.util.ArrayList;
import java.util.Arrays;

public class  SelectionSort {

    public static void main(String[]args){
  int[] nums = {2, 8, 1, 14, 5};
  sSort(nums);
  for(int num: nums){
      System.out.print(num+" ");
  }
  System.out.print(Arrays.toString(nums));

    }

    public static void sSort(int[] nums)
    {
        for(int i =0; i < nums.length-1; i++) {

            int unsortedIndex =i;

            for(int j = i+1; j < nums.length; j++){
                if(nums[j] < nums[unsortedIndex]){
                    unsortedIndex = j;

                }
            }
            int smallNum = nums[unsortedIndex];
            nums[unsortedIndex]= nums[i];
            nums[i]= smallNum;
        }

    }
}
