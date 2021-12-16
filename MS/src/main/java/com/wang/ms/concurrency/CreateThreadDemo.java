package com.wang.ms.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreateThreadDemo {

	public static void main(String[] args) {

		Thread method1 = new Thread() {
			@Override
			public void run() {
				log.info("extend Thread");
				super.run();
			}
		};

		method1.start();

		Thread method2 = new Thread(() -> log.info("runable interface"));
		method2.start();

		ExecutorService service = Executors.newSingleThreadExecutor();
		FutureTask<String> ft = new FutureTask<>(new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "pass callable interface";
			}

		});
		service.submit(ft);

		try {
			String result = ft.get();
			log.info(result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}

	}

}
