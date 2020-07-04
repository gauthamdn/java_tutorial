package Datastructures.algorithms.selectionsort;

public class SelectionSort {
    public static void main(String[] args){

        int[] sampleArray = {21,5,23,556,45,2,44,12,78,3};
        int i =0;
        while(i< sampleArray.length)
        {
            System.out.print(" "+sampleArray[i]);
            i++;
        }


        int[] newarray = selectionSort(sampleArray);
        System.out.println("Sorted array is ");
        i=0;
        while(i< newarray.length)
        {
            System.out.print(" "+newarray[i]);
            i++;
        }


    }

    public static int[] selectionSort(int[] a){
        int min = 0;

        for(int i=0; i<a.length-1;i++){
            min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }

             int temp = a[i];
             a[i] = a[min];
             a[min]= temp;
            }

        }

        return a;
    }

}
