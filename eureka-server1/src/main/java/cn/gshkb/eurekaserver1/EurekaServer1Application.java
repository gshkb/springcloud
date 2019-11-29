package cn.gshkb.eurekaserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer1Application.class, args);
    }

}
