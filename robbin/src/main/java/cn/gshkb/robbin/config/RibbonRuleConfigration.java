package cn.gshkb.robbin.config;

import cn.gshkb.robbin.annotation.ExcludeFromComponentScan;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡
 *
 * @author hkb
 * @version v1.0
 * @date 2019-11-23-14:44
 */
@Configuration
@ExcludeFromComponentScan
public class RibbonRuleConfigration {



    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }
}
