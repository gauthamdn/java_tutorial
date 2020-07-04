package Datastructures.algorithms.recurrsion;

public class App {

    public static void main(String[] args){
        reduceByOne(10);
    }

    public static void reduceByOne(int n){
        System.out.println("waiting for "+ (n-1));
        if(n>0){
            reduceByOne(n-1);
        }
        System.out.println("Done with "+(n-1));
    }

}
