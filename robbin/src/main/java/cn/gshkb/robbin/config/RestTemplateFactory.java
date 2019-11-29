package cn.gshkb.robbin.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * rest单例工厂
 *
 * @author hkb
 * @version v1.0
 * @date 2019-11-23-1:14
 */
//@Configuration
public class RestTemplateFactory {

   // private static RestTemplate instance;

  //  @Bean
  //  @LoadBalanced
    public static RestTemplate build() {
       /* if (null == instance) {
            synchronized (instance) {
                if (null == instance) {
                    instance = new RestTemplate();
                }
            }

        }*/
        return new RestTemplate();
    }
}
