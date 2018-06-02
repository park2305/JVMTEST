package com.jvm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
		System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
		System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");

		testM();

		while(true) {

			System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
			System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
			System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");

			Thread.sleep(5000);

			System.gc();

			System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
			System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
			System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
		}
	}

	public static void testM(){
		Byte[] newObjcet = new Byte[100*1024*1024];
	}
}
