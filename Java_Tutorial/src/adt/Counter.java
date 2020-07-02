package adt;

public class Counter {
    String name = null;
    private int value = 0;

    private void doSomething(){
        String a;
    }

    public Counter(String str) {
        this.name = str;
    }

    public void increment(){
        value++;
    }
    public int getCurrentValue(){
        return value;
    }
    public String toString(){
        return name+ ": "+ value ;
    }
}
