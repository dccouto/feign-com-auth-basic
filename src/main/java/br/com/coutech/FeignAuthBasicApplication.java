package br.com.coutech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignAuthBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignAuthBasicApplication.class, args);
	}

}
