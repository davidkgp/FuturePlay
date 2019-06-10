package com.java.future.play;

import java.util.concurrent.CompletableFuture;

public class Trigger {

    public static Integer doSomethingAsynch(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return 10;
    }


    public static void main(String[] args) {
        CompletableFuture<Integer> asynchIntOperationFuture= CompletableFuture.supplyAsync(Trigger::doSomethingAsynch);
        CompletableFuture<Integer> intOperationFuture= CompletableFuture.

    }


}
