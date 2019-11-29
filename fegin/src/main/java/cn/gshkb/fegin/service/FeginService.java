package cn.gshkb.fegin.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service-test" ,fallback = FeginFailback.class)
public interface FeginService {

    @RequestMapping(value = "/test/fegin",method = RequestMethod.GET)
    public String fegin();
}
