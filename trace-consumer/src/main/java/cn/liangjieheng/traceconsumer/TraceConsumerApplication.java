package cn.liangjieheng.traceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TraceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraceConsumerApplication.class, args);
    }

}
