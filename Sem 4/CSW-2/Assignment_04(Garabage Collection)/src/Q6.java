// Write a memory-intensive program which creates a lot of objects. Try G1 collector on this
// program. Print timestamp and heap size. Use the following commands to print the heap size
// and free space

//G1 Garbage collector or know as Garbage First is one of the garbage collector (G1) is introduced in Java 7 but Currently
//Became the deafault Garbage Collector after Java 9 . Those are the traditonal GC like Mark-SWEEP CMS and Parallel Collector

//To calculate the start time for a particular :
//Long starttime = System.currentTimeMillis();

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        ArrayList<Object> arr = new ArrayList<>();
        System.out.println(starttime);
        for (long i = 0; i < 100000000; i++) {
            arr.add(new Object());
            if (i%100000000 ==0) {
                System.out.println(Runtime.getRuntime().totalMemory());
            }
        }
       System.out.println(System.currentTimeMillis()); 
   } 
}
