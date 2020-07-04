package Datastructures.algorithms.insertionsort;

public class App {

    public static void main(String[] args){

        int[] sampleArray = {21,5,23,556,45,2,44,12,78,3};
        int i =0;
        while(i< sampleArray.length)
        {
            System.out.print(" "+sampleArray[i]);
            i++;
        }


        int[] newarray = insertionSort(sampleArray);
        System.out.println("\nSorted array is ");
        i=0;
        while(i< newarray.length)
        {
            System.out.print(" "+newarray[i]);
            i++;
        }

    }

    public static int[] insertionSort(int[] a){

        for(int i = 1; i<=a.length-1;i++){

            int element = a[i];
            int j=i-1;

            while(j>=0 && a[j]>element){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element;
            //element = a[j+1];

        }

        return a;
    }
}
