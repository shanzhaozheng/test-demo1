package com.szzii.com.util;

import java.util.concurrent.*;

public class ThreadPool {

    public static ThreadPoolExecutor  threadPoolExecutor = new ThreadPoolExecutor(5, 100, 0L
            , TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new ThreadPoolExecutor.AbortPolicy());
}
