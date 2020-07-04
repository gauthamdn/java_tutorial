package Datastructures.algorithms.recurrsion;

public class LinearSearchrecursively {

    public static void main(String[] args){
        int[] sampleArray = {10,12,3,45,1,66,123};

        System.out.println(LinearSearchrecursively(sampleArray,66,0));

    }

    public static int LinearSearchrecursively(int[] A, int x, int i){


            if(i>A.length-1){ // this means x was not found in the array
                return -1;
            }
            else if(A[i]==x){
                return i;
            }
            else
            {
                System.out.println("Index at : "+ i);
                return  LinearSearchrecursively(A,x,i+1);
            }


    }

}
