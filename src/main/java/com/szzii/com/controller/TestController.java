package com.szzii.com.controller;

import com.szzii.com.util.ThreadPool;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity hello(){
        CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("异步执行完毕");
        }, ThreadPool.threadPoolExecutor);
        return ResponseEntity.ok().body("hello");
    }
}
