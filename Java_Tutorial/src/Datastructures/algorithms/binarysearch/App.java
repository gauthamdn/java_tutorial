package Datastructures.algorithms.binarysearch;

public class App {

    public static void main(String[] args){

        int[] sampleArray = {1,4,5,8,11,14,15,176,177,1898};

        System.out.println(binarySearch(sampleArray,177));

    }

    public static int binarySearch(int[] a,int x){

        int p = 0;
        int r = a.length-1;


        while(p<=r){

            int q = (p+r)/2;
            if(a[q] == x)
                return q;
            else if(a[q]<x)
                p = q+1;
            else
                r = q-1;

        }
        return -1;
    }

}
