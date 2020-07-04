package Datastructures.algorithms.quicksort;

public class QuickSort {

    public static void main(String[] args){

        int[] sampleArray = {21,5,23,556,45,2,44,12,78,3};
        int i =0;
        while(i< sampleArray.length)
        {
            System.out.print(" "+sampleArray[i]);
            i++;
        }


        int[] newarray = quicksort(sampleArray,0,sampleArray.length-1);
        System.out.println("\nSorted array is ");
        i=0;
        while(i< newarray.length)
        {
            System.out.print(" "+newarray[i]);
            i++;
        }

    }

    public static int[] quicksort(int[] a, int start, int end){

        if(start<end){

            int q = partition(a, start,end);
            quicksort(a,start,q-1);
            quicksort(a,q+1,end);
        }

        return a;

    }

    private static int partition(int[] a, int start, int end) {

        int pivot = a[end]; // the last slot is the pivot value
        System.out.println("Pivot is "+ pivot);
        int i = start-1; // in the first iteration i is -1 and it will be incremented along


        for(int j =start ;j<=end-1;j++ ){
            if(a[j]<=pivot){
                i++;
                //swapping the values below
                int ival = a[i];
                int jval = a[j];
                a[i] = jval;
                a[j] = ival;


            }
        }

        // when we exit this loop, we are done bring all values to the left of pivot. Next step would be to put the pivot in the right slot

        int ival = a[i+1];
        a[end] = ival;
        a[i+1] = pivot; // pivot value is placed in the correct slot of the array. Now return the pivot index value

        return i+1;
    }
}
