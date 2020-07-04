package Datastructures.algorithms.recurrsion;

public class binarySearchRecursively {

    public static void main(String[] args){

        int[] sampleArray = {12,14,16,18,20,21,22,26};
        System.out.println(RecursiveBinarySearch(sampleArray,0,sampleArray.length-1,26));

    }

    public static int RecursiveBinarySearch(int[] A, int p, int r, int x){
        System.out.println("["+p+"..."+r+"]");
        if(p>r)
            return -1;
        else {
            int q = (p + r) / 2;
            if (A[q] == x) return q;
            else if (A[q] > x)
                return RecursiveBinarySearch(A, p,q-1, x);
            else
                return RecursiveBinarySearch(A, q+1,r, x);
        }

    }

}
