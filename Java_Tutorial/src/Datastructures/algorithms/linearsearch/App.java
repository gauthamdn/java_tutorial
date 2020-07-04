package Datastructures.algorithms.linearsearch;

public class App {

    public static void main(String[] args){

        int[] sampleArray = new int[10];
        sampleArray = new int[]{10, 3, 04, 13,11,49,1, 4};

        System.out.println(linearSearch(sampleArray,4));

    }

    public static int linearSearch(int []a, int x){
        int answer = -1;

        for(int i=0;i<a.length ;i++){
            if(a[i]==x){
                answer = i;
            }

        }

        return answer;
    }
}
