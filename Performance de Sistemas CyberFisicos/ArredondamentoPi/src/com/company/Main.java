package com.company;

public class Main {

    public static void main(String[] args) {

        double pi = 0.0;

        long t0 = System.nanoTime();

        double n = 1.0;

        for(long i=0; i<5_000_000_000L; ++i){
            pi += n/(2 * i + 1);
            n = -n;
        }

        pi *= 4;

        System.out.println("\nPI = " + pi);

        long d = System.nanoTime() - t0;

        System.out.println("D = "+ d/1e9 + "ms");

    }
}
