package br.com.ifpe.clienteconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ClienteConsumerApplication {

    public static void main(String[] args) {
	SpringApplication.run(ClienteConsumerApplication.class, args);
    }

}