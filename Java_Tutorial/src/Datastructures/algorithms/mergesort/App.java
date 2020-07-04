package Datastructures.algorithms.mergesort;

public class App {

    public static void main(String[] args){

        int[] sampleArray = {21,5,23,556,45,2,44,12,78,3};
        int i =0;
        while(i< sampleArray.length)
        {
            System.out.print(" "+sampleArray[i]);
            i++;
        }


        int[] newarray = mergeSort(sampleArray,0,sampleArray.length-1);
        System.out.println("\nSorted array is ");
        i=0;
        while(i< newarray.length)
        {
            System.out.print(" "+newarray[i]);
            i++;
        }

    }

    public static int[] mergeSort(int[] a, int start, int end){

            if(end<=start){
               return a;
            }

            int mid = (start+end)/2;
            mergeSort(a,start,mid);
            mergeSort(a,mid+1, end);
            merge(a,start,mid,end);


        return a;
    }

    private static void merge(int[] a, int start, int mid, int end) {
        int tempArray[] = new int[end-start+1]; // we need +1 to create temparray of same size as given array


        int leftSlot = start; // index counter/starting slot of left side of array
        int rightSlot = mid+1; // index counter/starting slot of right side of array

        int k =0;

        while(leftSlot <=mid && rightSlot <=end){
            if(a[leftSlot]<a[rightSlot]){
                tempArray[k] = a[leftSlot];
                leftSlot++;
            }else{
                tempArray[k] = a[rightSlot];
                rightSlot++;
            }
            k++;
            // this means the above loop is completed so both left and right side of sub array is sorted
            if(leftSlot<=mid){
                //consider the right side was first done sorted
                while(leftSlot<=mid){
                    tempArray[k] = a[leftSlot];
                    leftSlot++;
                    k++;
                }
            }

            if(rightSlot<=end){
                // cosider that the left side was completely sorted before right slot. so copy all the left over right slot elements are copied over
                while(rightSlot<=end){
                    tempArray[k]=a[rightSlot];
                    rightSlot++;
                    k++;
                }
            }

            //copy over the temparray into the original array slots
            for(int i=0;i<tempArray.length;i++){
                a[start+i] = tempArray[i];
            }

        }



    }

}
