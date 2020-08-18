package mergeSort;

public class MergeSort {

    public static void main(String[]args){
        int[] myNums = {4, 3, 10, 1, 2, 20};

      mergeSorter(myNums, new int[myNums.length], 0, myNums.length-1);
    }

    public static void mergeSorter(int[] mSort, int[]temp, int start, int fend){
        if(start >= fend){
            return;
        }
        else{
            int firstEnd =(start + fend)/2;

            mergeSorter(mSort, temp, start, firstEnd);
            mergeSorter(mSort, temp, firstEnd+1, fend);
            merger(mSort, temp, start, fend);

        }
    }

    public static void merger(int[] arr, int[]temp, int startP, int endP){
        int firstArrayEnd = (startP + endP)/2;
        int secondArrayStart = firstArrayEnd + 1;
        int arrSize = endP - startP+1;

        int lPointer= startP;
        int rPointer= secondArrayStart;
        int tempIndex= lPointer;

        while(lPointer <= firstArrayEnd && rPointer<= endP) {
            if(arr[lPointer] <= arr[rPointer]) {
                temp[tempIndex] = arr[lPointer];
                lPointer++;
                tempIndex++;

            } else {
                temp[tempIndex] = arr[rPointer];
                rPointer++;
                tempIndex++;
            }

        }
        System.arraycopy(arr, lPointer, temp, tempIndex,firstArrayEnd - lPointer+1);
        System.arraycopy(arr, rPointer, temp, tempIndex, endP - rPointer+1);
        System.arraycopy(temp,tempIndex, arr, startP, arrSize);
    }
}
